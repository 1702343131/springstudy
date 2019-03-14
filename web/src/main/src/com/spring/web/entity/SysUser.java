package com.spring.web.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 张文旭 on 2019/3/14.
 */
@Table(name = "t_sys_user")
@Data
public class SysUser {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long userId;
    private String mobile;
    private String password;
    private String username;
    private String avatar;

}
