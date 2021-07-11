package com.test.testweb.realm;

import com.test.testweb.bean.Account;
//import com.test.testweb.service.AccountService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/24 8:13 下午
 */
@Component
public class AccountRealm extends AuthorizingRealm {

/*    @Autowired
    private AccountService accountService;*/

    /**
     * 角色相关
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }


    /**
     * 权限相关
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

/*        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;

        Account account= accountService.findByUsername(token.getUsername());
        if(account != null){
            return  new SimpleAuthenticationInfo(account,account.getPassword(),getName());
        }*/
        return null;
    }
}
