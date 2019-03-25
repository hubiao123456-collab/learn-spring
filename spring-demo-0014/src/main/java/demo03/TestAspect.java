package demo03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    // 定义切点（切入位置）
    @Pointcut("execution(public * demo03.TestBean.*(..))")
    private void pointcut(){}


    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("我是前置通知");
    }

}
