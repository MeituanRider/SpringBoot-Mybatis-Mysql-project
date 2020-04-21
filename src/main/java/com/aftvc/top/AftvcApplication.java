package com.aftvc.top;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.aftvc.top.mapper")
@SpringBootApplication
public class AftvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AftvcApplication.class, args);
    }

}
