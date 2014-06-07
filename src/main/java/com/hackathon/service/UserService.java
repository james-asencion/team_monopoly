/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hackathon.service;

import com.hackathon.dao.UserDAO;
import com.hackathon.dao.UserDAOImpl;
import com.hackathon.model.User;

/**
 *
 * @author Green Army
 */
public class UserService {
    private UserDAO userDAO;
    
    public UserService() {
        userDAO = new UserDAOImpl();
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }
    
    public User save(User user) {
        return userDAO.save(user);
    }
}
