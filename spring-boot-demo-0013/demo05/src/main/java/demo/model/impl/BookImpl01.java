package demo.model.impl;

import demo.model.IBook;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookImpl01 implements IBook {


    @Override
    public String getTitle() {
        return "石头记";
    }

}
