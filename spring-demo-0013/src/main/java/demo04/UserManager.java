package demo04;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class UserManager {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(String name, String email, String password) {
        jdbcTemplate.update("insert into user(name, email, password) values(?, ?, ?)", name, email, password);
    }

    public List<User> queryAllUser() {
        return jdbcTemplate.query("select  id, name from user order by id", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                return user;
            }
        });
    }

    public void delete(String name) {
        jdbcTemplate.update("delete from user where name=?", name);
    }
}
