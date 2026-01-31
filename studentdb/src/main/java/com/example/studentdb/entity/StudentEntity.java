package com.example.studentdb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class StudentEntity {
    @Id
    private long rollNo;
    private String name;
    private String standard;
    private int totalMarks;

    //default constructor, needs to be created if no parameter constructor is not created
    StudentEntity(){
    }

    public StudentEntity(String name, String standard, long rollNo, int totalMarks) {
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
}
