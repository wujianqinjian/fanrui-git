package com.test.testweb.repository;


import com.test.testweb.bean.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/13 2:27 下午
 */
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
