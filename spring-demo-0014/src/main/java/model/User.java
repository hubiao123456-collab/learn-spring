package model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class User {

    private Long id;
    private String name;
//    private String email;
//    private String password;

}
