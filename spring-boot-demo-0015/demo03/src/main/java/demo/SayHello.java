package demo;

import org.springframework.stereotype.Component;

@Component
public class SayHello {

    @MyAnnotation
    public String hi(String msg) {
        return "Hi , this is SayHello. " + msg;
    }

}
