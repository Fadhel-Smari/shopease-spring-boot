package com.ecomerce.shopease_spring_boot.repository;


import com.ecomerce.shopease_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
