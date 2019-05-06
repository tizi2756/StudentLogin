package com.liu.service;

import com.liu.dao.UserDao;
import com.liu.dao.UserDaoI;

public class UserService implements UserServiceI {
    private UserDao userDao;

    public void setUserDao(UserDaoI userDaoI) {
        this.userDao = userDaoI;
    }

    @Override
    public boolean login(String name, String password) {
        return userDao.login(name, password);
    }

}
