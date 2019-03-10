package hello;


import hello.ex.CustomException01;
import hello.ex.CustomException02;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting1")
    public BaseResponse greeting1(@RequestParam(value="name", defaultValue="World") String name,
                                  @RequestParam(value="raiseEx", defaultValue="false") Boolean raiseEx) {
        if(raiseEx) {
            throw new CustomException01();
        }
        return BaseResponse.success("", new Greeting(1L, String.format("Hello, %s! This is greeting1", name)));
    }

    @RequestMapping(value = "/greeting2")
    public BaseResponse greeting2(@RequestParam(value="name", defaultValue="World") String name,
                                  @RequestParam(value="raiseEx", defaultValue="false") Boolean raiseEx) {
        if(raiseEx) {
            throw new CustomException02();
        }
        return BaseResponse.success("", new Greeting(2L, String.format("Hello, %s! This is greeting2", name)));
    }


}
