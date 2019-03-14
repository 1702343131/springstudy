package com.spring.web.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 张文旭 on 2019/3/14.
 */
public interface BaseDAO<T> extends Mapper<T>,MySqlMapper<T> {
}
