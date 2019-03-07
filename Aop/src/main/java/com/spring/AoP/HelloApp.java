package com.spring.AoP;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 张文旭 on 2019/3/7.
 */
public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getHello());
    }


}
