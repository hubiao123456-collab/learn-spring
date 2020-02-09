package demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class Demo003 {

	@Bean
	@Qualifier("letian")
	public String letian() {
		return "letian";
	}


	@Bean
	@Qualifier("letian2")
	public String letian2() {
		String letian = letian();
		return letian + "2";
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Demo003.class);
		SayHello sayHello = (SayHello) ctx.getBean("sayHello");
		System.out.println(sayHello.sayHello("world"));
	}

}
