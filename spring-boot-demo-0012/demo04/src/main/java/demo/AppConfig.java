package demo;

import demo.model.Book;
import demo.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Qualifier("石头记")
    public Book getBook01() {
        Book book = new Book();
        book.title = "石头记";
        return book;
    }

    @Bean
    @Qualifier("红楼梦")
    public Book getBook02() {
        Book book = new Book();
        book.title = "红楼梦";
        return book;
    }

    @Bean
    @Qualifier("曹夢阮")
    public Person getPerson01(@Qualifier("石头记") Book book) {
        Person person = new Person();
        person.name = "曹夢阮";
        person.book = book;
        return person;
    }

    @Bean
    @Qualifier("曹雪芹")
    public Person getPerson02(@Qualifier("红楼梦") Book book) {
        Person person = new Person();
        person.name = "曹雪芹";
        person.book = book;
        return person;
    }

}
