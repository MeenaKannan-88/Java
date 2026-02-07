package com.springboot.studentsamplemultipletables.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="studentsOnetoOne")
public class StudentMulEntity {
    @Id
    private long rollNo;
    private String name;
    private String standard;
    private int totalMarks;

    //default constructor, needs to be created if no parameter constructor is not created
    public StudentMulEntity(){
    }

    public StudentMulEntity(String name, String standard, long rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
        this.standard = standard;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard=standard;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks=totalMarks;
    }


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")   // FK column
    private AddressEntity address;

    public void setAddress(AddressEntity address) {
        this.address=address;
    }

//    // One-to-Many with Courses
//    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
//    private List<CoursesEntity> courses;
//    public void setCourses(List<CoursesEntity> courses) {
//        this.courses=courses;
//    }

    }

