package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Aspect
@Order(2)
@Component
public class AspectConfig02 {

    // 定义切点（切入位置）
    @Pointcut("within(@demo.MyAnnotation02 *)")
    private void pointcut(){}


    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {


        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        // 获取类的所有注解
        Annotation[] annotations = signature.getDeclaringType().getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation.annotationType() == MyAnnotation02.class) {
                System.out.println("AspectConfig02: 注解value：" + ((MyAnnotation02) annotation).value());
            }
        }

        System.out.println("AspectConfig02: 我是环绕通知前....");
        //执行目标函数
        Object obj= (Object) joinPoint.proceed();
        System.out.println("AspectConfig02: 我是环绕通知后....");
        if (obj instanceof String) {
            return "AspectConfig02: 我被切面修改了";
        }
        return obj;
    }

}
