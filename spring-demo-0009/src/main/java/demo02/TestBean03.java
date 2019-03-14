package demo02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestBean03 implements InitializingBean, ApplicationContextAware, ApplicationListener {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestBean03 afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("TestBean03 setApplicationContext");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("TestBean03 event: " + event.getClass().getCanonicalName());
    }


}
