package com.test.testweb.service.implement;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.testweb.bean.Department;
import com.test.testweb.mapper.DepartmentMapper;
import com.test.testweb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/6 6:20 上午
 */
public class DepartmentServiceImplement /*implements DepartmentService*/ {

    @Autowired
    DepartmentMapper departmentMapper;



/*    @Override
    public Department findDepartmentById(Integer id) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("department_id",id);
        return departmentMapper.selectOne(wrapper);
    }*/
}
