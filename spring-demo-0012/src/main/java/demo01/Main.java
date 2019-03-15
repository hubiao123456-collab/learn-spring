package demo01;

import demo02.TestAspect;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Main {

    // 让切面类生成bean，以让切面生效
    @Bean
    public TestAspect testAspect() {
        return new TestAspect();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        TestBean testBean = ctx.getBean(TestBean.class);
        testBean.hello();
    }

}
