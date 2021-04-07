package com.test.testweb;

import com.apple.eawt.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestwebApplication.class)
class TestwebApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        log.info(String.valueOf(dataSource.getClass()));
        log.info("da",dataSource.getClass());
    }




}
