package com.binaa.nafsi.binanafsi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "users")
@Data // Lombok génère Getters, Setters, toString...
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    private String password; // On le stockera en clair pour l'instant (test)

    private String arabicName;

    private String telegramId;
    private String role;   // Ex: "USER", "ADMIN"
    private boolean active; // Ex: true (activé), false (banni)
}