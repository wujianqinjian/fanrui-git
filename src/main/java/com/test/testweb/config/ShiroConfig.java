package com.test.testweb.config;


import com.test.testweb.realm.AccountRealm;

import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/24 8:22 下午
 */
@Configuration
public class ShiroConfig {


    @Autowired
    private Realm realm;


    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(/*@Qualifier("securityManager") */DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean  factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(securityManager);
        //初始化权限拦截器设置
        Map<String,String> map= new HashMap<>();
        // authc: 认证用户可访问 anon:匿名可访问 user：使用remember可访问  administrator： perms 对应权限可访问 role：对应角色可访问
        map.put("/main","authc");
//        map.put("/manage","perms[manage]");
//        map.put("/administator","roles[administator]");
        map.put("favicon.ico","anon");
        map.put("/**","anon");
        map.put("/login","anon");
        factoryBean.setFilterChainDefinitionMap(map);

        //设置登录页面
        //为什么要挑战到login页面，可以试试访问main页面时，如果没有授权，跳转的错误页面的回显路径就知道了
        factoryBean.setLoginUrl("/login");
        return factoryBean;
    }

    //@Qualifier 可以让容器通过方法名找到对应的Bean
    @Bean
    public  DefaultWebSecurityManager securityManager(@Qualifier("accountRealm") Realm accountRealm){
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        manager.setRealm(accountRealm);
        return manager;
    }



/*   @Bean
    public AccountRealm accountRealm(){
        return new AccountRealm();
    }*/
}
