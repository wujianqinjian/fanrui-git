package com.test.testweb.controller;

import com.test.testweb.bean.Banshee;
import com.test.testweb.repository.BansheeRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/13 4:24 下午
 */


@Api(tags = "查询数据")
@RestController
@RequestMapping("/banshee")
public class BansheeController {

    @Autowired
    private BansheeRepository bansheeRepository;

    //@CrossOrigin(value = "http://localhost:8080")
    @GetMapping("/findAll/{page}/{size}")
    public Page<Banshee> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        Pageable pageable= PageRequest.of(page-1,size);

        return bansheeRepository.findAll(pageable);
    }



    @ApiOperation(value = "查询多条数据")
    @CrossOrigin(value = "http://localhost:8080")
    @GetMapping("/findcll")
    public List<Banshee> findcll(){

        return bansheeRepository.findAll();
    }




}
