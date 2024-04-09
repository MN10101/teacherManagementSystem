# Teacher Management System

This project implements a simple Teacher Management System using Java and Spring Framework.

## Overview

The project consists of several components:

- **Controller**: Handles HTTP requests and manages the flow of the application.
- **Service Layer**: Contains the business logic of the application.
- **DAO (Data Access Object)**: Provides an interface between the application and the database.

## Controller

The `TeacherController` class manages requests related to teachers. It handles operations such as retrieving all teachers, adding a new teacher, updating a teacher, and deleting a teacher.

```java
@Controller
@RequestMapping("/teachers")
public class TeacherController {
    // Controller methods
}
Service Layer
The TeacherService class contains methods to interact with the database and perform operations on teacher entities. It implements the TeacherServiceInterface.

java
Copy code
@Service
public class TeacherService implements TeacherServiceInterface {
    // Service methods
}
DAO
The TeacherRepository interface extends JpaRepository to provide CRUD operations for the Teacher entity.

java
Copy code
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    // Custom query methods
}
Entity
The Teacher class represents the entity stored in the database. It is annotated with @Entity to mark it as a JPA entity.

java
Copy code
@Entity
public class Teacher {
    // Entity fields and methods
}
Service Interface
The TeacherServiceInterface defines the contract for service classes managing teachers.

java
Copy code
public interface TeacherServiceInterface {
    // Service interface methods
}

# Requirements
- JDK 11 or higher
- Maven
- Spring Boot
Spring Data JPA

# Setup
1. Clone the repository.
2. Import the project into your IDE.
3. Build the project using Maven.
4. Run the application using Spring Boot.

# Usage
- Access the application at http://localhost:8080.
- Use the provided endpoints to manage teachers: /teachers/get, /teachers/addTeacher, /teachers/updateTeacher, /teachers/saveTeacher, /teachers/deleteTeacher.

# Contribution
Contributions are welcome! Feel free to submit issues or pull requests.

# License
This project is licensed under the MIT License. See the LICENSE file for details.

