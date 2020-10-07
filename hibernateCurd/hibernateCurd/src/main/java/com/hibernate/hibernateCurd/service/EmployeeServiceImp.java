package com.hibernate.hibernateCurd.service;

import com.hibernate.hibernateCurd.dao.EmployeDao;
import com.hibernate.hibernateCurd.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeDao employeDao;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeDao.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeDao.save(employee);

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
