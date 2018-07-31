package demo;

import demo.model.IBook;
import demo.model.IPerson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo03Application implements CommandLineRunner {

    @Autowired
    @Qualifier("石头记")
    private IBook book;

    @Autowired
    @Qualifier("曹雪芹")
    private IPerson person;

    @Override
    public void run(String... args) throws Exception {
        log.info("book.title: {}", book.getTitle());
        log.info("person.name: {}", person.getName());
        log.info("person.book.title: {}", person.getBook().getTitle());
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo03Application.class, args);
    }

}