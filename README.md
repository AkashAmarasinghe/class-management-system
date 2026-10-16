# Class Management System

A Java Swing desktop application built with **Apache NetBeans (Ant)** and **MySQL**, with FlatLaf UI components.

## Features

The source code includes screens and database operations for:

- Student records
- Teachers and teacher addresses
- Employees
- Grades and subjects
- Attendance tracking
- Payments
- Administrator login

## Tech stack

- Java 8 language level (`javac.source=1.8`; a compatible JDK is required)
- Java Swing (NetBeans GUI Builder)
- Apache Ant / NetBeans project
- MySQL with JDBC
- FlatLaf and JCalendar libraries

## Setup

1. Install Apache NetBeans and a compatible JDK.
2. Install and start MySQL.
3. Create/import the **`learn`** database and all required tables. **The original project archive does not include a SQL schema or data export.** You must obtain or reconstruct the database schema before running the application successfully.
4. Set environment variables before launching NetBeans/the application:

   On Windows PowerShell, for the current session:
   ```powershell
   $env:CLASS_DB_URL = "jdbc:mysql://localhost:3306/learn"
   $env:CLASS_DB_USER = "root"
   $env:CLASS_DB_PASSWORD = "YOUR_LOCAL_PASSWORD"
   ```
   Launch NetBeans from that PowerShell session so it inherits the variables, or configure environment variables in Windows before launching NetBeans. `.env.example` is only a reference; this Java code does not automatically load `.env` files.
5. Open this folder in **NetBeans → File → Open Project**.
6. Resolve any missing library references under **Project Properties → Libraries**. Included local dependencies are in `lib/`.
7. Build and run. The configured main class is `gui.home`.

## Project structure

```text
src/gui/             Swing windows and .form GUI builder files
src/model/           MySQL JDBC utility
src/img/             GUI icons
nbproject/           NetBeans Ant project configuration
lib/                 Project dependencies
build.xml            Ant build file
```

## Security notes

- MySQL credentials have been removed from the committed Java source; configure them locally using environment variables.
- The original code constructs SQL statements by concatenating user input and handles some passwords as plaintext. It should be refactored to use parameterized queries and secure password hashing before any production deployment.
- Do not commit real user records, credentials, or database dumps containing private information.

## Status

Educational desktop project. The included source was inspected for structure and credentials, but full build and application runtime/database functionality have **not** been verified.
