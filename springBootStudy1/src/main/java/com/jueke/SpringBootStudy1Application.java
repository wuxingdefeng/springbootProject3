package com.jueke;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018/2/28.
 */
@SpringBootApplication
@MapperScan("com.jueke.mapper")
public class SpringBootStudy1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudy1Application.class);
    }
}
