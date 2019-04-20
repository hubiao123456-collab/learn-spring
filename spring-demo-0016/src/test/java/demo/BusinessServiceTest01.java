package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class BusinessServiceTest01 {

    @Autowired
    private BusinessService businessService;

    @Test
    public void testHello() {
        // 取出真实的 httpService
        HttpService realHttpService = (HttpService) ReflectionTestUtils.getField(businessService, "httpService");

        // 生成 HttpService 的 mock 对象，替换掉 businessService 的真实对象
        HttpService mockHttpService = Mockito.mock(HttpService.class);
        ReflectionTestUtils.setField(businessService, "httpService", mockHttpService);

        // 给 mock 对象打桩
        Mockito.when(mockHttpService.queryStatus()).thenReturn(0);

        // 测试
        Assert.assertEquals("你好", businessService.hello());  // 永远都返回 "你好"

        // 恢复真实的 httpService
        ReflectionTestUtils.setField(businessService, "httpService", realHttpService);
    }

}
