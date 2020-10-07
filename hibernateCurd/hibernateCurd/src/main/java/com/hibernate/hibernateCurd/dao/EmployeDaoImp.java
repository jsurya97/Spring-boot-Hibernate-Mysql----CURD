package com.hibernate.hibernateCurd.dao;

import com.hibernate.hibernateCurd.model.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeDaoImp implements EmployeDao {
    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Employee> get() {
        try {
            Session currentSession = entityManager.unwrap(Session.class);
            Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
            List<Employee> list = query.getResultList();
            return list;
        } catch (HibernateException ex) {
            throw new HibernateException("Exceptttttttt");
        }
    }

    @Override
    public Employee get(int id) {
        return null;
    }


    @Override
    public void save(Employee employee) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(employee);
    }

    @Override
    public void delete(int id) {

    }
}
