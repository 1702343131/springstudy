package com.spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * Created by 张文旭 on 2019/3/4.
 */
public class App {
    public static void main(String[] args) {
//        @SuppressWarnings("resource")
//        ApplicationContext context = new
//                ClassPathXmlApplicationContext("spring.xml");
//        Meeting meeting = context.getBean(Meeting.class);
//        System.out.println(meeting);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Meeting meeting = (Meeting) context.getBean("meeting");
        System.out.println(meeting);
    }
}
