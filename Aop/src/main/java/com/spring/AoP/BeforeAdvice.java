package com.spring.AoP;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


/**
 * Created by 张文旭 on 2019/3/7.
 */
public class BeforeAdvice {
    private  static final Logger logger = (Logger) LoggerFactory.getLogger(BeforeAdvice.class);

    public void beforeMethod(){
        logger.info("连接数据库");
    }
}
