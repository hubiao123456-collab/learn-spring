package demo03;

import org.springframework.stereotype.Component;

@Component
public class TestBean {

    public void hello(){
        System.out.println("hello");
        hi();
    }

    public void hi() {
        System.out.println("hi");
    }

}
