package demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan
@EnableTransactionManagement
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

        System.out.println("开始时：");
        UserManager userManager = ctx.getBean(UserManager.class);

        System.out.println(userManager.queryAllUser());

        try {
            userManager.addWithRuntimeExceptionWithoutTransactional();
        } catch (Exception ex) {
            System.out.println("异常信息: "+ex.getMessage());
        }

        System.out.println("事务已经回滚，再查看数据：");
        System.out.println(userManager.queryAllUser());

    }

}
