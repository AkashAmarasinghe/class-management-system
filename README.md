
<div align="center">

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&height=240&color=0:0B0B0F,35:991B1B,70:DC2626,100:FACC15&text=CLASS%20MANAGEMENT%20SYSTEM&fontSize=34&fontColor=FFFFFF&fontAlignY=38&desc=JAVA%20SWING%20%7C%20MYSQL%20%7C%20NETBEANS&descAlignY=60&descSize=19&descColor=FFF5A5&animation=fadeIn" alt="Class Management System"/>

<br/>

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=700&size=21&pause=1100&color=FACC15&center=true&vCenter=true&width=850&lines=Smart+Class+Management+System;Manage+Students+%26+Teachers;Track+Attendance+%26+Payments;Powered+by+Java+Swing+%26+MySQL" alt="Project introduction"/>

<br/><br/>

![Java](https://img.shields.io/badge/JAVA-8-DC2626?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/JAVA-SWING-FACC15?style=for-the-badge&logoColor=black)
![MySQL](https://img.shields.io/badge/MYSQL-JDBC-DC2626?style=for-the-badge&logo=mysql&logoColor=white)
![NetBeans](https://img.shields.io/badge/APACHE-NETBEANS-FACC15?style=for-the-badge&logo=apachenetbeanside&logoColor=black)

<br/>

### 🔥 ORGANIZE • MANAGE • TRACK

**A Java desktop application designed to simplify academic and administrative record management.**

[![Repository](https://img.shields.io/badge/VIEW-PROJECT-DC2626?style=for-the-badge&logo=github&logoColor=white)](https://github.com/AkashAmarasinghe/class-management-system)
[![Developer](https://img.shields.io/badge/DEVELOPER-AKASH%20AMARASINGHE-FACC15?style=for-the-badge&logo=github&logoColor=black)](https://github.com/AkashAmarasinghe)

</div>

---

## 🔴 PROJECT OVERVIEW

**Class Management System** is a Java Swing desktop application developed using **Apache NetBeans, MySQL and JDBC**.

It provides a graphical environment for organizing different types of academic and administrative information.

The project includes source code for managing:

- Student records
- Teachers and teacher addresses
- Employee information
- Grades and subjects
- Attendance records
- Payment information
- Administrator login

The system uses **Java Swing** for the user interface and **MySQL** for database storage.

---

## 🟡 KEY FEATURES

<table>
<tr>
<td align="center" width="50%">

### 🎓 STUDENT MANAGEMENT

Manage student-related information and database records.

</td>
<td align="center" width="50%">

### 👨‍🏫 TEACHER MANAGEMENT

Organize teacher details and address information.

</td>
</tr>
<tr>
<td align="center">

### 👥 EMPLOYEE MANAGEMENT

Maintain employee and staff records.

</td>
<td align="center">

### 📚 GRADES & SUBJECTS

Organize academic grades and subject information.

</td>
</tr>
<tr>
<td align="center">

### 📅 ATTENDANCE TRACKING

Handle attendance-related records and information.

</td>
<td align="center">

### 💳 PAYMENT MANAGEMENT

Manage payment-related information and database operations.

</td>
</tr>
<tr>
<td align="center" colspan="2">

### 🔐 ADMINISTRATOR LOGIN

Dedicated administrator login interface.

</td>
</tr>
</table>

> **Project note:** These modules were identified in the original source code. Full runtime functionality has not yet been verified.

---

## 🔴 TECH STACK

<div align="center">

| Technology | Description |
|:---:|:---|
| ☕ **Java 8** | Core application development |
| 🖥️ **Java Swing** | Desktop graphical user interface |
| 🧰 **Apache NetBeans** | IDE and GUI Builder |
| 🗄️ **MySQL** | Relational database |
| 🔗 **JDBC** | Database connectivity |
| 🎨 **FlatLaf** | Modern Swing UI components |
| 📆 **JCalendar** | Date selection components |
| 🐜 **Apache Ant** | Project build system |

<br/>

![Java](https://img.shields.io/badge/Java-DC2626?style=flat-square&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-FACC15?style=flat-square&logo=mysql&logoColor=black)
![NetBeans](https://img.shields.io/badge/NetBeans-DC2626?style=flat-square&logo=apachenetbeanside&logoColor=white)
![FlatLaf](https://img.shields.io/badge/FlatLaf-FACC15?style=flat-square&logoColor=black)
![JDBC](https://img.shields.io/badge/JDBC-DC2626?style=flat-square&logoColor=white)

</div>

---

## 🟡 SYSTEM ARCHITECTURE

The application connects its Java Swing interface to a MySQL database through JDBC.

```mermaid
flowchart TD
    A["Administrator / User"]
    B["Java Swing Desktop Application"]
    C["Management Modules"]

    D["Students"]
    E["Teachers"]
    F["Employees"]
    G["Grades & Subjects"]
    H["Attendance"]
    I["Payments"]

    J["JDBC Connection Layer"]
    K[("MySQL Database")]

    A --> B
    B --> C

    C --> D
    C --> E
    C --> F
    C --> G
    C --> H
    C --> I

    D --> J
    E --> J
    F --> J
    G --> J
    H --> J
    I --> J

    J --> K

    classDef red fill:#991B1B,stroke:#F87171,color:#FFFFFF,stroke-width:2px;
    classDef yellow fill:#FACC15,stroke:#EAB308,color:#18181B,stroke-width:2px;
    classDef dark fill:#27272A,stroke:#DC2626,color:#FFFFFF,stroke-width:2px;

    class A,B red;
    class C,J yellow;
    class D,E,F,G,H,I dark;
    class K red;
```

---

## 🔴 APPLICATION WORKFLOW

```mermaid
flowchart TD
    A["Start Application"]
    B["Open Java Swing Interface"]
    C["Select Management Function"]
    D["Enter or View Information"]
    E["Execute JDBC Operation"]
    F[("MySQL Database")]
    G["Display Result"]

    A --> B --> C --> D --> E --> F --> G

    classDef red fill:#B91C1C,color:#FFFFFF,stroke:#F87171;
    classDef yellow fill:#FACC15,color:#18181B,stroke:#EAB308;

    class A,C,E,G red;
    class B,D,F yellow;
```

---

## 🟡 APPLICATION SCREENSHOTS

<div align="center">

**Application Interface Preview**

| Administrator Login | Main Window |
|:---:|:---:|
| Screenshot coming soon | Screenshot coming soon |

| Student Management | Teacher Management |
|:---:|:---:|
| Screenshot coming soon | Screenshot coming soon |

</div>

> Screenshots will be added after capturing the actual running application.

---

## 🔴 PROJECT STRUCTURE

```text
class-management-system/
│
├── src/
│   │
│   ├── gui/
│   │   ├── adminLogin.java
│   │   ├── adminLogin.form
│   │   ├── home.java
│   │   ├── home.form
│   │   ├── teacherAdress.java
│   │   └── teacherAdress.form
│   │
│   ├── model/
│   │   └── mySql.java
│   │
│   └── img/
│       └── Application Icons
│
├── lib/
│   └── External Dependencies
│
├── manifest.mf
├── .env.example
├── .gitignore
└── README.md
```

The project also requires its NetBeans Ant build configuration files, including `build.xml` and `nbproject/`, to be recognized and built normally as a NetBeans project. Verify that these files are present in your local copy.

---

## 🟡 INSTALLATION GUIDE

### Step 01 — Requirements

Install the following software:

- Apache NetBeans IDE
- Compatible Java Development Kit
- MySQL Server
- Git (optional)

The original NetBeans project targets Java 8 source compatibility.

### Step 02 — Clone Repository

Open Git Bash, PowerShell or another terminal.

```bash
git clone https://github.com/AkashAmarasinghe/class-management-system.git
```

Navigate into the project:

```bash
cd class-management-system
```

### Step 03 — Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE learn;
```

**Important:** The original archive does not include a SQL database export or schema.

Required tables and relationships must be obtained or reconstructed before the application can run successfully.

### Step 04 — Configure Database Connection

The prepared project reads MySQL connection information from environment variables.

In Windows PowerShell:

```powershell
$env:CLASS_DB_URL = "jdbc:mysql://localhost:3306/learn"
$env:CLASS_DB_USER = "root"
$env:CLASS_DB_PASSWORD = "YOUR_LOCAL_PASSWORD"
```

Replace `YOUR_LOCAL_PASSWORD` with your own MySQL password.

Launch NetBeans from the same PowerShell session, or configure these values as Windows environment variables.

The `.env.example` file is a reference only. The application does not automatically load `.env` files.

### Step 05 — Open the Project

1. Open Apache NetBeans.
2. Select **File → Open Project**.
3. Locate the project directory.
4. Select the project.
5. Resolve missing dependencies under **Project Properties → Libraries**, if required.
6. Build and run the application.

The configured main class is:

```java
gui.home
```

---

## 🔴 SECURITY INFORMATION

This repository is intended for educational and development purposes.

The prepared version removes the original hardcoded MySQL credentials from the Java source code.

Further security improvements are recommended:

- Use prepared SQL statements.
- Implement secure password hashing.
- Validate all database inputs.
- Improve authentication and authorization.
- Keep credentials outside source code.
- Avoid committing sensitive database information.

---

## 🟡 FUTURE IMPROVEMENTS

Possible future enhancements include:

- Advanced search and filtering
- Report generation
- Export data to PDF and Excel
- Improved authentication security
- Role-based access control
- Enhanced form validation
- Automated testing
- UI and UX improvements

These are planned ideas rather than confirmed implemented features.

---

## 🔴 PROJECT STATUS

![Status](https://img.shields.io/badge/STATUS-EDUCATIONAL%20PROJECT-DC2626?style=for-the-badge)
![Source](https://img.shields.io/badge/SOURCE-AVAILABLE-FACC15?style=for-the-badge&logoColor=black)
![Testing](https://img.shields.io/badge/RUNTIME-NOT%20FULLY%20VERIFIED-991B1B?style=for-the-badge)

This project was developed for educational purposes.

The source code and project documentation were reviewed, but complete database functionality and runtime behavior have not yet been verified.

---

## 🟡 DEVELOPER

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=rect&height=4&color=0:DC2626,50:FACC15,100:DC2626" width="80%" alt="Divider"/>

<br/>

### 👨‍💻 AKASH AMARASINGHE

**Software Engineering Undergraduate**

**Full-Stack Developer | Java Enthusiast**

<br/>

[![GitHub](https://img.shields.io/badge/GITHUB-AKASH%20AMARASINGHE-DC2626?style=for-the-badge&logo=github&logoColor=white)](https://github.com/AkashAmarasinghe)

[![Project](https://img.shields.io/badge/CLASS-MANAGEMENT%20SYSTEM-FACC15?style=for-the-badge&logo=github&logoColor=black)](https://github.com/AkashAmarasinghe/class-management-system)

<br/>

**Built with Java ☕ | Designed with Passion ❤️**

<img width="100%" src="https://capsule-render.vercel.app/api?type=waving&height=130&section=footer&color=0:0B0B0F,35:991B1B,70:DC2626,100:FACC15" alt="Footer"/>

</div>
