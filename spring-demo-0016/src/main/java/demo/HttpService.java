package demo;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HttpService {

    public int queryStatus() {
        // 发起网络请求，得到响应值，然后返回
        // 这里用随机数模拟
        return new Random().nextInt(2);
    }

}
