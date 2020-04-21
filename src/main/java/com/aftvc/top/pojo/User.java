package com.aftvc.top.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 15:27 2020/4/14
 * @ Description：user实体类
 * @ Modified By：
 * @Version: $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String country;
    private Integer statu;

    public User(String username, String password, String email, String country) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.country = country;
    }

    public User(String username, String password, String email, String country, Integer statu) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.country = country;
        this.statu = statu;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
