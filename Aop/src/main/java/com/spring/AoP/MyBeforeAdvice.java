package com.spring.AoP;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import javax.swing.*;

/**
 * Created by 张文旭 on 2019/3/7.
 * 用户自定义的前置增强类
 */

public class MyBeforeAdvice {
    private static final Logger logger= (Logger) LoggerFactory.getLogger(MyBeforeAdvice.class);
     public void beforeMethod(){
         logger.info("this is a before method by zhang");
         //System.out.println("this is a before method.");
     }
}
