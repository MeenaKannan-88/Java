package com.springboot.commanlinerunner.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "addressCommand")
public class AddressEntity {

    @Id
    private Long id;

    private String street;
    private String city;
    private String pincode;

    // getters & setters
    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @OneToOne
    @JoinColumn(name = "rollNo")
    private StudentMulEntity student;
    public void setStudent(StudentMulEntity student) {
        this.student=student;
    }

}
