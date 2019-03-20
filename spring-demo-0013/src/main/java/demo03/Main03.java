package demo03;

import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@ComponentScan
public class Main03 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main03.class);
        UserManager userManager = ctx.getBean(UserManager.class);

        System.out.println(userManager.queryAllUser());

        System.out.println("插入新数据");
        userManager.add("test", "test@lttdev.com", "test");
        System.out.println(userManager.queryAllUser());

        System.out.println("删除刚才插入的数据");
        userManager.delete("test");
        System.out.println(userManager.queryAllUser());

    }

}
