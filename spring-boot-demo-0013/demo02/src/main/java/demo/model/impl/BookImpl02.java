package demo.model.impl;

import demo.model.IBook;
import org.springframework.stereotype.Component;

@Component
public class BookImpl02 implements IBook {

    @Override
    public String getTitle() {
        return "红楼梦";
    }

}
