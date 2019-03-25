package demo02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Aspect 和 @Component 都要有
 */
@Aspect
@Component
public class TestAspect {

    // 定义切点（切入位置）
    @Pointcut("execution(* demo02.TestBean.*(..))")
    private void pointcut(){}


    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("我是前置通知");
    }

}
