package com.test.testweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

//将组件放入容器中，false则代表组件之间没有依赖
@Configuration(proxyBeanMethods = false)
public class WebConfig {

//    @Bean
//    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
//        HiddenHttpMethodFilter hiddenHttpMethodFilter=new HiddenHttpMethodFilter();
//        //这里通过springboot中的 HiddenHttpMethodFilter类提供的set方法，可以重新自定义POST请求区分rest实际请求的参数名设置
//        hiddenHttpMethodFilter.setMethodParam("_post_default_params");
//        return hiddenHttpMethodFilter;
//    }
}
