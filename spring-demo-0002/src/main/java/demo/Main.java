package demo;

import demo.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Person ltt = (Person) ctx.getBean("ltt");
        System.out.println(ltt);
    }

}
