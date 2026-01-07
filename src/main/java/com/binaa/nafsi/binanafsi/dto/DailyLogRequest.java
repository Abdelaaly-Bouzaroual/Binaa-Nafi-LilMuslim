package com.binaa.nafsi.binanafsi.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class DailyLogRequest {

    private LocalDate date; // La date du bilan

    // --- 1. Prières ---
    private Boolean fajr;
    private Boolean dohr;
    private Boolean asr;
    private Boolean maghreb;
    private Boolean isha;

    // --- 2. Sunan ---
    private Boolean sunnahFajr;
    private Boolean duha;
    private Boolean witr;

    // --- 3. Quran & Science ---
    // On utilise des String pour les Enums dans le DTO pour éviter les erreurs de désérialisation directes
    private String quranStatus;   // COMPLETE, PARTIAL, NONE
    private String hadithStatus;  // COMPLETE, PARTIAL, NONE

    // --- 4. Bien-être ---
    private Boolean sport;
    private String sportDetails;
    private Boolean tarwih;
    private String tarwihDetails;

    // --- 5. Istikhlaf ---
    private Boolean readInField;
    private String topicStudied;

    // --- 6. Note ---
    private String dailyReflection;
}