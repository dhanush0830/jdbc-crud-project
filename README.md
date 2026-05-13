# JDBC CRUD Project

A simple Java JDBC CRUD application using MySQL database and Lambda Expressions.

## Features

- Create Table
- Insert Record
- Update Record
- Delete Record
- Read Records
- Drop Table
- Menu Driven Program
- Lambda Expressions
- JDBC Connectivity
- MySQL Database

---

# Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE
- Maven

---

# Project Structure

```text
src/main/java/crud
│
├── Employee.java
├── EmployeeDAO.java
└── Main.java
```

---

# Database Details

## Database Name

```sql
company
```

## Table Name

```sql
emp_master
```

---

# SQL Table Structure

```sql
CREATE TABLE emp_master (
    empno INT PRIMARY KEY,
    empname VARCHAR(50)
);
```

---

# JDBC Driver

MySQL Connector/J is required.

Download:
https://dev.mysql.com/downloads/connector/j/

---

# Functionalities

## 1. Create Table

Creates employee table in MySQL.

---

## 2. Insert Record

Adds employee details into database.

Example:

```text
Emp No   : 101
Emp Name : Dhanush
```

---

## 3. Update Record

Updates employee name using employee number.

---

## 4. Delete Record

Deletes employee record from database.

---

## 5. Read Records

Displays all employee details.

---

## 6. Drop Table

Deletes complete table from database.

---

# Lambda Expressions Used

Example:

```java
op = () -> dao.readRecord();
```

Lambda expressions are used to simplify operations.

---

# How to Run

## Step 1

Clone repository

```bash
git clone https://github.com/dhanush0830/jdbc-crud-project.git
```

---

## Step 2

Open project in Eclipse.

---

## Step 3

Configure MySQL database.

---

## Step 4

Add MySQL JDBC Driver.

---

## Step 5

Run `Main.java`

---

# Sample Menu

```text
===== MENU =====
1. Create Table
2. Insert
3. Update
4. Delete
5. Read
6. Drop Table
7. Exit
```

---

# Author

Dhanush R

---

# Output Example

```text
EMPLOYEE DETAILS
----------------------
Emp No   : 101
Emp Name : Dhanush
----------------------
```
