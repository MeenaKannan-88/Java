package com.springboot.validation.service;

import com.springboot.validation.entity.PersonDetailsEntity;
import com.springboot.validation.mapper.ValidationMapper;
import com.springboot.validation.pojo.PersonDetailsPojo;
import com.springboot.validation.repo.PersonDetailsRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonDetailsService {
    @Autowired
    private PersonDetailsRepo personDetailsRepo;
    public PersonDetailsPojo savePerson(PersonDetailsPojo dto){

        PersonDetailsEntity entity = ValidationMapper.dtoToEntity(dto);
        PersonDetailsEntity saved = personDetailsRepo.save(entity);
        return ValidationMapper.entityToDto(saved);
    }
}
