/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hackathon.dao;

import com.hackathon.model.User;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Green Army
 */
@Repository("UserDAO")
@Transactional
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
    
    @Transactional
    public User save(User user) {
        Serializable s = getHibernateTemplate().save(user);
        user.setUserId((Long)s);
        return user;
    }

    @Transactional
    public List<User> getUsers() {
        HibernateTemplate template = getHibernateTemplate();
        return (List<User>) template.find("from " + User.class.getName());
    }
}
