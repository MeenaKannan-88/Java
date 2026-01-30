package com.example.DBSample.Service;

import com.example.DBSample.Entity.EmployeeEntity;
import com.example.DBSample.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepository;

    public EmployeeEntity saveEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    public List<EmployeeEntity> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public EmployeeEntity updateEmployee(Long id, EmployeeEntity updatedEmployee) {
        EmployeeEntity emp = getEmployeeById(id);
        emp.setName(updatedEmployee.getName());
        emp.setDepartment(updatedEmployee.getDepartment());
        emp.setSalary(updatedEmployee.getSalary());
        return employeeRepository.save(emp);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

