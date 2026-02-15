package com.springboot.validation.mapper;

import com.springboot.validation.entity.PersonDetailsEntity;
import com.springboot.validation.pojo.PersonDetailsPojo;

public class ValidationMapper {

    // DTO -> Entity
    public static PersonDetailsEntity dtoToEntity(PersonDetailsPojo dto) {
        if (dto == null) return null;

        PersonDetailsEntity entity = new PersonDetailsEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());

        return entity;
    }

    // Entity -> DTO
    public static PersonDetailsPojo entityToDto(PersonDetailsEntity entity) {
        if (entity == null) return null;

        PersonDetailsPojo dto = new PersonDetailsPojo();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());

        return dto;
    }
}
