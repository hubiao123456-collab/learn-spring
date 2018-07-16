package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        SayHello sayHello = (SayHello) ctx.getBean("sayHello");
        System.out.println(sayHello.sayHello("world"));
    }

}
