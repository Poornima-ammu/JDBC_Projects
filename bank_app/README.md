# 🏦 Bank Management System (JDBC + Security)

## 📌 Project Overview

This is a console-based Bank Management System developed using Java and JDBC.
The application allows users to create accounts, perform transactions such as deposit, withdrawal, and fund transfer, and securely manage their banking data.

The project demonstrates real-world concepts like database interaction, layered architecture (DAO pattern), transaction management, and password security using hashing.

---

## 🚀 Features

* Create new bank account
* Secure user registration with password hashing
* Login authentication system
* Deposit money
* Withdraw money
* 💸 Transfer money between accounts
* Check account balance
* View transaction history
* Input validation and exception handling

---

## 🔐 Security Implementation

* Implemented password hashing using Java MessageDigest
* Used SHA-256 algorithm to encrypt passwords
* Passwords are never stored in plain text
* During login, entered password is hashed and compared with stored hash
* Protects user credentials from unauthorized access

---

## 💸 Fund Transfer Feature

* Allows transferring money from one account to another
* Deducts amount from sender and credits receiver
* Uses JDBC transaction management (commit & rollback)
* Ensures data consistency in case of failure

---

## 🛠️ Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL Database
* Eclipse IDE

---

## 🧱 Project Structure

com.bankapp
├── model        (Account, Transaction classes)
├── dao          (Database operations)
├── service      (Business logic)
├── util         (DB connection)
└── main         (Main class with menu)

---

## 🗄️ Database Design

### Accounts Table

* id (Primary Key)
* name
* balance
* password (hashed)

### Transactions Table

* transaction_id (Primary Key)
* account_id (Foreign Key)
* type (Deposit/Withdraw/Transfer)
* amount

---

## ⚙️ How It Works

1. User selects an operation from the menu
2. For registration:

   * Password is hashed using MessageDigest
   * Stored securely in database
3. For login:

   * Password is hashed and verified
4. For transfer:

   * Balance is deducted from sender
   * Balance is added to receiver
   * Transaction is committed only if both operations succeed
5. DAO layer interacts with MySQL using JDBC
6. Results are displayed to the user

---

## 🔄 Application Flow

User → Main (UI) → Service Layer → DAO Layer → Database
Database → DAO → Service → UI (Output Display)

---

## ▶️ How to Run

1. Clone the repository
2. Open the project in Eclipse
3. Create MySQL database (e.g., bank_db)
4. Create required tables
5. Update database credentials in DBConnection class
6. Run the Main class

---

## 📸 Sample Menu

1. Register Account
2. Login
3. Deposit
4. Withdraw
5. Transfer Money
6. Check Balance
7. Transaction History
8. Exit

---

## 💡 Learning Outcomes

* Understanding of JDBC architecture
* Implementation of DAO design pattern
* Secure password handling using hashing
* Transaction management using commit and rollback
* Performing real-world banking operations

---

## 🔥 Future Enhancements

* Add GUI using Swing or JavaFX
* Implement OTP-based authentication
* Add online banking features
* Use advanced security like salting and bcrypt
* Convert into web application using Servlets

---

## 👨‍💻 Poornima

Your Name
