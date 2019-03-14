package demo02;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Demo02Main {

    @Test
    public void test01() {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Demo02Main.class);
        System.out.println("finish");

    }

}
