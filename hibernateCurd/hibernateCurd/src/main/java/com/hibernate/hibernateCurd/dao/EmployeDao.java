package com.hibernate.hibernateCurd.dao;

import com.hibernate.hibernateCurd.model.Employee;

import java.util.List;

public interface EmployeDao {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
