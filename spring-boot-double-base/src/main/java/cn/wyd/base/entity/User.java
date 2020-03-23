package cn.wyd.base.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
public class User implements Serializable {

    private String username;
    private String password;
    private Integer age;

    public User(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }
}
