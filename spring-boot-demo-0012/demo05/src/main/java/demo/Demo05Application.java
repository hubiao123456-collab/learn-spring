package demo;

import demo.model.Book;
import demo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo05Application implements CommandLineRunner {

    @Autowired
    private Book book01;

    @Autowired
    private Person person02;

    @Override
    public void run(String... args) throws Exception {
        log.info("book01.title: {}", book01.title);
        log.info("person02.name: {}", person02.name);
        log.info("person02.book01.title: {}", person02.book.title);
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo05Application.class, args);
    }

}