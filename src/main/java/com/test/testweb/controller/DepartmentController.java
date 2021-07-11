package com.test.testweb.controller;


import com.test.testweb.bean.Department;
import com.test.testweb.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;


/**
 * @author:wujianqinjian
 *
 */
@ResponseBody
@Slf4j
@RestController
@RequestMapping("/department_class")
//@Api(tags = "部门管理")
public class DepartmentController {

   @Autowired
   Department department;

//    @Autowired
//    private DepartmentRepository departmentRepository;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    JdbcTemplate jdbcTemplate;


    // 通过mybatis方式获取数据
    @ResponseBody
    @GetMapping("/departmentById/{department_id}")
    public Department getById(@PathVariable("department_id") Integer department_id){

        Department department=departmentService.getDepartmentById(department_id);

        return department;
    }

    // 通过mybatis方式获取数据
    @GetMapping("/departmentGetName/{department_id}")
    public String getDepartmentNameById(@PathVariable("department_id") Integer department_id){
        Department department=departmentService.getDepartmentById(department_id);
        String department_name=department.getDepartment_name();
        return department_name;
    }

/*
    //@CrossOrigin(value = "http://localhost:8080")
    @GetMapping("/findDepartment/{department_id}")
    public Department findDepartmentById(@PathVariable Integer department_id){
//        Department department=jdbcTemplate.queryForList("select * from department where id="+department_id);
        return departmentRepository.findAllById(department_id);
    }*/

/*
    @ResponseBody
    @RequestMapping("/department")
    public Map getDepartment() {

        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from banshee where id = 16437");
        System.out.println(list.get(0));
        Map<String,Object> map= list.get(0);
        System.out.println();
        return map;
    }*/



}
