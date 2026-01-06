package com.binaa.nafsi.binanafsi.entity;


import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class PrayerLog {
    private Boolean fajr;
    private Boolean dohr;
    private Boolean asr;
    private Boolean maghreb;
    private Boolean isha;

    // Sunan
    private Boolean sunnahFajr;
    private Boolean duha;
    private Boolean witr;
}