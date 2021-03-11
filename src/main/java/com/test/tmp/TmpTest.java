package com.test.tmp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TmpTest {

    @RequestMapping("/tmptest")
    public String tmptest(){
        return "TmpTest";
    }


}
