package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is CustomCommandLineRunner");
        for (int i=0; i<args.length; ++i) {
            System.out.printf("%d: %s\n", i, args[i]);
        }
    }
}
