package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = "demo")
public class Demo002 {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Demo002.class);
		SayHello sayHello = (SayHello) ctx.getBean("sayHello");
		System.out.println(sayHello.sayHello("world"));
	}

}
