package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class CustomInterrupter {

    public void before(JoinPoint joinPoint){
        System.out.println("我是前置通知");
    }

    public void afterReturning(JoinPoint joinPoint,Object returnVal){
        System.out.println("我是后置通知...");
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("最终通知....");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我是环绕通知前....");
        //执行目标函数
        Object obj= (Object) joinPoint.proceed();
        System.out.println("我是环绕通知后....");
        return obj;
    }

    public void afterThrowing(Throwable throwable){
        System.out.println("异常通知:"+ throwable.getMessage());
    }

}
