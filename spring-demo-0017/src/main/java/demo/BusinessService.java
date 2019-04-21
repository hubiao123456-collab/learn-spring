package demo;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    public String hello() {
        int status = HttpService.queryStatus();
        if (status == 0) {
            return "你好";
        }
        else {
            return "Hello";
        }
    }

}
