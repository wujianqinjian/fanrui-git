package com.test.testweb.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel
public class Banshee{

    @ApiModelProperty(value = "ID")
    @Id
    private Integer id;
    @ApiModelProperty(value = "主题")
    private String title;
    @ApiModelProperty(value = "描述")
    private String sketch;
    @ApiModelProperty(value = "昵称")
    private String upNickName;
    @ApiModelProperty(value = "主要")
    private String upNickMain;
    @ApiModelProperty(value = "播放数量")
    private String plays;
    @ApiModelProperty(value = "啥意思")
    private String comments;
    @ApiModelProperty(value = "类型")
    private String types;
    @ApiModelProperty(value = "啥意思")
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
