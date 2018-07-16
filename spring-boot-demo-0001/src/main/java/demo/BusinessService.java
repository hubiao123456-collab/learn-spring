package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BusinessService {

    @Autowired
    private SayHello sayHello;

    public BusinessService(){
        System.out.println("construct");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct");
        System.out.println(sayHello.sayHello("world"));
    }


}
