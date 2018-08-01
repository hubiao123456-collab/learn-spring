package demo;

import demo.model.Book;
import demo.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Book book01() {
        Book book = new Book();
        book.title = "石头记";
        return book;
    }

    @Bean
    public Book book02() {
        Book book = new Book();
        book.title = "红楼梦";
        return book;
    }

    @Bean
    public Person person01(Book book01) {
        Person person = new Person();
        person.name = "曹夢阮";
        person.book = book01;
        return person;
    }

    @Bean
    public Person person02(Book book02) {
        Person person = new Person();
        person.name = "曹雪芹";
        person.book = book02;
        return person;
    }

}
