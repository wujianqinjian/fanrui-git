package com.test.testweb.service.implement;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.testweb.bean.Account;
import com.test.testweb.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/12 7:12 上午
 */
@Service
public class AccountServiceImp implements AccountService {
    @Override
    public Account findByUsername(String username) {
        return null;
    }

    @Override
    public Account findByPassword(String password) {
        return null;
    }

    @Override
    public Account findById(Integer id) {
        return null;
    }

    @Override
    public void deleteAccount(Integer id) {
        System.out.println("test");
    }

    @Override
    public boolean saveBatch(Collection<Account> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Account> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Account> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Account entity) {
        return false;
    }

    @Override
    public Account getOne(Wrapper<Account> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Account> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Account> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Account> getBaseMapper() {
        return null;
    }

    @Override
    public Class<Account> getEntityClass() {
        return null;
    }
}
