package demo;

import org.springframework.stereotype.Component;

@Component
public class SayHello {

    public String sayHello(String msg) {
        return "Hello " + msg;
    }

}
