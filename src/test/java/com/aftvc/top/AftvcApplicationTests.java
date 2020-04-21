package com.aftvc.top;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class AftvcApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }
    @Test
    void contextLoads2(HttpSession session) {
        System.out.println(session.getAttribute("msg"));
    }

}
