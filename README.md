# Spring Boot MongoDB REST API Template

A modern Spring Boot 3.3.5 REST API template with MongoDB integration, JWT authentication, and Swagger UI documentation.

## Created By
**Ravindra Valand (RV)**
- Full Stack Developer & Tech Enthusiast
- Based in Gujarat, India
- [GitHub](https://github.com/vsmm-world)
- [LinkedIn](https://www.linkedin.com/in/ravindra-valand/)

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [Project Structure](#project-structure)
- [Development](#development)
- [Security](#security)
- [Contributing](#contributing)

## Features
- 🔐 JWT Authentication & Authorization
- 📝 MongoDB Integration
- 📚 Swagger UI Documentation
- 🔄 Auto-reload during development
- 🛡️ Spring Security Configuration
- 🎯 RESTful API endpoints
- ⚡ CRUD Operations
- 📊 User & Product Management

## Tech Stack
- Java 21
- Spring Boot 3.3.5
- Spring Security
- MongoDB
- Gradle
- JWT
- SpringDoc OpenAPI (Swagger UI)
- Lombok
- Spring Boot DevTools

## Prerequisites
- Java 21 or higher
- MongoDB 6.0 or higher
- Gradle 8.x
- IDE (IntelliJ IDEA recommended)

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/ravindra-valand/spring-boot-mongodb-template.git
cd spring-boot-mongodb-template
```

### 2. Configure MongoDB
Make sure MongoDB is running on your system. Update `application.properties` with your MongoDB configuration:
```properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=your_database_name
```

### 3. Build and Run
```bash
# Build the project
./gradlew clean build

# Run with auto-reload enabled
./gradlew bootRun
```

The application will start on `http://localhost:8080`

## API Documentation
Swagger UI is available at: `http://localhost:8080/swagger-ui/index.html`

### Available Endpoints
- Auth
  - POST `/api/auth/register` - Register new user
  - POST `/api/auth/login` - Login and get JWT token
- Users
  - GET `/api/users` - Get all users
  - GET `/api/users/{id}` - Get user by ID
  - PUT `/api/users/{id}` - Update user
  - DELETE `/api/users/{id}` - Delete user
- Products
  - GET `/api/products` - Get all products
  - GET `/api/products/{id}` - Get product by ID
  - POST `/api/products` - Create new product
  - PUT `/api/products/{id}` - Update product
  - DELETE `/api/products/{id}` - Delete product

## Project Structure
```
src/main/java/com/portglint/first/
├── config/          # Configuration classes
├── controller/      # REST controllers
├── model/          # Domain models
├── repository/     # MongoDB repositories
├── service/        # Business logic
├── security/       # Security configurations
└── Application.java
```

## Development
Enable auto-reload:
1. Add Spring Boot DevTools dependency
2. Configure your IDE for auto-build
3. Run with `./gradlew bootRun`

## Security
- JWT-based authentication
- Password encryption using BCrypt
- Role-based authorization
- Secured endpoints

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
Created with ❤️ by Ravindra Valand (RV)