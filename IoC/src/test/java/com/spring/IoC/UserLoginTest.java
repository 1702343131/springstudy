package com.spring.IoC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by 张文旭 on 2019/3/4.
 */
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)//反射
//指定配置文件路径
@ContextConfiguration(locations = {"/spring.xml"})
public class UserLoginTest {
    @Autowired
    private UserLogin userLogin;

    @Test
    public void userLogin() throws Exception {
        assertEquals(false,userLogin.userLogin(userLogin.getUser()));

    }

}