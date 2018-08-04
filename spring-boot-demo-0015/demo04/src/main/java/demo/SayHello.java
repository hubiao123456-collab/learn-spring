package demo;

import org.springframework.stereotype.Component;

@Component
@MyAnnotation02(value = true)
public class SayHello {

    public String hi(String msg) {
        return "Hi , this is SayHello. " + msg;
    }

}
