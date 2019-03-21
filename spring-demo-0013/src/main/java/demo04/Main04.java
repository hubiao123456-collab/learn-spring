package demo04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

@ComponentScan
public class Main04 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main04.class);

        UserManager userManager = ctx.getBean(UserManager.class);
        PlatformTransactionManager txManager = ctx.getBean(PlatformTransactionManager.class);
        TransactionDefinition txDef = ctx.getBean(TransactionDefinition.class);

        System.out.println("开始时：");
        System.out.println(userManager.queryAllUser());

        System.out.println("进入事务：");
        TransactionStatus txStatus = txManager.getTransaction(txDef); // 若参数为null，则为默认的事务配置
        try {
            userManager.add("test", "test@lttdev.com", "test");
            System.out.println("插入新数据后：");
            System.out.println(userManager.queryAllUser());
            if (1==1) {
                throw new RuntimeException("ex");
            }
            System.out.println("提交事务：");
            txManager.commit(txStatus);
        } catch (Exception ex) {
            txManager.rollback(txStatus);
        }

        System.out.println("事务已经回滚，再查看数据：");
        System.out.println(userManager.queryAllUser());
    }

}
