package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BusinessService businessService = applicationContext.getBean(BusinessService.class);
        System.out.println(businessService.hello()); // 输出"你好"，或者"Hello"

    }
}
