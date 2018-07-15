# Sping Boot

Spring项目脚手架： https://start.spring.io/ 。

如无特殊说明，均使用gradle作为构建工具。

## 001. web服务模板

见 [spring-boot-demo-001](spring-boot-demo-001)。

Copy from https://github.com/spring-guides/gs-rest-service/ , commit is a1b292b .

complete目录本身是一个项目，使用idea打开 build.gradle 即可。

说明见 https://spring.io/guides/gs/rest-service/ 。

执行 Application 类即可运行。

## 002. web服务如何响应json和xml

代码见 [spring-boot-demo-002](spring-boot-demo-002)，以 [spring-boot-demo-001](spring-boot-demo-001) complete项目为基础。

在 build.gradle 中增加依赖：
```
compile("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
```

修改 Greeting 类：
```java
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
```

`GreetingController`内容不变。



**测试：**

浏览器直接访问 http://localhost:8080/greeting?name=World ，查看响应源码：
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><greeting><content>Hello, World!</content><id>2</id></greeting>
```
然后我们用 postman 测试，如果请求头有：
```
Accept: text/xml
```
或者
```
Accept: application/xml
```
会返回 xml 结果。

如果 http 请求头有：
```
Accept: application/json
```
响应结果是：
```
{"id":6,"content":"Hello, World!"}
```

注意，id是在递增的。这说明 Controller 对象是以单例的形式存在。

**参考：**

* [Spring-boot return json and xml from controllers](https://stackoverflow.com/questions/27790998/spring-boot-return-json-and-xml-from-controllers)
* [76.2 Write an XML REST Service](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-spring-mvc.html#howto-write-an-xml-rest-service)

**疑问：**

如果在所有情况下，都只想返回 xml 呢 ？

> 是不是默认约定，也能达到这种效果？

## 003. web服务常见使用方法

### 设置监听的ip和端口

代码见 [spring-boot-demo-003](spring-boot-demo-003)，以[spring-boot-demo-002](spring-boot-demo-002)为基础。

从上面的示例可以看到默认端口是 8080。
在src目录下新增resources目录，在其中创建文件 `application.properties`，内容：
```
server.port = 8090
```
要修改监听的 IP ，修改 `server.address`的值即可。

当然，还有其他方法，可以参考：
* [How to configure embedded Tomcat integrated with Spring to listen requests to IP address, besides localhost?](https://stackoverflow.com/questions/23946369/how-to-configure-embedded-tomcat-integrated-with-spring-to-listen-requests-to-ip/23953385)
* [Spring Boot - how to configure port](https://stackoverflow.com/questions/21083170/spring-boot-how-to-configure-port)

### 如何限定某一个url只能用POST方法

代码见 [spring-boot-demo-003](spring-boot-demo-003)，以[spring-boot-demo-002](spring-boot-demo-002)为基础。

在 GreetingController 类中增加：
```java
@RequestMapping(value = "/greeting2", method = RequestMethod.POST)
public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
    return new Greeting(counter.incrementAndGet(),
            String.format(template, name));
}
```

浏览器访问 http://localhost:8090/greeting2?name=World ，报错“Whitelabel Error Page”，因为浏览器默认用的是 GET 方法。

使用postman构造POST请求到`http://localhost:8090/greeting2`，请求体是：
```
name=Spring
```
响应为：
```
{"id":4,"content":"Hello, Spring!"}
```

如果要只支持 GET 和 POST 呢？

### 如何获取请求的HTTP头信息

代码见 [spring-boot-demo-003](spring-boot-demo-003)，以[spring-boot-demo-002](spring-boot-demo-002)为基础。

在 GreetingController 类中增加：
```java
@RequestMapping(value = "/greeting3")
public Greeting greeting3(@RequestParam(value="name", defaultValue="World") String name, @RequestHeader HttpHeaders headers) {
    System.out.println(headers.get("User-Agent")); // get 方法返回 List<String>
    return new Greeting(counter.incrementAndGet(),
            String.format(template, name));
}
```
浏览器请求`http://127.0.0.1:8090/greeting3`，启动的web服务会在终端中打出类似下面的内容：
```
[Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36]
```


### 如何设置响应中的HTTP头

### 如果POST的数据是JSON
一个简单的方式是把请求体作为一个字符串拿出来。

### 自定义logger


## 004. 一个基于spring-boot的纯java项目

见 [spring-boot-demo-004](spring-boot-demo-004)。

BusinessService 类是一个 @Service，启动 DemoApplication 后，BusinessService的构造函数先执行，然后被@PostConstruct修饰的postConstruct执行。

BusinessService 中的 sayhello 私有变量会被自动装配。


