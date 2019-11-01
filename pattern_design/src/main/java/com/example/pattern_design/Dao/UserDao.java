package com.example.pattern_design.Dao;
import com.example.pattern_design.entity.Role;
import com.example.pattern_design.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserDao extends JpaRepository<User, Long>{
    public User findByUsername(String username);
}