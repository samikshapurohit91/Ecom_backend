E-Commerce Backend (Spring Boot)

This is a backend project for an E-Commerce application built using Spring Boot.
It provides REST APIs for managing products, categories, authentication, and users.

* Features

User Authentication using JWT

Role-based Authorization (Admin / User)

Product Management (Add / View Products)

Category Management

Secure REST APIs

MySQL Database Integration

* Tech Stack

Java

Spring Boot

Spring Security

JWT Authentication

Hibernate / JPA

MySQL

Maven


* Project Structure

src
┣ controller
┣ service
┣ repository
┣ entity
┣ security
┗ config

* Setup Instructions

Clone the repository

git clone https://github.com/samikshapurohit91/Ecom_backend.git

Open the project in IntelliJ / Eclipse

Configure database in application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/Ecom
spring.datasource.username=your_username
spring.datasource.password=your_password

Run the Spring Boot application

* API Testing

You can test the APIs using Swagger UI or Postman.

Example Endpoints:

POST /api/users/register
POST /api/users/login
POST /api/products/add
GET /api/products/all


* Author

Samiksha Purohit

Java Full-Stack | Backend Developer
