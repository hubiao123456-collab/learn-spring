package demo;

public class SayHello {

    public String sayHello(String msg) {
        System.out.println("正在执行sayHello，收到msg："+msg);
        return "Hello " + msg;
    }

    public String sayHello2(String msg) throws Exception {
        System.out.println("正在执行sayHello，收到msg："+msg);
        if (true) {
            throw new Exception("出现错误");
        }
        return "Hello " + msg;
    }

}
