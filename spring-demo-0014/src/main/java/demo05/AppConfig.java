package demo05;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public static TestBean testBean() {
        return new TestBean();
    }

    @Bean
    public String testString() {
        TestBean a = testBean();
        TestBean b = testBean();

        return  "";
    }


}
