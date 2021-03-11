package com.test.testweb.controller;


import com.test.testweb.bean.Note;
import com.test.testweb.bean.Records;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RecordsController {

    @Autowired
    Records records;

    @RequestMapping("/record")
    public Records records(){
        log.info(records.getTitle());
        log.info(records.getScheme());
        log.info(records.getRecordId()+"");
        return records;
    }
}
