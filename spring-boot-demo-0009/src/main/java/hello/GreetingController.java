package hello;

import java.util.concurrent.atomic.AtomicLong;

import hello.ex.CustomException01;
import hello.ex.CustomException02;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(value = "/greeting1")
    public BaseResponse greeting1(@RequestParam(value="name", defaultValue="World") String name) {
        if(true) {
            throw new CustomException01();
        }
        return BaseResponse.success("", new Greeting(counter.incrementAndGet(), String.format(template, name)));
    }

    @RequestMapping(value = "/greeting2")
    public BaseResponse greeting2(@RequestParam(value="name", defaultValue="World") String name) {
        if(true) {
            throw new CustomException02();
        }
        return BaseResponse.success("", new Greeting(counter.incrementAndGet(), String.format(template, name)));
    }


}
