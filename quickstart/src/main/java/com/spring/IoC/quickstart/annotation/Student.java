package com.spring.IoC.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 张文旭 on 2019/2/28.
 */
@Component
@Data
public class Student {
    @Value("Tom")
    private  String name;
    @Value("20")
    private  int age;

    @Autowired
    private Phone phone;
}
