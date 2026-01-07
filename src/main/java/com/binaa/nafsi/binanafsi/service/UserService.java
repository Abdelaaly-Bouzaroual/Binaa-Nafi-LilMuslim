package com.binaa.nafsi.binanafsi.service;

import com.binaa.nafsi.binanafsi.dto.RegisterRequest;
import com.binaa.nafsi.binanafsi.entity.User;

public interface UserService {
    User registerUser(RegisterRequest request);
}