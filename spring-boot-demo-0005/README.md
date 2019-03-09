该代码拷贝自官方教程 <https://github.com/spring-guides/gs-rest-service/> , commit 值是 a1b292b 。

项目的主体结构如下：
```
.
├── complete
│   ├── build.gradle
│   ├── pom.xml
│   └── src
│       ├── main
│       │   └── java
│       │       └── hello
│       │           ├── Application.java
│       │           ├── Greeting.java
│       │           └── GreetingController.java
│       └── test
│           └── java
│               └── hello
│                   └── GreetingControllerTests.java
├── initial
│   ├── build.gradle
│   ├── gradle
│   │   └── wrapper
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── hello
└── run-on-pws.json
```
其中complete目录本身是一个项目，使用 intellij IDEA 以项目的形式打开 build.gradle 即可（如果你使用 maven，那么可以打开 pom.xml）。complete 项目的说明见 <https://spring.io/guides/gs/rest-service/> 。