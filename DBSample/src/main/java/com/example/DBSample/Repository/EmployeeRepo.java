package com.example.DBSample.Repository;
import com.example.DBSample.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

    // Custom query method
    List<EmployeeEntity> findByDepartment(String department);
}
