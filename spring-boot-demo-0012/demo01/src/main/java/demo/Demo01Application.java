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
public class Demo01Application implements CommandLineRunner {

    @Autowired
    private Book theBook;

    @Autowired
    private Person thePerson;

    @Override
    public void run(String... args) throws Exception {
        log.info("theBook.title: {}", theBook.title);
        log.info("thePerson.name: {}", thePerson.name);
        log.info("thePerson.theBook.title: {}", thePerson.book.title);
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

}