package model.employee_manager;

import model.ClassicEntityManagerFactory;
import model.entity.Employee;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManagerFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeManagerTest {

    @Test
    void addEmployee() {
        final Employee employee = Employee.builder()
                .name("Test Employee")
                .salary(5000)
                .position("Test position")
                .build();
        final EntityManagerFactory entityManagerFactory = ClassicEntityManagerFactory.getEntityManagerFactory();
        final EmployeeManager employeeManager = new EmployeeManager(entityManagerFactory.createEntityManager());
        employeeManager.addEmployee(employee);
    }
}