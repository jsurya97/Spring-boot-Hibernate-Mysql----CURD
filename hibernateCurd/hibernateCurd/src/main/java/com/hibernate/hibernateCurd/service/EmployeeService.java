package com.hibernate.hibernateCurd.service;

import com.hibernate.hibernateCurd.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
