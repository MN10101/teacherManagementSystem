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

# HTML

This repository contains HTML files for a simple Teacher Management System.

## Overview

There are two HTML files in this repository:

1. `save-teacher.html`: This file is used to add a new teacher to the system.
2. `teachers-list.html`: This file displays a list of teachers and allows for updating or deleting existing teachers.

## File Descriptions

### `save-teacher.html`

This file provides a form for adding a new teacher to the system. It includes input fields for the teacher's first name, last name, and email address. Upon submission of the form, the data is sent to the server for processing.

### `teachers-list.html`

This file displays a table of all teachers currently in the system. It includes columns for the teacher's ID, first name, last name, and email address. Additionally, it provides buttons for updating or deleting each teacher.

## Usage

To use these HTML files:

1. Open the desired HTML file in a web browser.
2. Follow the instructions provided on the page to add or manage teachers in the system.

## Dependencies

- Bootstrap CSS: The HTML files use Bootstrap for styling. The necessary CSS files are included via CDN links in the `<head>` section of each HTML file.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

# Teacher Management System Configuration

This repository contains configuration properties for the Teacher Management System.

## Overview

The `application.properties` file contains configuration settings for the Spring Boot application.

## Configuration Details

### `application.properties`

This file contains the following configuration properties:

- `spring.application.name`: Defines the name of the Spring Boot application as "teacherManagementSystem".

- `spring.datasource.url`: Specifies the JDBC URL for connecting to the MySQL database named "teacher_management" running on localhost with port 3306.

- `spring.datasource.username`: Specifies the username for authenticating with the MySQL database as "******".

- `spring.datasource.password`: Specifies the password for authenticating with the MySQL database as "******".

- `spring.jpa.hibernate.ddl-auto`: Specifies the Hibernate DDL (Data Definition Language) auto-generation strategy as "update", which automatically updates the database schema based on the entity classes.

## Usage

To use these configuration properties:

1. Update the values of the properties in the `application.properties` file as needed for your environment.

## Dependencies

- Spring Boot: The configuration file is intended for use with Spring Boot applications.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Overview

The SQL script `create_database.sql` initializes the database for the Teacher Management System.

## SQL Script Details

### `create_database.sql`

This script performs the following actions:

1. Creates the database `teacher_management` if it does not already exist.
2. Sets the database context to `teacher_management` for subsequent queries.

## Usage

To set up the database for the Teacher Management System:

1. Execute the `create_database.sql` script against your MySQL database server.

## Dependencies

- MySQL: The SQL script is intended for use with MySQL databases.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Author

- Mahmoud Najmeh

