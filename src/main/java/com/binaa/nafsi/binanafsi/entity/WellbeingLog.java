package com.binaa.nafsi.binanafsi.entity;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;
import lombok.Data;

@Embeddable
@Data
public class WellbeingLog {
    private Boolean sport;

    @Column(length = 500)
    private String sportDetails;

    private Boolean tarwih; // True/False

    @Column(length = 500)
    private String tarwihDetails; // "J'ai joué..."
}