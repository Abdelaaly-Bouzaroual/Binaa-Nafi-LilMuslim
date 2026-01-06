package com.binaa.nafsi.binanafsi.repository;


import com.binaa.nafsi.binanafsi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}