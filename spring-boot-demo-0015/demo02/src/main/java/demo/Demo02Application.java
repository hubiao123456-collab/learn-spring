package demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo02Application implements CommandLineRunner {

    @Autowired
    private SayHello sayHello;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("result: " + sayHello.hi("World"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo02Application.class, args);
    }

}