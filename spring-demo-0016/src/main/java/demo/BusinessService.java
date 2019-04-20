package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @Autowired
    private HttpService httpService;

    public String hello() {
        int status = httpService.queryStatus();
        if (status == 0) {
            return "你好";
        }
        else {
            return "Hello";
        }
    }

}
