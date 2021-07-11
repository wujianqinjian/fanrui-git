package com.test.testweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/20 6:30 上午
 */

@EnableOpenApi
@Configuration
public class SwaggerConfig {

    /*public Docket createRestApi(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test.testweb.controller"))
                .build();
    }*/
    @Bean
    public Docket createApi(){

        return new Docket(DocumentationType.OAS_30)
                .groupName("fenzu")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();

    }

    public ApiInfo apiInfo(){

        return new ApiInfoBuilder()
                .title("swagger3.0文档")
                .description("文件描述")
                .contact(new Contact("fanrui","#","775662401@qq.com"))
                .version("1.0")
                .build();
    }

}
