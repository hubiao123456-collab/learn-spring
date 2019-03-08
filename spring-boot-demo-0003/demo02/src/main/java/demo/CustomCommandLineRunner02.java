package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0) // 值越小，越先执行
public class CustomCommandLineRunner02 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is CustomCommandLineRunner02");
        for (int i=0; i<args.length; ++i) {
            System.out.printf("%d: %s\n", i, args[i]);
        }
    }
}
