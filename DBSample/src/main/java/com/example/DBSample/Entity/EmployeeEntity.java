package com.example.DBSample.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    private Long id;
    private String name;
    private String department;
    private double salary;

    EmployeeEntity() {
        // default constructor
    }

    // Constructors
    public EmployeeEntity(String name, String department, double salary,long id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id=id;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
