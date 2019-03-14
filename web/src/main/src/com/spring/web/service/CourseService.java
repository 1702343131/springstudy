package com.spring.web.service;

import com.spring.web.entity.Course;
import com.spring.web.entity.CourseVO;

import java.util.List;

/**
 * Created by 张文旭 on 2019/3/14.
 */
public interface CourseService {
    List<CourseVO> selectCurrentCourses();
}
