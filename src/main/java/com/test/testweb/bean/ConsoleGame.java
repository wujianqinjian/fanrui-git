package com.test.testweb.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @Author: wujianqinjian
 * @Date: 2021/5/13 1:27 下午
 */


@Component
@Entity
@Data
public class ConsoleGame {
    @Id
    private Integer id;
    private String title;
    private String sketch;
    private String upNickName;
    private String upNickMain;
    private String plays;
    private String comments;
    private String types;
    private String catalog;


    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }



    //private Integer id;
}
