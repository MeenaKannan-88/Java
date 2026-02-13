package com.springboot.commanlinerunner.runner;

import com.springboot.commanlinerunner.entity.AddressEntity;
import com.springboot.commanlinerunner.entity.CoursesEntity;
import com.springboot.commanlinerunner.entity.StudentMulEntity;
import com.springboot.commanlinerunner.repository.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {
        @Autowired
        private StudentRepo studentRepo;
        private static final Logger logger = (Logger) LoggerFactory.getLogger(StudentCommandLineRunner.class);


    @Override
        public void run(String... args) {

            // ---------------- STUDENT ----------------
            StudentMulEntity student = new StudentMulEntity();
            student.setRollNo(389L);
            student.setName("Sharmi");
            student.setStandard("VII");
            student.setTotalMarks(78);

            // ---------------- ADDRESS ----------------
            AddressEntity address = new AddressEntity();
            address.setStreet("Madurai Road");
            address.setCity("Madurai");
            address.setPincode("600001");
            address.setId(4545L);

            // 🔥 Link both sides (IMPORTANT)
            address.setStudent(student);
            student.setAddress(address);
            logger.info("Address" + address);
            logger.info("Student:"+student);

            // ---------------- COURSES ----------------
            CoursesEntity course1 = new CoursesEntity();
            course1.setCourseName("Science");
            course1.setCourseId(234L);


            CoursesEntity course2 = new CoursesEntity();
            course2.setCourseName("Social");
            course2.setCourseId(3424L);


            // 🔥 Link student in courses
            course1.setStudent(student);
            course2.setStudent(student);

            logger.info("Course 1" + String.valueOf(course1));
            logger.info("Course 2" + String.valueOf(course2));
            List<CoursesEntity> courseList = List.of(course1,course2);
            student.setCourses(courseList);
            logger.info("Hello");
            logger.info(String.valueOf(student));
            // ---------------- SAVE ----------------
            studentRepo.save(student);

            System.out.println("Student, Address, Courses saved successfully ✅");
        }
    }
