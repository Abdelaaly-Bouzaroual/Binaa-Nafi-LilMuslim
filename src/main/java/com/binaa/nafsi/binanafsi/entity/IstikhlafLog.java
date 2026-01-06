package com.binaa.nafsi.binanafsi.entity;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;
import lombok.Data;

@Embeddable
@Data
public class IstikhlafLog {
    private Boolean readInField;

    @Column(length = 500)
    private String topicStudied;
}