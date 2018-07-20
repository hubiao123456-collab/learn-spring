package demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Demo06App  implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo06App.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is " + getClass().getSimpleName());
    }
}