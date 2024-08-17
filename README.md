### README.md

# Employee Management System

This Java-based Employee Management System allows for managing employee records, including operations such as adding, viewing, updating, and deleting employee details. The system uses an Oracle database for data storage.

## Features

- **Add Employee**: Add a new employee record to the database.
- **View All Employees**: Display details of all employees.
- **View Employee by ID**: Retrieve and display details of a specific employee using their ID.
- **Update Employee**: Update the name of an existing employee.
- **Delete Employee**: Remove an employee record from the database.

## Technologies Used

- **Java**: Core language for the application.
- **Oracle SQL**: Database management and query execution.
- **JDBC**: Java Database Connectivity for connecting to the Oracle database.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Oracle Database
- IDE (e.g., Eclipse, IntelliJ IDEA)

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/EmployeeManagementSystem.git
   ```
2. Import the project into your IDE (I used the Eclipse IDE).

3. Update the database connection details in `DBConnection.java`:
   ```java
   String url="jdbc:oracle:thin:@localhost:1521:xe";
   String username="your-username";
   String password="your-password";
   ```

4. Ensure your Oracle database is running and the necessary tables (e.g., `EMPLOYEE`) are created.

### Running the Application

1. Compile and run the `Main.java` class.
2. Use the provided menu options to interact with the Employee Management System.

## Project Structure

- **DBConnection.java**: Handles the connection to the Oracle database.
- **Employee.java**: Plain Old Java Object (POJO) representing an employee.
- **EmployeeDAOImpl.java**: Implements CRUD operations defined in the `EmployeeDAOIntf` interface.
- **EmployeeDAOIntf.java**: Interface defining methods for employee operations.
- **Main.java**: Entry point of the application, providing a command-line interface.

## License

This project is licensed under the MIT License.

