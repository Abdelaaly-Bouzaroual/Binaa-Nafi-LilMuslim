package com.binaa.nafsi.binanafsi.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Embeddable
@Data
public class KnowledgeLog {

    @Enumerated(EnumType.STRING)
    private CompletionStatus quranStatus;

    @Enumerated(EnumType.STRING)
    private CompletionStatus hadithStatus;

    // Enum interne ou globale
    public enum CompletionStatus {
        COMPLETE, PARTIAL, NONE
    }
}