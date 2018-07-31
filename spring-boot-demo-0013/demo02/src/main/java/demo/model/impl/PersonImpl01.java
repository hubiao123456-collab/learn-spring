package demo.model.impl;

import demo.model.IBook;
import demo.model.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonImpl01 implements IPerson {

    @Autowired
    IBook book;

    @Override
    public String getName() {
        return "曹夢阮";
    }

    @Override
    public IBook getBook() {
        return book;
    }
}
