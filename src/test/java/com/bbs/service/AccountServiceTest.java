package com.bbs.service;

import com.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 73598.
 * @Date 2018/5/11 0011.
 * @Time 12:26.
 */
public class AccountServiceTest extends BaseTest {
    @Autowired
    AccountService accountService2;
    @Test
    public void transfer() throws Exception {
        accountService2.transfer(10,"aaa","bbb");
        accountService2.transferBack(10,"aaa","bbb");
    }

}