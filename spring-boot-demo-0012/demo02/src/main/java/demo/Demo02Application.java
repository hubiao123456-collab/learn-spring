package demo;

import demo.model.Book;
import demo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 会报错
 */
@SpringBootApplication
@Slf4j
public class Demo02Application implements CommandLineRunner {

    @Autowired
    private Book book;

    @Autowired
    private Person person;

    @Override
    public void run(String... args) throws Exception {
        log.info("book.title: {}", book.title);
        log.info("person.name: {}", person.name);
        log.info("person.book.title: {}", person.book.title);
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo02Application.class, args);
    }

}