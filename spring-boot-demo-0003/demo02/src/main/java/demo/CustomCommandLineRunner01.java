package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CustomCommandLineRunner01 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is CustomCommandLineRunner01");
        for (int i=0; i<args.length; ++i) {
            System.out.printf("%d: %s\n", i, args[i]);
        }
    }
}
