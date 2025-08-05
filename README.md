# 👩‍💼 Employee Management REST API using Spring Boot

A simple, layered REST API project for managing employee data, built with **Spring Boot**. It supports full **CRUD operations**, utilizes DTOs, and includes authentication integration using **Keycloak**.

---

## ⚙️ Tech Stack

- **Backend**: Spring Boot (v3.5.x)
- **Language**: Java 17
- **Build Tool**: Maven
- **Database**: H2 (in-memory)
- **ORM**: Spring Data JPA
- **Authentication**: Keycloak, JWT
- **Object Mapping**: ModelMapper
- **Testing**: JUnit, Spring Boot Starter Test
- **Others**: Lombok, Postman (for API testing)

---


---

## 🚀 Features

- 🔄 CRUD operations on Employee data
- 🔐 Keycloak integration for secure login
- 🧩 DTO and Entity mapping via ModelMapper
- ✅ Input validation
- 🧪 Unit testing (basic)
- 🌐 RESTful API design
- ⚡ In-memory H2 database for quick testing

---

## 📌 API Endpoints

| Method | Endpoint             | Description           |
|--------|----------------------|-----------------------|
| GET    | `/employees`         | Get all employees     |
| GET    | `/employees/{id}`    | Get employee by ID    |
| POST   | `/employees`         | Create employee       |
| PUT    | `/employees/{id}`    | Update employee       |
| DELETE | `/employees/{id}`    | Delete employee       |




