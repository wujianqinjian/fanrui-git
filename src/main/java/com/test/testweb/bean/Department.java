package com.test.testweb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: wujianqinjian
 * @Date: 2021/6/6 5:51 上午
 */

@Component
@Entity
@Data
@AllArgsConstructor
public class Department {
    @Id
    private Integer department_id;
    private String department_name;
    private String secondary_department_id;
    private String secondary_department_name;
    public Department() {

    }
}
