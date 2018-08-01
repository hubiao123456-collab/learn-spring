package demo.model.impl;

import demo.model.IBook;
import org.springframework.stereotype.Component;

@Component(value = "石头记")
public class BookImpl01 implements IBook {

    @Override
    public String getTitle() {
        return "石头记";
    }

}
