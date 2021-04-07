package com.test.testweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

//将组件放入容器中，false则代表组件之间没有依赖
@Configuration(proxyBeanMethods = false)
public class WebConfig implements WebMvcConfigurer{

//    @Bean
//    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
//        HiddenHttpMethodFilter hiddenHttpMethodFilter=new HiddenHttpMethodFilter();
//        //这里通过springboot中的 HiddenHttpMethodFilter类提供的set方法，可以重新自定义POST请求区分rest实际请求的参数名设置
//        hiddenHttpMethodFilter.setMethodParam("_post_default_params");
//        return hiddenHttpMethodFilter;
//    }

    //通过重写WebMvcConfigurer的configurePathMatch方法启动矩阵变量写法
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper= new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }
}
