package com.spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 张文旭 on 2019/3/4.
 */
public class MaxApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Max max = (Max) context.getBean("max");
        Max max = context.getBean(Max.class);
        System.out.println(max.getMax());

    }
}
