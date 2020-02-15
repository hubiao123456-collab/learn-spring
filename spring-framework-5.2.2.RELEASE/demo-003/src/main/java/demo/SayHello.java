package demo;

import org.springframework.stereotype.Component;

@Component
public class SayHello {

	public SayHello() {
		System.out.println("init SayHello");
	}

	public String sayHello(String name) {
		return "Hello, " + name;
	}

}
