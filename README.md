# SpringBootAPI-Implementation
Employee REST API
This is a Spring Boot application that provides a simple RESTful API to manage employee data. It follows a layered architecture using Controller, Service, and Repository layers.

Key Features:
REST APIs to perform basic CRUD operations
Layered architecture (Presentation, Service, Persistence)
Uses DTOs for data transfer between layers
Integrated with H2 in-memory database
Object mapping handled using ModelMapper
Built using Spring Boot, Spring Data JPA, Lombok

Tech Stack:
Java 17
Spring Boot
Spring Data JPA
H2 Database
Maven
ModelMapper

API Overview:
GET /employees – Get all employees
GET /employees/{id} – Get employee by ID
POST /employees – Create new employee
PUT /employees/{id} – Update employee
DELETE /employees/{id} – Delete employee

How to Run:
Clone the repo
Open in IDE or run with Maven
App runs at http://localhost:8080
Access H2 Console at http://localhost:8080/h2-console
