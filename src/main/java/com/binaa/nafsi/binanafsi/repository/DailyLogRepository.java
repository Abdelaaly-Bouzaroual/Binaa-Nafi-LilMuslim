package com.binaa.nafsi.binanafsi.repository;


import com.binaa.nafsi.binanafsi.entity.DailyLog;
import com.binaa.nafsi.binanafsi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.Optional;
import java.util.List;

public interface DailyLogRepository extends JpaRepository<DailyLog, Long> {
    // Trouver le log d'un user pour une date précise
    Optional<DailyLog> findByUserAndDate(User user, LocalDate date);

    // Récupérer l'historique complet d'un user
    List<DailyLog> findByUserOrderByDateDesc(User user);
}