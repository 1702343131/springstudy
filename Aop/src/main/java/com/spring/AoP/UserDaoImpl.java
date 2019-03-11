package com.spring.AoP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.soap.SOAPBinding;

/**
 * Created by 张文旭 on 2019/3/7.
 */
public class UserDaoImpl implements UserDao {
  private static final Logger logger= (Logger) LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public String insert() {
    logger.debug("开始进行插入操作");
    return "";
    }
}
