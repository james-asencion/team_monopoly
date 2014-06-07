/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hackathon.dao;

import com.hackathon.model.User;
import java.util.List;

/**
 *
 * @author Green Army
 */
public interface UserDAO {
    public User save(User user);
    public List<User> getUsers();
}
