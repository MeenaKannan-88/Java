package com.springboot.commanlinerunner.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "coursesCommand")
public class CoursesEntity {

    @Id
    private Long courseId;

    private String courseName;

    @ManyToOne
    @JoinColumn(name = "rollNo")   // student foreign key
    private StudentMulEntity student;

    // Default constructor
    public CoursesEntity() {}

    // Constructor (without ID)
    public CoursesEntity(String courseName, StudentMulEntity student) {
        this.courseName = courseName;
        this.student = student;
    }

    // Getters and Setters
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentMulEntity getStudent() {
        return student;
    }

    public void setStudent(StudentMulEntity student) {
        this.student = student;
    }
}
