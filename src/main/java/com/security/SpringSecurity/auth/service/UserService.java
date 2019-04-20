/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.security.SpringSecurity.auth.service;

import com.security.SpringSecurity.auth.model.User;

/**
 *
 * @author Sergio
 */
public interface UserService {
    void save(User user);
    
    User findByUsername(String username);
    
}
