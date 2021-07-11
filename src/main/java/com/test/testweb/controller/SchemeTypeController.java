package com.test.testweb.controller;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.LocalDateTimeUtil;
import com.test.testweb.bean.Scheme;
import com.test.testweb.bean.SchemeType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;


@Slf4j
@RestController
public class SchemeTypeController {

    @Autowired
    SchemeType schemeType;
    @Autowired
    JdbcTemplate jdbcTemplate;


    @PostMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.POST)
    public SchemeType saveSchemeType() {
        log.info("请求了保存方法");

        return schemeType;
    }

    @DeleteMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.DELETE)
    public SchemeType deleteSchemeType() {
        log.info("请求了删除方法");
        return schemeType;
    }

    @PutMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.PUT)
    public String putSchemeType() {
        log.info("请求了修改方法");
        return "修改" + schemeType;
    }

    @GetMapping("/schemetype")
    //@RequestMapping(value = "/schemetype",method = RequestMethod.GET)
    public SchemeType getSchemeType() {
        log.info("请求了查询方法");
        return schemeType;
    }

}
