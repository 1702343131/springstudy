package com.spring.AoP;

/**
 * Created by 张文旭 on 2019/3/7.
 */
public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "Hello, spring aop";
    }
}
