package com.binaa.nafsi.binanafsi.controller;

import com.binaa.nafsi.binanafsi.dto.RegisterRequest;
import com.binaa.nafsi.binanafsi.service.UserService; // Import de l'Interface
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    // Spring injectera automatiquement UserServiceImpl ici
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        try {
            userService.registerUser(request);
            return ResponseEntity.ok("Utilisateur enregistré avec succès !");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}