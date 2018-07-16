package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)  // 值越小，优先级越高
public class CustomInterrupter {

    // 定义切点（切入位置）
    @Pointcut("execution(* demo.SayHello.*(..))")
    private void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("我是前置通知");
    }

    @AfterReturning(value="pointcut()", returning = "returnVal")  // 别忘了returning参数
    public void afterReturning(JoinPoint joinPoint, Object returnVal){
        System.out.println("我是后置通知...，收到的returnVal: " + returnVal);
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("最终通知....");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是环绕通知前....");
        //执行目标函数
        Object obj= (Object) joinPoint.proceed();
        System.out.println("我是环绕通知后....");
        return obj;
    }

    @AfterThrowing(value="pointcut()", throwing="throwable")   // 别忘了throwing参数
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable){
        System.out.println("异常通知:"+ throwable.getMessage());
    }

}
