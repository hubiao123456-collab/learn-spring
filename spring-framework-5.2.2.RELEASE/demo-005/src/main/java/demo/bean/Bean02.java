package demo.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bean02 implements InitializingBean {

	public Bean02() {
		System.out.printf("%s construct\n", getClassName());
	}

	@PostConstruct
	public void postConstruct() {
		System.out.printf("%s @PostConstruct\n", getClassName());
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.printf("%s InitializingBean.afterPropertiesSet\n", getClassName());
	}
	private String getClassName() {
		return this.getClass().getSimpleName();
	}
}