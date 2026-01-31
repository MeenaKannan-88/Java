package com.example.studentdb.service;

import com.example.studentdb.entity.StudentEntity;
import com.example.studentdb.repository.StudentRepo;
import org.hibernate.annotations.CollectionIdMutability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public StudentEntity saveStudent(StudentEntity student){
        return studentRepo.save(student);
    }

    public List<StudentEntity> getAllStudents() {
        return studentRepo.findAll();
    }
    
    public StudentEntity getStudentByRollNo(Long rollNo) {
         Optional<StudentEntity> optionalStudentEntity = studentRepo.findById(rollNo);
         StudentEntity optStudentEnt=null;
         if(optionalStudentEntity.isPresent()) {
             optStudentEnt = optionalStudentEntity.get();
         }
         return optStudentEnt;
    }

    public StudentEntity updateStudent(Long rollNo, StudentEntity updatedStudent) {
        StudentEntity student = getStudentByRollNo(rollNo);
        student.setName(updatedStudent.getName());
        student.setStandard(updatedStudent.getStandard());
        student.setTotalMarks(updatedStudent.getTotalMarks());
        return studentRepo.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }

}
