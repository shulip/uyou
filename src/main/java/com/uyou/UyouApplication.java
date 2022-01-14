package com.uyou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.uyou.dao","com.uyou.helperDao"})
public class UyouApplication {

    public static void main(String[] args) {
        SpringApplication.run(UyouApplication.class, args);
    }

}
