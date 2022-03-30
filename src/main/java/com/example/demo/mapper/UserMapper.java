package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    User getUserByName(String username);

    @Insert("insert into user(username, password, nickname, email) values (#{username}, #{password}, #{nickname}, #{email})")
    int insertUser(User user);

    @Update("update user set password = #{password}, username = #{username}, nickname = #{nickname}, email = #{email} " +
        "where username = #{username}")
    int updateUser(User user);
}

