package com.security.SpringSecurity.auth.repository;

import com.security.SpringSecurity.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
    
    
}
