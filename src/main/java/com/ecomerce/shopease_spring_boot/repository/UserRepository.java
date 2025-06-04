package com.ecomerce.shopease_spring_boot.repository;


import com.ecomerce.shopease_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
