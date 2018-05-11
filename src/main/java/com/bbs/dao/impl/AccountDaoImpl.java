package com.bbs.dao.impl;

import com.bbs.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * @author 73598.
 * @Date 2018/5/11 0011.
 * @Time 10:49.
 */
@Component
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Autowired
    DataSource dataSource;

    //PostConstruct 用于在依赖关系注入完成之后需要执行的方法上，以执行任何初始化
    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void payFrom(int money, String name) {
        String sql = "UPDATE account SET money = money-? WHERE name = ?";
        this.getJdbcTemplate().update(sql, money, name);
    }

    @Override
    public void payTo(int money, String name) {
        String sql = "UPDATE account SET money = money+? WHERE name = ?";
        this.getJdbcTemplate().update(sql, money, name);
    }
}
