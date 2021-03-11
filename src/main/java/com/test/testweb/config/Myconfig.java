package com.test.testweb.config;

import com.test.testweb.bean.Note;
import com.test.testweb.bean.Records;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;



@EnableConfigurationProperties(Records.class)
@Configuration(proxyBeanMethods = true)
//@ConditionalOnBean(name = "list")
public class Myconfig {

    @Bean
    public Records record(){

        return new Records(1,"快捷键","google查询",'Y');
    }

    @Bean
    public Note note(){
        Note note = new Note(1,"springboot2");
        note.setRecords(record());
        return note;
    }
}
