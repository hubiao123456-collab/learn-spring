package demo01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestBean01 implements InitializingBean, ApplicationContextAware, ApplicationListener {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getCanonicalName() + " afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getClass().getCanonicalName() + " setApplicationContext");
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(this.getClass().getCanonicalName() + " event: " + event.getClass().getCanonicalName());
    }

}
