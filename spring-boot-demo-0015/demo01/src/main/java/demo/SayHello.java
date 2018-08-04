package demo;

import org.springframework.stereotype.Component;

@Component
public class SayHello {

    public String hi(String msg) {
        return "Hi " + msg;
    }

}
