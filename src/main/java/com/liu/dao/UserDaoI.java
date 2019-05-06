package com.liu.dao;

import com.liu.entity.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoI extends HibernateDaoSupport implements UserDao {
    @Override
    public boolean login(String name, String password) {
        List<User> u = (List<User>) this.getHibernateTemplate().find("from User where name=? and password=?", name, password);
        Boolean flag = false;
        if (u.size() > 0) {
            flag = true;
        }
        return flag;
    }
}
