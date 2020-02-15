package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo.bean")
public class Main {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(Main.class);
	}

}
