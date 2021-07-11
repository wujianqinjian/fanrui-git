package com.test.testweb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.testweb.bean.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/24 7:48 下午
 */


@Service
public interface AccountService extends IService<Account> {
    public Account findByUsername(String username);
    public Account findByPassword(String password);
    public Account findById(Integer id);
    //public void addAccount(/*Integer id,*/ String username, String password, String perms, String role, String compellation, String idCardNo);
    public void deleteAccount(Integer id);
//    public void addAccount(Account account);

}
