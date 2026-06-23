package com.personal.main.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository; // 切换为传统 CRUD 接口

import com.personal.main.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}