package demo;

import demo.bean.Boss;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Boss boss = (Boss) ctx.getBean("boss");
        System.out.println(boss);
    }

}
