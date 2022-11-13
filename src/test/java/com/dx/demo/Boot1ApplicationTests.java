package com.dx.demo;

import com.dx.demo.project.user.mapper.UserMapper;
import com.dx.demo.project.user.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Boot1ApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.getUserById("12345");
        System.out.println(user.toString());
    }

}
