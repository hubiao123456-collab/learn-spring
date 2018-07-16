package demo;

public class SayHello {

    public String sayHello(String msg) {
        System.out.println("正在执行sayHello，收到msg："+msg);
        return "Hello " + msg;
    }

}
