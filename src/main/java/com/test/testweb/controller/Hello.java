package com.test.testweb.controller;

import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }


}
