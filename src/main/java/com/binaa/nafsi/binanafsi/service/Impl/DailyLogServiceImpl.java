package com.binaa.nafsi.binanafsi.service.impl;

import com.binaa.nafsi.binanafsi.dto.DailyLogRequest;
import com.binaa.nafsi.binanafsi.entity.DailyLog;
import com.binaa.nafsi.binanafsi.entity.User;
import com.binaa.nafsi.binanafsi.mapper.DailyLogMapper;
import com.binaa.nafsi.binanafsi.repository.DailyLogRepository;
import com.binaa.nafsi.binanafsi.repository.UserRepository;
import com.binaa.nafsi.binanafsi.service.DailyLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DailyLogServiceImpl implements DailyLogService {

    private final DailyLogRepository dailyLogRepository;
    private final UserRepository userRepository;
    private final DailyLogMapper dailyLogMapper;

    @Override
    @Transactional
    public DailyLog saveLog(DailyLogRequest request, String userEmail) {
        // 1. Récupérer l'utilisateur
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable"));

        // 2. Vérifier la date (Si null, on prend aujourd'hui)
        LocalDate logDate = request.getDate() != null ? request.getDate() : LocalDate.now();

        // 3. Vérifier si un log existe déjà pour ce jour (Mise à jour ou Création ?)
        Optional<DailyLog> existingLog = dailyLogRepository.findByUserAndDate(user, logDate);

        DailyLog logToSave;
        if (existingLog.isPresent()) {
            // Logique de mise à jour (Update) - Pour l'instant on écrase
            // Idéalement, on utiliserait un mapper.updateEntityFromDto ici
            logToSave = existingLog.get();
            // Pour simplifier ce tutoriel, supprimons l'ancien et recréons le nouveau (simple mais pas opti)
            // Ou mieux : on mappe le nouveau et on force l'ID et l'User de l'ancien
            DailyLog newLogData = dailyLogMapper.toEntity(request);
            newLogData.setId(logToSave.getId()); // Garder le même ID
            newLogData.setUser(user);
            newLogData.setDate(logDate);
            logToSave = newLogData;
        } else {
            // Création (Create)
            logToSave = dailyLogMapper.toEntity(request);
            logToSave.setUser(user);
            logToSave.setDate(logDate);
        }

        return dailyLogRepository.save(logToSave);
    }
}