package com.test.testweb.service;

import com.test.testweb.bean.Department;
import com.test.testweb.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/6 6:18 上午
 */
@Service
public class DepartmentService implements DepartmentMapper {

    @Autowired
    DepartmentMapper departmentMapper;


    @Override
    public Department getDepartmentById(Integer department_id) {
        return departmentMapper.getDepartmentById(department_id);
    }
}
