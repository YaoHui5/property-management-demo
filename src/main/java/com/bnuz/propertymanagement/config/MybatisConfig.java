package com.bnuz.propertymanagement.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/* Mybatis配置类*/


@Configuration
@MapperScan("com.bnuz.propertymanagement.mapper")
public class MybatisConfig {

}
