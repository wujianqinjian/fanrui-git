package com.test.testweb;

//import com.apple.eawt.Application;
import com.test.testweb.mapper.AccountMapper;
//import com.test.testweb.repository.BansheeRepository;
//import com.test.testweb.service.AccountService;
import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@Slf4j
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestwebApplication.class)
@ActiveProfiles("dev")
public  class TestwebApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
/*    @Autowired
    BansheeRepository bansheeRepository;*/

/*    @Autowired
    private AccountService accountService;*/

    @Autowired
    private AccountMapper mapper;


/*    @Test
    public void findByUserName(){
        System.out.println(accountService.findByUsername("fanrui"));
    }*/


    @Test
    public void test(){
        mapper.selectList(null).forEach(System.out::println);
    }
/*
    @Test
    public void findAll(){
        System.out.println(bansheeRepository.findAll());
    }*/

    @Test
    public void contextLoads() {
        log.info(String.valueOf(dataSource.getClass()));
        log.info("da",dataSource.getClass());
    }


    @Test
    void test3(){
        System.out.println("test");
    }




}
