package com.portglint.first.controller;

import com.portglint.first.dto.AuthRequest;
import com.portglint.first.dto.AuthResponse;
import com.portglint.first.model.User;
import com.portglint.first.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*", allowedHeaders = "*") // Allow all origins
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    @CrossOrigin // Allow cross-origin requests for login
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest authRequest) {
        AuthResponse response = authService.login(authRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    @CrossOrigin // Allow cross-origin requests for register
    public ResponseEntity<AuthResponse> register(@RequestBody AuthRequest authRequest) {
        // Convert AuthRequest to User
        User user = new User();
        user.setEmail(authRequest.getEmail());
        user.setPassword(authRequest.getPassword());
        
        AuthResponse response = authService.register(user);
        return ResponseEntity.ok(response);
    }
}
