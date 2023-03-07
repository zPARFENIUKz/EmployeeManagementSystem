package model.employee_manager;

import lombok.NonNull;
import model.ClassicEntityManagerFactory;
import model.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeManager {
    @PersistenceContext
    private final EntityManager em;

    public EmployeeManager(EntityManager em) {
        this.em = em;
    }
    public void addEmployee(@NonNull final Employee employee) {
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
    }

    public void deleteEmployee(@NonNull final Employee employee) {
        em.getTransaction().begin();
        em.remove(employee);
        em.getTransaction().commit();
    }

    public void updateEmployee(@NonNull final Employee employee) {
        em.getTransaction().begin();
        final Employee employeeRef = em.find(Employee.class, employee.getId());
        employeeRef.setName(employeeRef.getName());
        employeeRef.setPosition(employee.getPosition());
        employeeRef.setSalary(employee.getSalary());
        employeeRef.setJoinDate(employee.getJoinDate());
        em.getTransaction().commit();
    }

}
