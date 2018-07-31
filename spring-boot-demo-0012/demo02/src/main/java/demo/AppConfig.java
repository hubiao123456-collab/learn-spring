package demo;

import demo.model.Book;
import demo.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="石头记")
    public Book getBook01() {
        Book book = new Book();
        book.title = "石头记";
        return book;
    }

    @Bean(name="红楼梦")
    public Book getBook02() {
        Book book = new Book();
        book.title = "红楼梦";
        return book;
    }

    @Bean(name="曹夢阮")
    public Person getPerson01(Book book) {
        Person person = new Person();
        person.name = "曹夢阮";
        person.book = book;
        return person;
    }

    @Bean(name="曹雪芹")
    public Person getPerson02(Book book) {
        Person person = new Person();
        person.name = "曹雪芹";
        person.book = book;
        return person;
    }

}
