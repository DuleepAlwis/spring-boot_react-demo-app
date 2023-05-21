package com.empms.Controller;

import com.empms.Repository.EmployeeRepository;
import com.empms.Entity.Employee;
import java.util.List;

import com.empms.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value="/saveEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        return this.employeeService.createEmployee(employee);
    }

    @GetMapping(value="/getAll")
    public List<Employee> getAllEmployee(){
        return this.employeeService.getAllEmployee();
    }
}
