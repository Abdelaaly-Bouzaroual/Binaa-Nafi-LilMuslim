package com.binaa.nafsi.binanafsi.mapper;

import com.binaa.nafsi.binanafsi.dto.DailyLogRequest;
import com.binaa.nafsi.binanafsi.entity.DailyLog;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DailyLogMapper {

    // On mappe les champs plats du DTO vers les objets imbriqués (Embedded) de l'entité

    // Mapping Prières
    @Mapping(target = "prayers.fajr", source = "fajr")
    @Mapping(target = "prayers.dohr", source = "dohr")
    @Mapping(target = "prayers.asr", source = "asr")
    @Mapping(target = "prayers.maghreb", source = "maghreb")
    @Mapping(target = "prayers.isha", source = "isha")
    @Mapping(target = "prayers.sunnahFajr", source = "sunnahFajr")
    @Mapping(target = "prayers.duha", source = "duha")
    @Mapping(target = "prayers.witr", source = "witr")

    // Mapping Knowledge
    @Mapping(target = "knowledge.quranStatus", source = "quranStatus")
    @Mapping(target = "knowledge.hadithStatus", source = "hadithStatus")

    // Mapping Wellbeing
    @Mapping(target = "wellbeing.sport", source = "sport")
    @Mapping(target = "wellbeing.sportDetails", source = "sportDetails")
    @Mapping(target = "wellbeing.tarwih", source = "tarwih")
    @Mapping(target = "wellbeing.tarwihDetails", source = "tarwihDetails")

    // Mapping Istikhlaf
    @Mapping(target = "istikhlaf.readInField", source = "readInField")
    @Mapping(target = "istikhlaf.topicStudied", source = "topicStudied")

    // Ignorer l'ID et l'Utilisateur (sera géré par le Service)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    DailyLog toEntity(DailyLogRequest request);
}