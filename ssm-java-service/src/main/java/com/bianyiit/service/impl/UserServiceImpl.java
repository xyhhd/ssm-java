package com.bianyiit.service.impl;

import com.bianyiit.dao.UserDao;
import com.bianyiit.pojo.User;
import com.bianyiit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAll() {
        List<User> list = userDao.findAll();
        return list;
    }
}
