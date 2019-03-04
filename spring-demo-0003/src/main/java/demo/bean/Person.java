package demo.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    @Autowired
    private Address address;

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
