package com.bbs.service;

/**
 * @author 73598.
 * @Date 2018/5/11 0011.
 * @Time 12:24.
 */
public interface AccountService {
    /**
     * 转账
     * @param money
     * @param from
     * @param to
     */
    void  transfer(int money ,String from ,String to);
    /**
     * 转账 退回
     * @param money
     * @param from
     * @param to
     */
    void  transferBack(int money ,String from ,String to);
}
