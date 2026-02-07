package com.springboot.studentsamplemultipletables.service;

import com.springboot.studentsamplemultipletables.entity.AddressEntity;
import com.springboot.studentsamplemultipletables.entity.CoursesEntity;
import com.springboot.studentsamplemultipletables.entity.StudentMulEntity;
import com.springboot.studentsamplemultipletables.repo.StudentMulRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentMulService {
    @Autowired
    private StudentMulRepo studentMulRepo;
    public StudentMulEntity saveStudent(StudentMulEntity student){
        return studentMulRepo.save(student);
    }

    public List<StudentMulEntity> getAllStudents() {
        return studentMulRepo.findAll();
    }

    public StudentMulEntity getStudentByRollNo(Long rollNo) {
        Optional<StudentMulEntity> optionalStudentMulPojo = studentMulRepo.findById(rollNo);
        StudentMulEntity optStudentEnt=null;
        if(optionalStudentMulPojo.isPresent()) {
            optStudentEnt = optionalStudentMulPojo.get();
        }
        return optStudentEnt;
    }

    public List<StudentMulEntity> getStudentByRollNoAndName(Long rollNo, String name) {
        List<StudentMulEntity> StudentMulPojoList = studentMulRepo.findByRollNoAndName(rollNo,name);
        return StudentMulPojoList;
    }

    public List<StudentMulEntity> getStudentByStandard(String standard) {
        List<StudentMulEntity> StudentMulPojoStandardList = studentMulRepo.findStudentsByStandardNative(standard);
        return StudentMulPojoStandardList;
    }

    public List<StudentMulEntity> getStudentsByJPQL( String standard,String name) {
        List<StudentMulEntity> studentsList = studentMulRepo.findStudentsJPQL(standard,name);
        return studentsList;
    }



    private AddressEntity address;
   // private List<CoursesEntity> coursesEntityList;


    public StudentMulEntity updateStudent(Long rollNo, StudentMulEntity updatedStudent) {
        StudentMulEntity student = getStudentByRollNo(rollNo);
        student.setName(updatedStudent.getName());
        student.setStandard(updatedStudent.getStandard());
        student.setTotalMarks(updatedStudent.getTotalMarks());
        student.setAddress(address);
//        student.setCourses(coursesEntityList);
        return studentMulRepo.save(student);
    }

//    public void deleteStudent(Long id) {
//        StudentMulRepo.deleteById(id);
//    }

}
