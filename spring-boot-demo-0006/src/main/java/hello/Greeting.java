package hello;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {

    // 去掉来了final修饰
    private long id;
    private String content;

    // 增加了无参构造函数，不加的话解析xml时会报错
    public Greeting() {

    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    // 增加setter方法
    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}