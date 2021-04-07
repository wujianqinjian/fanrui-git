package com.test.testweb.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: wujianqinjian
 * @Date: 2021/4/6 10:55 下午
 */
@Configuration
public class MyDataSourceConfig {


    // 默认配置Hikari，如果用户配置了自己的数据员，则默认的Hikari就会失效
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        return druidDataSource;

    }

    /**
     * 配置Servlet监控页
     */

}
