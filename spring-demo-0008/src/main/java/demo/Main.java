package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void useXml() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Calculate calculate = (Calculate) ctx.getBean(Calculate.class);
        System.out.println(calculate.add(1,2));
    }

    public static void useAnnotation() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculate calculate = (Calculate) ctx.getBean(Calculate.class);
        System.out.println(calculate.add(1,2));
    }

    public static void main(String[] args) {

        useXml();
        useAnnotation();

    }

}
