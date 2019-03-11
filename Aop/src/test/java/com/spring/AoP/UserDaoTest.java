package com.spring.AoP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 张文旭 on 2019/3/7.
 */
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)//反射
//指定配置文件路径
@ContextConfiguration(locations = {"/spring.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao user;

    @Test
    public void insert() throws Exception {
        assertEquals("",user.insert());
    }

}