package com.zxl.springboot_mybatis_pagehelp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zxl.springboot_mybatis_pagehelp.mapper"})
public class SpringbootMybatisPagehelpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPagehelpApplication.class, args);
    }

}
