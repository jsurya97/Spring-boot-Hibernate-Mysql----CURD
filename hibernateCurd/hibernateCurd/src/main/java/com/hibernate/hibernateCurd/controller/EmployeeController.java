package com.hibernate.hibernateCurd.controller;

import com.hibernate.hibernateCurd.model.Employee;
import com.hibernate.hibernateCurd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get() {
        List<Employee> employees = employeeService.get();
        System.out.println(employees);
        return employees;
    }

    @PostMapping("/saveEmployee")
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;

    }
}
