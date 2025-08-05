Employee Management REST API – Spring Boot Project
A layered RESTful API built using Spring Boot for managing employee records with CRUD operations.

🛠 Tech Stack
Framework: Spring Boot

Language: Java 17

ORM: Spring Data JPA

Database: H2 (In-memory)

Build Tool: Maven

Object Mapping: ModelMapper

Testing: JUnit (via spring-boot-starter-test)

Others: Lombok, Keycloak (Authentication)

📁 Project Structure
css
Copy
Edit
employee-rest-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── yourpackage/
│   │   │           ├── controller/
│   │   │           ├── dto/
│   │   │           ├── entity/
│   │   │           ├── repository/
│   │   │           └── service/
│   │   └── resources/
│   │       └── application.properties
└── pom.xml
🚀 Features
✅ Create, Read, Update, Delete employees

🔐 Integrated Keycloak for authentication

📦 DTOs for data abstraction

🔄 ModelMapper for clean object mapping

🧪 Basic testing setup with JUnit

⚡ In-memory H2 database for quick development

▶️ Getting Started
🔹 1. Clone Repository
bash
Copy
Edit
git clone https://github.com/yourusername/employee-rest-api.git
cd employee-rest-api
🔹 2. Run Application
bash
Copy
Edit
./mvnw spring-boot:run
Or run from your IDE.

Visit: http://localhost:8080

📌 API Endpoints
Method	Endpoint	Description
GET	/employees	Get all employees
GET	/employees/{id}	Get employee by ID
POST	/employees	Create new employee
PUT	/employees/{id}	Update employee
DELETE	/employees/{id}	Delete employee

💡 Notes
Access H2 Console at: http://localhost:8080/h2-console

Update application.properties for DB config if switching to MySQL/PostgreSQL.

This project uses layered architecture for maintainability and scalability.

