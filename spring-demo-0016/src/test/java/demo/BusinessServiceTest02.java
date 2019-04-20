package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class BusinessServiceTest02 {

    @InjectMocks
    @Autowired
    private BusinessService businessService;

    @Mock
    private HttpService mockHttpService;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testHello() {
        // 给 mock 对象打桩
        Mockito.when(mockHttpService.queryStatus()).thenReturn(0);
        // 测试
        Assert.assertEquals("你好", businessService.hello());  // 永远都返回 "你好"
    }

}
