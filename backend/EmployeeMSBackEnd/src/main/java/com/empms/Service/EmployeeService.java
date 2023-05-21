package com.empms.Service;

import com.empms.Entity.Employee;
import java.util.List;

import com.empms.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return this.employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployee(){
        return this.employeeRepository.findAll();
    }
}
