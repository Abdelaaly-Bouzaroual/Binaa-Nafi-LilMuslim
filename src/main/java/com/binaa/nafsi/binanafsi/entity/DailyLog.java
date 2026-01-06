package com.binaa.nafsi.binanafsi.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "daily_logs", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "date"})
})
@Data
public class DailyLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // --- 1. Prières (Embeddable) ---
    @Embedded
    private PrayerLog prayers;

    // --- 2. Quran & Science (Embeddable) ---
    @Embedded
    private KnowledgeLog knowledge;

    // --- 3. Bien-être (Sport/Tarwih) ---
    @Embedded
    private WellbeingLog wellbeing;

    // --- 4. Istikhlaf (Pro) ---
    @Embedded
    private IstikhlafLog istikhlaf;

    // Note générale
    @Column(length = 1000)
    private String dailyReflection;
}