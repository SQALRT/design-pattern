package com.example.pattern_design.Dao;
import com.example.pattern_design.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
public interface RoleDao extends JpaRepository<Role, Long>{
    public Role findBydescription(String description);

}