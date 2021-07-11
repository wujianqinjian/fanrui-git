package com.test.testweb.mapper;

import com.test.testweb.TestwebApplication;
import com.test.testweb.bean.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/2 9:24 上午
 */
@SpringBootTest(classes = TestwebApplication.class)
class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void test(){
        accountMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void testselect(){

        System.out.println(accountMapper.selectById(1));
    }


    @Test
    public void testInsert(){
        Account account=new Account();
        account.setUsername("usernametest");
        account.setPerms("perms");
        account.setRole("testRole");
        account.setPassword("testPassword");
        account.setIdCardNo("testidcardno");
        account.setCompellation("testCpellation");
        accountMapper.insert(account);
    }


}