package com.binaa.nafsi.binanafsi.controller;

import com.binaa.nafsi.binanafsi.dto.DailyLogRequest;
import com.binaa.nafsi.binanafsi.service.DailyLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")
@RequiredArgsConstructor
public class DailyLogController {

    private final DailyLogService dailyLogService;

    @PostMapping
    public ResponseEntity<?> saveLog(@RequestBody DailyLogRequest request) {
        // Pour l'instant, on simule l'utilisateur connecté (car on a désactivé la sécurité)
        // Plus tard, on récupérera l'email depuis le Token JWT
        String fakeUserEmail = "abdelaaly@test.com";

        try {
            dailyLogService.saveLog(request, fakeUserEmail);
            return ResponseEntity.ok("Bilan enregistré avec succès !");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}