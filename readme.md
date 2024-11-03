# Java Demo CRUD Application

This repository contains a simple CRUD (Create, Read, Update, Delete) application built with Java, Spring Boot, and JPA. The purpose of this project is to learn and demonstrate the basics of building RESTful APIs and performing CRUD operations using Spring Boot and JPA.

## Setup

1. Clone the repository:

    ```sh
    git clone https://github.com/your-username/java-demo-crud.git
    cd java-demo-crud
    ```

2. Configure the database connection in `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost/java_demo
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    ```

3. Build the project:

    ```sh
    ./mvnw clean install
    ```

4. Run the application:

    ```sh
    ./mvnw spring-boot:run
    ```

## Learning Objectives

- Understand the basics of Spring Boot and how to create a RESTful API.
- Learn how to perform CRUD operations using Spring Data JPA and PostgreSQL as the database.


## Main Classes

- [`DemoApplication`](src/main/java/com/example/demo/DemoApplication.java): The main entry point of the Spring Boot application.
- [`AdressesController`](src/main/java/com/example/demo/AdressesController.java): The REST controller that handles HTTP requests.
- [`AdressService`](src/main/java/com/example/demo/AdressService.java): The service layer that contains business logic.
- [`AddressRepository`](src/main/java/com/example/demo/repository/AddressRepository.java): The JPA repository interface for `Address` entities.
- [`Address`](src/main/java/com/example/demo/Address.java): The entity class representing an address.

## Configuration

- [`application.properties`](src/main/resources/application.properties): Contains configuration properties for the Spring Boot application.

