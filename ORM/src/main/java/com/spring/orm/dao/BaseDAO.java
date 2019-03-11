package com.spring.orm.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 张文旭 on 2019/3/11.
 * 通用Dao接口
 */

public interface BaseDAO<T> extends Mapper<T>,MySqlMapper<T> {

}
