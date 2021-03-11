package com.test.testweb.controller;

import com.test.testweb.bean.Scheme;
import com.test.testweb.bean.SchemeType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class SchemeTypeController {

    @Autowired
    SchemeType schemeType;


    @PostMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.POST)
    public SchemeType saveSchemeType(){
        //log.info("请求了保存方法");
        return schemeType;
    }
    @DeleteMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.DELETE)
    public SchemeType deleteSchemeType(){
        return schemeType;
    }
    @PutMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.PUT)
    public String putSchemeType(){
        return "修改"+schemeType;
    }
    @GetMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.GET)
    public SchemeType getSchemeType(){
        return schemeType;
    }


}
