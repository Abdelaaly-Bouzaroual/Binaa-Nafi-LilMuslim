package com.binaa.nafsi.binanafsi.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String password;
    private String arabicName;
    private String telegramId;
}