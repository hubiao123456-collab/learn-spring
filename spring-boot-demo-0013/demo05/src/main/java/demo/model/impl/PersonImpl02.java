package demo.model.impl;

import demo.model.IBook;
import demo.model.IPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonImpl02 implements IPerson {

    @Autowired
    IBook bookImpl02;

    @Override
    public String getName() {
        return "曹雪芹";
    }

    @Override
    public IBook getBook() {
        return bookImpl02;
    }
}
