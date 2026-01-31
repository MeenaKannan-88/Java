package com.example.studentdb;

import com.example.studentdb.entity.StudentEntity;
import com.example.studentdb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Create
    @PostMapping("/createStudent")
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.saveStudent(student);
    }

    // Read all
    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Read by id
    @GetMapping("/{rollNo}")
    public StudentEntity getStudentByRollNo(@PathVariable Long rollNo) {
        return studentService.getStudentByRollNo(rollNo);
    }


    // Update
    @PutMapping("/{rollNo}")
    public StudentEntity updateStudent(@PathVariable Long rollNo, @RequestBody StudentEntity student) {
        return studentService.updateStudent(rollNo, student);
    }

    // Delete
    @DeleteMapping("/{rollNo}")
    public String deleteStudent(@PathVariable Long rollNo) {
        studentService.deleteStudent(rollNo);
        return "Student deleted successfully with roll No " + rollNo;
    }
}






























