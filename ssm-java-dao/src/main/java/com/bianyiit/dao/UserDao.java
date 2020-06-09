package com.bianyiit.dao;

import com.bianyiit.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from tab_user")
    public List<User> findAll();
}
