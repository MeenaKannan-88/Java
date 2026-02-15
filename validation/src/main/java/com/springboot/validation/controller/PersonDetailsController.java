package com.springboot.validation.controller;

import com.springboot.validation.entity.PersonDetailsEntity;
import com.springboot.validation.pojo.PersonDetailsPojo;
import com.springboot.validation.service.PersonDetailsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PersonDetails")
public class PersonDetailsController {

    @Autowired
    private PersonDetailsService personDetailsService;

    @PostMapping("/createStudent")
    public PersonDetailsPojo createStudent(@Valid @RequestBody PersonDetailsPojo person) {
        return personDetailsService.savePerson(person);
    }
}


