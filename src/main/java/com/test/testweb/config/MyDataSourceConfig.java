package com.test.testweb.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author: wujianqinjian
 * @Date: 2021/4/6 10:55 下午
 */
@Configuration
public class MyDataSourceConfig {


    // 默认配置Hikari，如果用户配置了自己的数据员，则默认的Hikari就会失效
    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setFilters("stat");
        return druidDataSource;

    }

    /**
     * 通过注入Servlet方式配置Druid监控页
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        //注册一个视图拦截器（应该这样叫吧）
        StatViewServlet statViewServlet=new StatViewServlet();
        //将拦截器注入到容器中，并定义拦截路径，这里指：druid下的所有请求
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean= new ServletRegistrationBean<StatViewServlet>(statViewServlet,"/druid/*");
        return servletRegistrationBean;
    }
}
