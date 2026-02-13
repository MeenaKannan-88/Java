package com.springboot.commanlinerunner.repository;

import com.springboot.commanlinerunner.entity.StudentMulEntity;
import com.springboot.commanlinerunner.entity.StudentMulEntity;
import com.springboot.commanlinerunner.entity.StudentMulEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<StudentMulEntity,Long> {

    //Get data by roll no and name which is not predefined in crud repo, we need to give column name of table in camelcase and respective operation like and, or, not
    List<StudentMulEntity> findByRollNoAndName(Long rollNo, String name);

    //Get data using normal sql query by enable native=true
    @Query(value = "SELECT * FROM students WHERE standard = ?1",
            nativeQuery = true)
    List<StudentMulEntity> findStudentsByStandardNative(String standard);

    @Query("SELECT s  FROM StudentEntity  s WHERE s.standard = :std and s.name=:name")
    List<StudentMulEntity> findStudentsJPQL(@Param("std") String standard, @Param("name") String name);
}
