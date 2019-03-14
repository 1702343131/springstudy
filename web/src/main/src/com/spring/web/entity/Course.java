package com.spring.web.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 张文旭 on 2019/3/14.
 */
@Table(name = "t_course")
@Data
public class Course {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String coursename;
    private Long userId;
    private String courseClass;
    private  String cover;
    private String courseCode;
    private Short finished;
}
