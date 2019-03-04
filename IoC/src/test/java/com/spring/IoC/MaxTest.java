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
public class MaxTest {
    //自动注入  max
    @Autowired
    private Max max;
    @Test
    public void getMax() throws Exception {
     assertEquals(5,max.getMax());
    }

}