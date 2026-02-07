package com.springboot.studentsamplemultipletables.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class CoursesEntity {

    @Id
    private Long id;
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "rollNo")
    private StudentMulEntity student;

    // getters & setters
    public CoursesEntity(){
    }

    public CoursesEntity(String courseName, long id) {
        this.id=id;
        this.courseName=courseName;
    }

    public Long getCourseId() {
        return id;
    }
    public void setCourseName(String name) {
        this.courseName=name;
    }
    public void setStudent(StudentMulEntity student) {
        this.student=student;
    }

}
