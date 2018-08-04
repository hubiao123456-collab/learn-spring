package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Order(1)
@Component
public class AspectConfig {

    // 定义切点（切入位置）
    @Pointcut("@annotation(demo.MyAnnotation)")
    private void pointcut(){}


    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
        System.out.println("AspectConfig: 注解中的value值：" + myAnnotation.value());

        System.out.println("AspectConfig: 我是环绕通知前....");
        //执行目标函数
        Object obj= (Object) joinPoint.proceed();
        System.out.println("AspectConfig: 我是环绕通知后....");
        if (obj instanceof String) {
            return "AspectConfig: 我被切面修改了";
        }
        return obj;
    }

}
