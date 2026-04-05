# 🛒 Grocery Management System

## 📖 Overview

The **Grocery Management System** is a console-based Java application designed to streamline grocery store operations such as inventory management, product handling, and billing.

This project demonstrates the implementation of **Core Java concepts, JDBC for database connectivity, and MySQL for persistent storage**, following a structured **DAO (Data Access Object) architecture**. It ensures efficient data handling, modularity, and scalability.

---

## 🎯 Objectives

* Digitize and simplify grocery store operations
* Implement CRUD operations using Java and MySQL
* Apply layered architecture for better code organization
* Demonstrate real-world usage of JDBC

---

## ✨ Key Features

* Product Management (Add, View, Update, Delete)
* Inventory Tracking and Stock Validation
* Billing System with automatic price calculation
* Data persistence using MySQL database
* Console-based interactive user interface

---

## 🛠️ Technology Stack

* **Programming Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **IDE:** Eclipse

---

## 🏗️ System Architecture

```
User (Console Interface)
        ↓
Service Layer (Business Logic)
        ↓
DAO Layer (Database Operations)
        ↓
MySQL Database
```

---

## 📂 Project Structure

```
GroceryManagementSystem/
│
├── src/
│   ├── dao/
│   │   ├── DBConnection.java
│   │   └── ProductDAO.java
│   │
│   ├── model/
│   │   └── Product.java
│   │
│   └── main/
│       └── Main.java
│
└── README.md
```

---

## ⚙️ Installation & Setup

### 1. Database Configuration

```sql
CREATE DATABASE grocery_db;

USE grocery_db;

CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price DOUBLE,
    quantity INT
);
```

### 2. Configure JDBC Connection

Update database credentials in `DBConnection.java`:

```java
String url = "jdbc:mysql://localhost:3306/grocery_db";
String user = "root";
String password = "your_password";
```

### 3. Run the Application

* Import the project into Eclipse (or any Java IDE)
* Add MySQL Connector/J dependency
* Execute `Main.java`

---

## 💻 Sample Execution

```
--- Grocery Management ---
1. Add Product
2. View Products
3. Update Product
4. Delete Product
5. Purchase Product
6. Exit

Enter choice: 5
Enter Product ID: 1
Enter Quantity: 2
Total Bill: ₹100
```

---

## 🔍 Core Concepts Demonstrated

* Object-Oriented Programming (Encapsulation, Abstraction)
* JDBC API for database interaction
* CRUD Operations
* DAO Design Pattern
* Exception Handling

---

## ⚠️ Challenges & Solutions

* **Database Connectivity Issues:** Resolved using proper JDBC driver configuration
* **Stock Management:** Implemented validation before purchase
* **Data Consistency:** Ensured updates reflect accurately after transactions

---

## 🚀 Future Enhancements

* Graphical User Interface using Swing / JavaFX
* Web-based version using Servlets and JSP
* User authentication and role-based access control
* Advanced reporting and analytics
* Integration with online payment systems

---

## 👨‍💻 Authors

* Sangamesh Biradar
* Poornima C
* Thanisha M Shetty

---

## 📄 License

This project is developed for educational purposes and learning outcomes.

---

## ⭐ Acknowledgement

This project was developed as part of academic learning to gain practical exposure to Java, JDBC, and database-driven application development.
# 🛒 Grocery Management System

## 📖 Overview

The **Grocery Management System** is a console-based Java application designed to streamline grocery store operations such as inventory management, product handling, and billing.

This project demonstrates the implementation of **Core Java concepts, JDBC for database connectivity, and MySQL for persistent storage**, following a structured **DAO (Data Access Object) architecture**. It ensures efficient data handling, modularity, and scalability.

---

## 🎯 Objectives

* Digitize and simplify grocery store operations
* Implement CRUD operations using Java and MySQL
* Apply layered architecture for better code organization
* Demonstrate real-world usage of JDBC

---

## ✨ Key Features

* Product Management (Add, View, Update, Delete)
* Inventory Tracking and Stock Validation
* Billing System with automatic price calculation
* Data persistence using MySQL database
* Console-based interactive user interface

---

## 🛠️ Technology Stack

* **Programming Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **IDE:** Eclipse

---

## 🏗️ System Architecture

```
User (Console Interface)
        ↓
Service Layer (Business Logic)
        ↓
DAO Layer (Database Operations)
        ↓
MySQL Database
```

---

## 📂 Project Structure

```
GroceryManagementSystem/
│
├── src/
│   ├── dao/
│   │   ├── DBConnection.java
│   │   └── ProductDAO.java
│   │
│   ├── model/
│   │   └── Product.java
│   │
│   └── main/
│       └── Main.java
│
└── README.md
```

---

## ⚙️ Installation & Setup

### 1. Database Configuration

```sql
CREATE DATABASE grocery_db;

USE grocery_db;

CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    price DOUBLE,
    quantity INT
);
```

### 2. Configure JDBC Connection

Update database credentials in `DBConnection.java`:

```java
String url = "jdbc:mysql://localhost:3306/grocery_db";
String user = "root";
String password = "your_password";
```

### 3. Run the Application

* Import the project into Eclipse (or any Java IDE)
* Add MySQL Connector/J dependency
* Execute `Main.java`

---

## 💻 Sample Execution

```
--- Grocery Management ---
1. Add Product
2. View Products
3. Update Product
4. Delete Product
5. Purchase Product
6. Exit

Enter choice: 5
Enter Product ID: 1
Enter Quantity: 2
Total Bill: ₹100
```

---

## 🔍 Core Concepts Demonstrated

* Object-Oriented Programming (Encapsulation, Abstraction)
* JDBC API for database interaction
* CRUD Operations
* DAO Design Pattern
* Exception Handling

---

## ⚠️ Challenges & Solutions

* **Database Connectivity Issues:** Resolved using proper JDBC driver configuration
* **Stock Management:** Implemented validation before purchase
* **Data Consistency:** Ensured updates reflect accurately after transactions

---

## 🚀 Future Enhancements

* Graphical User Interface using Swing / JavaFX
* Web-based version using Servlets and JSP
* User authentication and role-based access control
* Advanced reporting and analytics
* Integration with online payment systems

---

## 👨‍💻 Authors

* Sangamesh Biradar
* Poornima C
* Thanisha M Shetty

---

## 📄 License

This project is developed for educational purposes and learning outcomes.

---

## ⭐ Acknowledgement

This project was developed as part of academic learning to gain practical exposure to Java, JDBC, and database-driven application development.
