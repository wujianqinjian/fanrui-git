package com.test.testweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexOne {

    @RequestMapping("/index")
    public String index() {

        return "index page";
    }


}
