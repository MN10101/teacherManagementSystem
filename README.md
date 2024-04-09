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

## Service Layer
The TeacherService class contains methods to interact with the database and perform operations on teacher entities. It implements the TeacherServiceInterface.

![aa](https://github.com/MN10101/teacherManagementSystem/assets/78208459/a8c6d506-48cb-4512-8816-1ca12b7acd6b)



## DAO
The TeacherRepository interface extends JpaRepository to provide CRUD operations for the Teacher entity.

![aaa](https://github.com/MN10101/teacherManagementSystem/assets/78208459/a19d9d48-41e1-47d7-aaae-3e0162b62503)


