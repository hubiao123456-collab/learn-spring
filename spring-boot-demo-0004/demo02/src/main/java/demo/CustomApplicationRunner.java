package demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is " + getClass().getSimpleName());
        // 获取所有命令行参数
        System.out.println("获取所有命令行参数");
        for (String arg: args.getSourceArgs()) {
            System.out.println(arg);
        }

        System.out.println("------");

        // 获取所有选项
        System.out.println("获取所有选项");
        for (String option: args.getOptionNames()) {
            System.out.println(option);
        }

        System.out.println("------");

        // 获取解析后的参数，以 --msg 为例子
        System.out.println("获取解析后的参数，以 --msg 为例子");
        if (args.containsOption("msg")) {
            System.out.println("--msg选项的值有：");
            for (String s:args.getOptionValues("msg")) {
                System.out.println(s);
            }
        }

        System.out.println("------");

        // 获取无选项指定的参数
        System.out.println("获取无选项指定的参数");
        for (String val: args.getNonOptionArgs()) {
            System.out.println(val);
        }
    }

}
