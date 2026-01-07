package com.binaa.nafsi.binanafsi.mapper;


import com.binaa.nafsi.binanafsi.dto.RegisterRequest;
import com.binaa.nafsi.binanafsi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") // Pour l'injecter avec @Autowired
public interface UserMapper {

    // MapStruct va ignorer l'ID (généré) et le mot de passe (on le traite manuellement pour l'encoder)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "role", constant = "USER") // Valeur par défaut
    @Mapping(target = "active", constant = "true")
    User toEntity(RegisterRequest request);
}