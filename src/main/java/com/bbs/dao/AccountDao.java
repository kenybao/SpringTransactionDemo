package com.bbs.dao;
/**
 * @author 73598.
 * @Date 2018/5/11 0011.
 * @Time 10:47.
 */
public interface AccountDao {
    void payFrom(int money, String name);
    void payTo(int money, String name);

}
