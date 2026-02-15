package com.springboot.validation.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class PersonDetailsPojo {

        @NotNull(message = "Id should not be null")
        @Positive(message = "Value should be positive number")
        int id;
        @NotNull(message = "Name should not be blank")
        String name;
        @Email(message = "Is not valid")
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
