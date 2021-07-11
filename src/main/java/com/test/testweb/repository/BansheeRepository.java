package com.test.testweb.repository;

import com.test.testweb.bean.Banshee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wujianqinjian
 * @Date: 2021/5/13 2:27 下午
 */
public interface BansheeRepository extends JpaRepository<Banshee,Integer> {
}
