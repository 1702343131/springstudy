package com.spring.orm.service;

import com.spring.orm.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.persistence.Id;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/11.
 */
public interface UserService {
    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int insertUser(User user);


    /**
     * 根据id删除用户
     *
     * @param  id
     * @return
     */
    int deleteUser(long id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
     int updateUser(User user);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> selectUsers();
    /**
    *@param id
     * @return
     *
    */
    User getUser(long id);
}
