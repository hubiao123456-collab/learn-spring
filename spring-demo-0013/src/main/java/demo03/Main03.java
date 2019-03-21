package demo03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main03.class);
        UserManager userManager = ctx.getBean(UserManager.class);

        System.out.println("开始时：");
        System.out.println(userManager.queryAllUser());

        // 插入数据
        userManager.add("test", "test@lttdev.com", "test");
        System.out.println("插入新数据后：");
        System.out.println(userManager.queryAllUser());

        // 删除数据
        userManager.delete("test");
        System.out.println("删除刚才插入的数据后：");
        System.out.println(userManager.queryAllUser());

    }

}
