package com.test.testweb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.testweb.bean.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/6 6:16 上午
 */
@Mapper
public interface DepartmentMapper /*extends BaseMapper<Department> */{

    //使用mybatis的方式获取数据
    public Department getDepartmentById(Integer department_id);

}
