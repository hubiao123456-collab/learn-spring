package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SayHelloIml implements SayHello {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

}
