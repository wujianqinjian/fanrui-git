package com.test.testweb.controller;

import com.sun.tracing.dtrace.Attributes;
import com.test.testweb.bean.Scheme;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


/**
 * @author jianwu
 */
@Slf4j
@Controller
public class Hello {
    //test
    @RequestMapping("/hello")
    public String hello(@RequestParam("29_name") String test_29_name){
        log.info("带参数请求成功啦，参数值为传入的29_name,即："+test_29_name);
        return test_29_name;
    }

    //还没有完成
    @RequestMapping("/hello2")
    public String hello2(@RequestParam HttpSession session){
        Map<String,Object> map2=new HashMap<>();
        map2.put("session",session);
        log.info("hello2_test");
        return "暂时返回String，希望返回session";
    }

    //通过id获取方案，后期可集成数据库
    @RequestMapping("/hello3/{schemeId}")
    public Scheme test_getSchemeById(@PathVariable("schemeId") Integer id){
        Scheme scheme=new Scheme();
        scheme.setSchemeId(id);
        scheme.setSchemeName("方案名称");
        scheme.setSchemeDesc("方案描述");
        log.info("test_getSchemeById");
        return scheme;
    }

    //放回获取请求头
    @RequestMapping("/hello4")
    public Map<String,Object> test_getMap(@RequestHeader Map<String,String> header, @CookieValue Cookie cookie){
        Map<String,Object> map= new HashMap<>();
        map.put("headers",header);
        log.info(cookie.getName());
        //header=new HashMap<>();
        //header.get()
        log.info("test");
        return map;
    }

    //传递参数对象
    @RequestMapping("/test_schemeObject")
    public String hello4(@RequestParam Scheme scheme){
        log.info("hello4_test");
        return "input_object";
    }

    //测试请求体
    @RequestMapping("/testlogin")
    public Map hello5(@RequestBody String content){
        Map<String,Object> map= new HashMap<>();
        map.put("content",content);
        return map;
    }

    //测试attribute
    @GetMapping("/gotoother")
    public String goToOtherPage(HttpServletRequest request){
        request.setAttribute("msg","转发成功");
        request.setAttribute("code",200);
        return "forward:/success";
    }

    //取出请求域中的信息
    @ResponseBody
    @GetMapping("/success")
    public Object goToSuccessPageString(@RequestAttribute("msg") String msg,HttpServletRequest request){
        request.setAttribute("new1","测试添加属性");
        Object cmd=request.getAttribute("new1");
        Object msg1= request.getAttribute("msg");

        return cmd;
    }




//
//
//    @ResponseBody
//    @GetMapping("/success")
//    public Map goToSuccessPage(@RequestAttribute("msg") String msg){
//        Map<String,Object> map= new HashMap<>();
//        map.put("msg",msg);
//        return map;
//    }



}
