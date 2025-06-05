package com.ecomerce.shopease_spring_boot.repository;

import com.ecomerce.shopease_spring_boot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

