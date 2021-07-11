package com.test.testweb.controller;


import com.test.testweb.bean.Note;
import com.test.testweb.bean.Records;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author:wujianqinjian
 *
 */
@Slf4j
@RestController
@RequestMapping("ccc")
public class RecordsController {


    @Autowired
    Records records;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/record")
    public Records records() {
        log.info(records.getTitle());
        log.info(records.getScheme());
        log.info(records.getRecordId() + "");
        return records;
    }

    @ResponseBody
    @RequestMapping("/testmysqldata/{id}")
    public Map getScheme(@PathVariable("id") Integer id) {

        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from banshee where id = 16437");
        System.out.println(list.get(0));
        Map<String,Object> map= list.get(0);
        System.out.println();
        return map;
    }

    @ResponseBody
    @RequestMapping("/testsqlmonitoring")
    public String testqueryFromDb(){
        Long testalong=jdbcTemplate.queryForObject("select count(*) from bansheedata.banshee",long.class);
        log.info("数据总量"+testalong);
        return testalong.toString();
    }
}
