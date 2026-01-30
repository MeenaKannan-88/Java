package com.example.DBSample.Controller;

import com.example.DBSample.Entity.EmployeeEntity;
import com.example.DBSample.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create
    @PostMapping("/createEmployee")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.saveEmployee(employee);
    }

    // Read all
    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Read by id
    @GetMapping("/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
/*.....* */
    // Read by department
    @GetMapping("/department/{dept}")
    public List<EmployeeEntity> getByDepartment(@PathVariable("dept") String department) {
        return employeeService.getEmployeesByDepartment(department);
    }

    // Update
    @PutMapping("/{id}")
    public EmployeeEntity updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity employee) {
        return employeeService.updateEmployee(id, employee);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully with id " + id;
    }
}






























