package demo04;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

    public void hello() {
        System.out.println("hello");
        TestBean self = (TestBean) AopContext.currentProxy();
        self.hi();
    }

    public void hi() {
        System.out.println("hi");
    }
}
