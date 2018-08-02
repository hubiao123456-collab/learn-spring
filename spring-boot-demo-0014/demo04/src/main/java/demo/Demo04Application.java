package demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootApplication
@Slf4j
public class Demo04Application implements CommandLineRunner {

    @Autowired
    public ApplicationEventPublisher publisher;

    @Override
    public void run(String... args) throws Exception {
        log.info("...run...");
        publisher.publishEvent(new MyEvent("Hello World"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo04Application.class, args);
    }

}