package com.springboot.studentsamplemultipletables.controller;

import com.springboot.studentsamplemultipletables.entity.StudentMulEntity;
import com.springboot.studentsamplemultipletables.service.StudentMulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentsMulti")
public class StudentMultiController {

    @Autowired
    private StudentMulService studentMulService;

    // Create
    @PostMapping("/createStudent")
    public StudentMulEntity createStudent(@RequestBody StudentMulEntity student) {
        return studentMulService.saveStudent(student);
    }

    // Read all
    @GetMapping
    public List<StudentMulEntity> getAllStudents() {
        return studentMulService.getAllStudents();
    }

    // Read by id
    @GetMapping("/{rollNo}")
    public StudentMulEntity getStudentByRollNo(@PathVariable Long rollNo) {
        return studentMulService.getStudentByRollNo(rollNo);
    }

    @GetMapping("/{rollNo}/{name}")
    public List<StudentMulEntity> getStudentByRollNoAndName(@PathVariable Long rollNo,@PathVariable String name) {
        return studentMulService.getStudentByRollNoAndName(rollNo,name);
    }

    @GetMapping("/{standard}")
    public List<StudentMulEntity> getStudentByStandard(@PathVariable String standard) {
        return studentMulService.getStudentByStandard(standard);
    }

    @GetMapping("/{standard}/{name}")
    public List<StudentMulEntity> getStudentsByJPQL(@PathVariable String standard, @PathVariable String name) {
        return studentMulService.getStudentsByJPQL(standard,name);
    }


    // Update
    @PutMapping("/{rollNo}")
    public StudentMulEntity updateStudent(@PathVariable Long rollNo, @RequestBody StudentMulEntity student) {
        return studentMulService.updateStudent(rollNo, student);
    }

//    // Delete
//    @DeleteMapping("/{rollNo}")
//    public String deleteStudent(@PathVariable Long rollNo) {
//        studentMulService.deleteStudent(rollNo);
//        return "Student deleted successfully with roll No " + rollNo;
//    }
}






























