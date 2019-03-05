package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class CalculateTestV2 {

    @Autowired
    private Calculate calculate;

    @Test
    public void test() {
        Assert.assertEquals(3, calculate.add(1, 2));
    }

}
