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

        System.out.println(userManager.queryAllUser());


        TransactionStatus txStatus = txManager.getTransaction(txDef);
        try {
            System.out.println("插入新数据，查看数据");
            userManager.add("test", "test@lttdev.com", "test");
            System.out.println(userManager.queryAllUser());
            throw new RuntimeException("ex");
        } catch (Exception ex) {
            txManager.rollback(txStatus);
        }

        System.out.println("事务已经回滚，再查看数据");
        System.out.println(userManager.queryAllUser());

    }

}
