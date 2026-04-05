# JDBC Projects 🚀

A comprehensive collection of Java Database Connectivity (JDBC) projects demonstrating real-world database applications with proper architecture and best practices.

## 📚 Projects Overview

| Project | Description | Key Features |
|---------|-------------|--------------|
| **🛒 Grocery Management System** | Console-based inventory & billing system | CRUD Operations, Stock Management, Billing |
| **🏦 Bank Management System** | Secure banking with transactions | Authentication, Fund Transfer, Transaction History, Password Hashing |

---

## 🎯 What You'll Learn

- ✅ Core Java & Object-Oriented Programming
- ✅ JDBC API for database connectivity
- ✅ MySQL database design & queries
- ✅ DAO (Data Access Object) design pattern
- ✅ Layered architecture (Model-Service-DAO)
- ✅ Transaction management & security
- ✅ Exception handling & input validation

---

## 🛠️ Tech Stack

- **Language:** Java
- **Database:** MySQL
- **Connectivity:** JDBC
- **IDE:** Eclipse / IntelliJ IDEA
- **Build:** Maven (optional)

---

## 📂 Repository Structure

```
JDBC_Projects/
├── grocery_management/          # Grocery Management System
│   ├── src/
│   ├── lib/
│   └── README.md
│
├── bank_app/                    # Bank Management System
│   ├── src/
│   ├── lib/
│   └── README.md
│
└── README.md                    # This file
```

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- MySQL Server installed
- MySQL Connector/J (JDBC Driver)
- Eclipse IDE or any Java IDE

### Installation Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/Poornima-ammu/JDBC_Projects.git
   cd JDBC_Projects
   ```

2. **Setup MySQL Database**
   ```bash
   mysql -u root -p
   ```

3. **Choose a project and follow its README**
   - [Grocery Management System](./grocery_management/README.md)
   - [Bank Management System](./bank_app/README.md)

4. **Configure JDBC Connection**
   - Update database credentials in respective DBConnection.java files
   - Add MySQL Connector/J to your project

5. **Run the Application**
   - Open project in Eclipse
   - Right-click → Run As → Java Application

---

## 📖 Quick Reference

### Project 1: Grocery Management System
**Location:** `grocery_management/`  
**Purpose:** Manage grocery store inventory, products, and billing  
[📖 Full Documentation](./grocery_management/README.md)

### Project 2: Bank Management System
**Location:** `bank_app/`  
**Purpose:** Handle banking operations with secure authentication  
[📖 Full Documentation](./bank_app/README.md)

---

## 🔍 Key Concepts Covered

| Concept | Projects |
|---------|----------|
| CRUD Operations | ✅ Both |
| DAO Pattern | ✅ Both |
| Transaction Management | ✅ Bank System |
| Password Security (Hashing) | ✅ Bank System |
| Inventory Management | ✅ Grocery System |
| Exception Handling | ✅ Both |

---

## 💡 How to Use This Repository

1. **For Learning:** Start with Grocery Management → Bank Management
2. **For Reference:** Check individual project READMEs for detailed setup
3. **For Practice:** Modify code and add new features
4. **For Interview:** Understand architecture & JDBC concepts

---

## ⚠️ Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| MySQL Connection Failed | Verify credentials & MySQL is running |
| JDBC Driver Not Found | Add mysql-connector-java.jar to classpath |
| Table Not Found | Execute SQL scripts from project README |
| Port Already in Use | Change MySQL port or stop conflicting service |

---

## 🚀 Future Enhancements

- [ ] GUI using Swing / JavaFX
- [ ] Web-based version (Servlets & JSP)
- [ ] REST API implementation
- [ ] User authentication & authorization
- [ ] Advanced reporting & analytics
- [ ] Payment gateway integration

---

## 👨‍💻 Contributors

- Poornima C


---

## 📄 License

This project is developed for educational purposes and learning outcomes.

---

## ⭐ Acknowledgement

These projects were developed to gain practical exposure to Java, JDBC, and database-driven application development.

---

## 📞 Support

For issues or questions, please check the individual project READMEs or feel free to open an issue on GitHub.
