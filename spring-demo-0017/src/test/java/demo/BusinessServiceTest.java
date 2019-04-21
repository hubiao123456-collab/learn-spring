package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(PowerMockRunner.class)                             // 必选
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)     // 必选
@PrepareForTest({HttpService.class})                        // 必选
@ContextConfiguration(classes=AppConfig.class)
public class BusinessServiceTest {

    @Autowired
    private BusinessService businessService;

    @Test
    public void testHello() {

        PowerMockito.mockStatic(HttpService.class);         // 必选

        // 打桩
        Mockito.when(HttpService.queryStatus()).thenReturn(0);

        // 测试
        Assert.assertEquals("你好", businessService.hello());  // 永远都返回 "你好"
    }

}
