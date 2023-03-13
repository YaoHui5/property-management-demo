package com.bnuz.propertymanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan(basePackages = "com.bnuz.propertymanagement")
@SpringBootApplication
@MapperScan(basePackages = "com.bnuz.propertymanagement.mapper")
public class PropertyManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertyManagementApplication.class, args);
    }

}
