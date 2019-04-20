package demo05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {

    @Autowired
    private TestBean self;

    public void hello() {
        System.out.println("hello");
        self.hi();
    }

    public void hi() {
        System.out.println("hi");
    }

}
