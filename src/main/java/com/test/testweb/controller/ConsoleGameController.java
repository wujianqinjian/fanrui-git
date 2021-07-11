package com.test.testweb.controller;

import com.test.testweb.bean.Banshee;
import com.test.testweb.repository.BansheeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/13 4:24 下午
 */

@Api(tags = "测试查询所有")
@RestController
@RequestMapping("/consolegame")
public class ConsoleGameController {

    @Autowired
    private BansheeRepository bansheeRepository;

    //@CrossOrigin(origins = "http://localhost:8080")
    @ApiOperation("获取所有数据")
    @GetMapping("/findall")
    public List<Banshee> findAll(){
        return bansheeRepository.findAll();
    }


}
