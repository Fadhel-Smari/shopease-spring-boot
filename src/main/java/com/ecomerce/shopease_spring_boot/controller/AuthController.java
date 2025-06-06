package com.ecomerce.shopease_spring_boot.controller;

import com.ecomerce.shopease_spring_boot.dto.AuthResponse;
import com.ecomerce.shopease_spring_boot.dto.LoginRequest;
import com.ecomerce.shopease_spring_boot.dto.RegisterRequest;
import com.ecomerce.shopease_spring_boot.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.authenticate(request));
    }
}

