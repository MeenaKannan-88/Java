package com.springboot.validation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "PersonDetails")
public class PersonDetailsEntity {

    @Id
    @NotNull(message = "Id should not be null")
    @Positive(message = "Value should be positive number")
    int id;
    String name;
    String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
