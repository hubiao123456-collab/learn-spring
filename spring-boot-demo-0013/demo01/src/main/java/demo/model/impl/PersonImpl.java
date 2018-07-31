package demo.model.impl;

import demo.model.IBook;
import demo.model.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonImpl implements IPerson {

    @Autowired
    IBook book;

    @Override
    public String getName() {
        return "人名";
    }

    @Override
    public IBook getBook() {
        return book;
    }
}
