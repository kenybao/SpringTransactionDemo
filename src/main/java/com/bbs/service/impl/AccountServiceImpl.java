package com.bbs.service.impl;

import com.bbs.dao.AccountDao;
import com.bbs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 73598.
 * @Date 2018/5/11 0011.
 * @Time 12:25.
 */
@Service("accountService")
//Transactional可加在方法头部
//@Transactional(noRollbackFor = ArithmeticException.class)//如果捕捉到ArithmeticException异常 不回滚
//@Transactional(rollbackFor = ArithmeticException.class)//如果捕捉到ArithmeticException异常 则回滚
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;

    /**
     * 转账
     * @param money
     * @param from
     * @param to
     */
    @Override
    @Transactional(rollbackFor = ArithmeticException.class)//如果捕捉到ArithmeticException异常 则回滚
    public void transfer(int money, String from, String to) {
        accountDao.payFrom(money, from);
        accountDao.payTo(money, to);
    }
    /**
     * 转账
     * @param money
     * @param from
     * @param to
     */
    @Override
    @Transactional
    public void transferBack(int money, String from, String to) {
        System.out.println("123123");
    }
}
