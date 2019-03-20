package demo01;

import model.User;
import org.junit.Test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main01 {

    DataSource getDataSource() {
         DriverManagerDataSource dataSource=new DriverManagerDataSource();
         dataSource.setDriverClassName("com.mysql.jdbc.Driver");
         dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/blog_db");
         dataSource.setUsername("root");
         dataSource.setPassword("123456");
         return dataSource;
    }

    @Test
    public void test() {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(getDataSource());
        List<User> userList = jdbcTemplate.query("select  id, name from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                return user;
            }
        });
        System.out.println(userList);

    }
}
