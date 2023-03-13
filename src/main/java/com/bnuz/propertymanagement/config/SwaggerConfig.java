//package com.bnuz.propertymanagement.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Component
//@Configuration
//public class SwaggerConfig {
//    @Bean
//    public Docket docket(){
//        return new Docket(DocumentationType.OAS_30)
//                .apiInfo(apiInfo())
//                .enable(true)
//                .groupName("MELO")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("package com.bnuz.propertymanagement.controller"))
//                .paths(PathSelectors.ant("/controller/**"))
//                .build();
//    }
//
//    @SuppressWarnings("all")
//    public ApiInfo apiInfo(){
//        return new ApiInfo(
//                "melo's API",
//                "房地产管理系统",
//                "1.0",
//                "jditwyh@163.com",
//                "MELO",
//                "Apache 2.0",
//                "http://www.apache.org/licenses/LICENSE-2.0"
//        );
//    }
//}
