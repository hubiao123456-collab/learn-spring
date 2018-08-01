package demo.model.impl;

import demo.model.IBook;
import org.springframework.stereotype.Component;

@Component
public class BookImpl implements IBook {

    @Override
    public String getTitle() {
        return "书名";
    }

}
