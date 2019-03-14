package demo01;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Demo01Main {

    @Test
    public void test01() {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Demo01Main.class);
        System.out.println("finish");

    }

    @Test
    public void test02() {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Demo01Main.class);
        ctx.start();
        System.out.println("finish");

    }

}
