package com;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


// 参考https://www.jianshu.com/p/201019d89dfe 配置
/**
 * @author 73598.
 * @Date 2018/5/11 0011.
 * @Time 10:50.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//加载测试配置文件 可加载多个
@ContextConfiguration("classpath:spring-config.xml")
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true) //已过时 注解标记推荐使用RoolBack
//@Transactional//开启 事务控制 有这个注解 @roolback才能生效
//@Rollback(false) //默认回滚 也可加在方法上
public class BaseTest {
    @Before
    public void before(){
        System.out.println("------------------before------------------");
    }
    @After
    public void after(){
        System.out.println("------------------after------------------");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("------------------BeforeClass------------------");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("------------------AfterClass--------------");
    }


}