package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    /**
     * 只允许 HTTP POST 方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/greeting2", method = RequestMethod.POST)
    public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    /**
     * 获取 http 请求头信息
     * @param name
     * @param headers
     * @return
     */
    @RequestMapping(value = "/greeting3")
    public Greeting greeting3(@RequestParam(value="name", defaultValue="World") String name, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent")); // get 方法返回 List<String>
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    /**
     * 设置HTTP响应头
     * @param name
     * @return
     */
    @RequestMapping(value = "/greeting4", method = RequestMethod.POST)
    public ResponseEntity<Greeting> greeting4(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting greeting= new Greeting(counter.incrementAndGet(), String.format(template, name));

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("MyResponseHeader", "MyValue");

        return new ResponseEntity<>(greeting, responseHeaders, HttpStatus.OK);
    }
}
