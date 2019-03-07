package com.spring.AoP;

/**
 * Created by 张文旭 on 2019/3/7.
 * 用户自定义的前置增强类
 */

public class MyBeforeAdvice {
     public void beforeMethod(){
         System.out.println("this is a before method.");
     }
}
