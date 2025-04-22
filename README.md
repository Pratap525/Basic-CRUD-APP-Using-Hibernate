# Basic CRUD Application Using Hibernate

A simple Java application demonstrating CRUD (Create, Read, Update, Delete) operations using Hibernate ORM framework with a MySQL database.

## Project Overview

This project serves as a practical example of how to use Hibernate ORM to interact with a relational database. It implements basic CRUD functionality for an Employee entity, showcasing the power and simplicity of using Hibernate for database operations compared to traditional JDBC.

## Technologies Used

- Java 17
- Maven 
- Hibernate ORM 6.0.2.Final
- MySQL Connector 8.0.33
- MySQL Database

## Project Structure

```
BasicCrudApp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── dao/
│   │   │   │   └── EmployeeDAO.java     # Data Access Object for CRUD operations
│   │   │   ├── entity/
│   │   │   │   └── Employee.java        # Employee entity class with Hibernate annotations
│   │   │   ├── util/
│   │   │   │   └── HibernateUtil.java   # Utility class for Hibernate SessionFactory
│   │   │   └── org/example/
│   │   │       └── Main.java            # Application entry point
│   │   └── resources/
│   │       └── hibernate.cfg.xml        # Hibernate configuration file
└── pom.xml                              # Maven project configuration
```

## Features

- **Create**: Add new employee records to the database
- **Read**: Retrieve employee records by ID or fetch all employees
- **Update**: Modify existing employee information
- **Delete**: Remove employee records from the database
- **Automatic table creation/updates** using Hibernate's schema tool

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven
- MySQL Server
- IDE (IntelliJ IDEA, Eclipse, or any preferred Java IDE)

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/Pratap525/Basic-CRUD-APP-Using-Hibernate.git
   cd Basic-CRUD-APP-Using-Hibernate
   ```

2. **Database Configuration**
   - Create a MySQL database
   - Update the database connection details in `src/main/resources/hibernate.cfg.xml`:
     ```xml
     <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database</property>
     <property name="hibernate.connection.username">your_username</property>
     <property name="hibernate.connection.password">your_password</property>
     ```

3. **Build the project**
   ```bash
   mvn clean install
   ```

## How to Run

1. **Via IDE**
   - Open the project in your preferred IDE
   - Run the `Main.java` class

2. **Via Command Line**
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```

## Usage Examples

The application demonstrates the following operations:

```java
// Create a new employee
Employee employee = new Employee("John Doe", "IT", 75000.0);
employeeDAO.saveEmployee(employee);

// Retrieve an employee
Employee retrievedEmployee = employeeDAO.getEmployee(1);

// Update employee information
retrievedEmployee.setSalary(80000.0);
employeeDAO.updateEmployee(retrievedEmployee);

// Delete an employee
employeeDAO.deleteEmployee(2);

// Get all employees
List<Employee> employees = employeeDAO.getAllEmployees();
```

