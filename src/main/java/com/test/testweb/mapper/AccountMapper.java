package com.test.testweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.testweb.bean.Account;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Mapper;
//import org.springframework.stereotype.Repository;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/24 6:44 下午
 */



@Mapper
public interface AccountMapper extends BaseMapper<Account>{
    /*
     * 当使用mybatis-plus，只需要集成BaseMapper就可以不用在mapper中添加curd相关方法了
     */
}
