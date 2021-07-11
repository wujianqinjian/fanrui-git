package com.test.testweb.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/24 6:42 下午
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String perms;
    private String role;
    private String compellation;
    private String idCardNo;

}
