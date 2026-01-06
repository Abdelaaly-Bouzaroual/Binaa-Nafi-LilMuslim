package com.binaa.nafsi.binanafsi.service;

import com.binaa.nafsi.binanafsi.dto.RegisterRequest;
import com.binaa.nafsi.binanafsi.entity.User;
import com.binaa.nafsi.binanafsi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User registerUser(RegisterRequest request) {
        // 1. Vérifier si l'email existe déjà
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Cet email est déjà utilisé !");
        }

        // 2. Créer l'utilisateur
        User newUser = new User();
        newUser.setEmail(request.getEmail());
        newUser.setArabicName(request.getArabicName());
        newUser.setTelegramId(request.getTelegramId());

        // Note : Pour l'instant on stocke le mot de passe en clair comme demandé.
        // Plus tard, on ajoutera l'encodeur ici.
        newUser.setPassword(request.getPassword());

        return userRepository.save(newUser);
    }
}