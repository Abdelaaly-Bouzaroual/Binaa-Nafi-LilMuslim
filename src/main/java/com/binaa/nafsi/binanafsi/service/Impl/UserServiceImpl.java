package com.binaa.nafsi.binanafsi.service.Impl;

import com.binaa.nafsi.binanafsi.dto.RegisterRequest;
import com.binaa.nafsi.binanafsi.entity.User;
import com.binaa.nafsi.binanafsi.mapper.UserMapper;
import com.binaa.nafsi.binanafsi.repository.UserRepository;
import com.binaa.nafsi.binanafsi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper; // Injection du Mapper

    @Override
    public User registerUser(RegisterRequest request) {
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Cet email est déjà utilisé !");
        }

        // Utilisation de MapStruct pour convertir DTO -> Entity
        User newUser = userMapper.toEntity(request);

        // Gestion manuelle du mot de passe (pour l'instant en clair, plus tard encodé)
        newUser.setPassword(request.getPassword());

        return userRepository.save(newUser);
    }
}