package com.test.testweb.controller;

import cn.hutool.json.JSON;
import com.test.testweb.bean.Account;
import com.test.testweb.bean.SchemeType;
import com.test.testweb.mapper.AccountMapper;
import com.test.testweb.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * @Author: wujianqinjian
 * @Date: 2021/5/25 11:27 下午
 */

@RestController
@RequestMapping("/account")
public class AccountController {
  @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AccountService accountService;


    @GetMapping("/{url}")
    public  String redirect(@PathVariable("url") String url){
        return url;
    }


/*    @ResponseBody
    @RequestMapping("/delete/{id}")
    public String deleteAccount(@PathVariable("id") Integer id){
        accountService.deleteAccount(id);
        return "删除"+id+"成功";
    }*/
//
//    @ApiOperation(value = "用户注册")
//    @PostMapping("/addAccount")
//    public

//    @PostMapping("/addaccount")
//    public String saveAccount(@RequestBody Account account){
//
//    }

/*   @PostMapping("/addaccount/{username}")
    public void addAccount(HttpServletRequest request) {
        Account account=new Account();
        account.setUsername(request.getParameter("username"));
        account.setPassword(request.getParameter("password"));
        account.setPerms(request.getParameter("perms"));
        account.setRole(request.getParameter("role"));
        account.setCompellation(request.getParameter("compellation"));
        account.setIdCardNo(request.getParameter("idcardno"));
        accountMapper.insert(account);
    }*/



//
//    @PostMapping("/addaccount/")
//    //@RequestMapping(value = "/schemetype",method = RequestMethod.POST)
//    public void addAccount() {
//        Account account =new Account();
//    }
/*    @PostMapping("/addaccount/{username}")
    public void addAccount(@PathVariable("username") String username, @PathVariable("password")String password,
                           @PathVariable("perms")String perms, @PathVariable("role")String role,
                           @PathVariable("compellation")String compellation, @PathVariable("idCardNo")String idCardNo) {
        Account account=new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setPerms(perms);
        account.setRole(role);
        account.setCompellation(compellation);
        account.setIdCardNo(idCardNo);
        accountMapper.insert(account);
    }*/


}
