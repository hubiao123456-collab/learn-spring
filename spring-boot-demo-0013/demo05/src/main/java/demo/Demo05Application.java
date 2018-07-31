package demo;

import demo.model.IBook;
import demo.model.IPerson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Demo05Application implements CommandLineRunner {

    @Autowired
    private IBook bookImpl01;

    @Autowired
    private IPerson personImpl02;

    @Override
    public void run(String... args) throws Exception {
        log.info("bookImpl01.title: {}", bookImpl01.getTitle());
        log.info("personImpl02.name: {}", personImpl02.getName());
        log.info("personImpl02.book01.title: {}", personImpl02.getBook().getTitle());
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo05Application.class, args);
    }

}