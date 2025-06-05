package com.ecomerce.shopease_spring_boot.controller;

import com.ecomerce.shopease_spring_boot.entity.Category;
import com.ecomerce.shopease_spring_boot.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "*")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Category> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Category create(@RequestBody Category category) {
        return service.save(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

