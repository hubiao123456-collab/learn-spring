package demo;

import demo.model.Book;
import demo.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Book getBook() {
        Book book = new Book();
        book.title = "书名";
        return book;
    }

    @Bean
    public Person getPerson(Book book) {
        Person person = new Person();
        person.name = "人名";
        person.book = book;
        return person;
    }

}
