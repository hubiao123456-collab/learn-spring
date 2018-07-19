package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class Demo03Application implements CommandLineRunner {
    @Autowired
    private SayHello sayHello;

    public static void main(String[] args) {
        SpringApplication.run(Demo03Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is Demo03Application");
        System.out.println(sayHello.sayHello("World"));
    }

}