package org.example;

import dao.EmployeeDAO;
import entity.Employee;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        try {
            Employee emp1 = new Employee("Pratap", 20000.0);
            Employee emp2 = new Employee("Chandra", 20000.0);
            Employee emp3 = new Employee("Ramana", 20000.0);

            employeeDAO.saveEmployee(emp1);
            employeeDAO.saveEmployee(emp2);
            employeeDAO.saveEmployee(emp3);

            emp1.setSalary(30000);
            employeeDAO.updateEmployee(emp1);

            List<Employee> employeeList = employeeDAO.getAllEmployee();
            if (employeeList != null) {
                employeeList.forEach(System.out::println);
            }

            employeeDAO.deleteEmployee(3);

            System.out.println("\nAfter deletion:");
            employeeList = employeeDAO.getAllEmployee();
            if (employeeList != null) {
                employeeList.forEach(System.out::println);
            }

        } finally {
            HibernateUtil.closeSessionFactory();
        }
    }
}