package com.spring.orm.service.impl;

import com.spring.orm.entity.User;
import com.spring.orm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import static org.junit.Assert.*;
/**
 * Created by 张文旭 on 2019/3/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setAccount("e");
        user.setCredits(500 );
        user.setPassword("555");
        int n = userService.insertUser( user );
        assertEquals(1,n);
    }

    @Test
    public void deleteUser() throws Exception {
        int n = userService.deleteUser(3);
        assertEquals(1,n);
    }

    @Test
    public void updateUser() throws Exception {
        User user = userService.getUser(2);
        user.setPassword( "1702343131" );
        user.setCredits( 8888888 );
        int n = userService.updateUser( user );
        assertEquals( 1,n);
    }

    @Test
    public void selectUsers() throws Exception {
        List<User> users = userService.selectUsers();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void getUser() throws Exception {
        User user = userService.getUser(2);
        System.out.println(user);
    }

}