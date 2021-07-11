package com.test.testweb.bean.bilibili;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/28 5:15 下午
 */
@AllArgsConstructor
@Data
@Entity
public class Tmptestclass {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private  String tmpName;

    public Tmptestclass() {
    }

    @Override
    public String toString() {
        return "Tmptestclass{" +
                "id=" + id +
                ", tmpName='" + tmpName + '\'' +
                '}';
    }
}
