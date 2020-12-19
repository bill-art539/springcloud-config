package com.bill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.bill.mapper") //扫描的mapper
@SpringBootApplication
public class MyStratApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyStratApplication.class);
    }
}

