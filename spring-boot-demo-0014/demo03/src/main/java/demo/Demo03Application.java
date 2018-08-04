package demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo03Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("...run...");
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo03Application.class, args);
    }

}