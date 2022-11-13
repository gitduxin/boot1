package com.dx.demo.project.user.mapper;

import com.dx.demo.project.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select userId, userName, password from user where userId = #{userId}")
    User getUserById(String userId);
}
