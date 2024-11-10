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
- [Environment Setup](#environment-setup)
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
- Git
- Postman (for API testing)

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/ravindra-valand/spring-boot-mongodb-template.git
cd spring-boot-mongodb-template
```

### 2. Environment Setup
1. Copy the example properties file:
```bash
cp src/main/resources/application-example.properties src/main/resources/application.properties
```

2. Update the following properties in `application.properties`:
```properties
# MongoDB Configuration
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=your_database_name

# JWT Configuration
jwt.secret=your_secret_key
jwt.expiration=86400000

# Server Configuration
server.port=8080
spring.profiles.active=dev
```

### 3. Build and Run
```bash
# Build the project
./gradlew clean build

# Run with auto-reload enabled
./gradlew bootRun
```

The application will start on `http://localhost:8080`

## Development Setup Guide

### IDE Setup (IntelliJ IDEA)
1. Install IntelliJ IDEA (Community or Ultimate)
2. Install the following plugins:
   - Lombok
   - Spring Boot Assistant
   - MongoDB Plugin
3. Enable annotation processing:
   - Go to Settings → Build, Execution, Deployment → Compiler → Annotation Processors
   - Check "Enable annotation processing"

### MongoDB Setup
1. Install MongoDB Community Edition
2. Start MongoDB service:
```bash
# Windows
net start MongoDB

# macOS/Linux
sudo systemctl start mongod
```
3. Verify connection:
```bash
mongosh
```

### Code Style Setup
1. Import code style settings:
   - Go to Settings → Editor → Code Style
   - Import the `codestyle.xml` from the project root

### Running Tests
```bash
# Run all tests
./gradlew test

# Run specific test class
./gradlew test --tests "com.portglint.first.YourTestClass"
```

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

### Getting Started with Contributing
1. Fork the repository on GitHub
2. Clone your fork locally:
```bash
git clone https://github.com/YOUR-USERNAME/spring-boot-mongodb-template.git
```

3. Add the upstream repository:
```bash
git remote add upstream https://github.com/ravindra-valand/spring-boot-mongodb-template.git
```

4. Create a new branch:
```bash
git checkout -b feature/your-feature-name
```

### Development Workflow
1. Keep your branch updated:
```bash
git fetch upstream
git rebase upstream/main
```

2. Make your changes and commit:
```bash
git add .
git commit -m "feat: add amazing feature"
```

3. Push changes to your fork:
```bash
git push origin feature/your-feature-name
```

4. Create a Pull Request through GitHub

### Commit Message Guidelines
Follow conventional commits format:
- `feat:` for new features
- `fix:` for bug fixes
- `docs:` for documentation
- `style:` for formatting changes
- `refactor:` for code refactoring
- `test:` for adding tests
- `chore:` for maintenance tasks

### Code Review Process
1. All PRs must be reviewed by at least one maintainer
2. Address review comments and update PR
3. Ensure all checks pass
4. Squash commits before merging

### Testing Guidelines
1. Write unit tests for new features
2. Ensure all existing tests pass
3. Add integration tests when necessary
4. Maintain test coverage above 80%

## Troubleshooting

### Common Issues
1. MongoDB Connection Issues:
   - Verify MongoDB is running
   - Check connection string in properties
   - Ensure correct credentials

2. Build Failures:
   - Clean and rebuild: `./gradlew clean build`
   - Check Java version: `java -version`
   - Verify Gradle version: `./gradlew -v`

3. JWT Token Issues:
   - Verify secret key configuration
   - Check token expiration settings
   - Ensure proper token format in requests

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
Created with ❤️ by Ravindra Valand (RV)