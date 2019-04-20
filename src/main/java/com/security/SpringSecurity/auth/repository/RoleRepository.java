
package com.security.SpringSecurity.auth.repository;

import com.security.SpringSecurity.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
