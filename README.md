# 📘 Bookstore API Automation Framework

## 📖 Overview
This project is an **API Test Automation Framework** built using **Java + RestAssured + TestNG + Maven**.  
It automates the testing of a **Bookstore API (FastAPI backend)** and validates major **CRUD operations**.

The framework is integrated with **Extent Reports** for reporting and **GitHub Actions CI/CD** for continuous testing.

---

##  Features
-  API Test Automation with **RestAssured**
- **TestNG** for test execution & grouping
- **Extent Reports** for detailed HTML reports
-  Covers **Positive & Negative Test Scenarios**
-  Supports **CRUD Operations (Create, Read, Update, Delete)**
-  Request Chaining between API calls
-  Environment Configurable (`config.properties`)
-  Integrated with **GitHub Actions CI/CD**

---

## 📂 Project Structure
bookstore_automation_java/
│── src/
│ ├── main/
│ │ └── java/
│ │ └── utils/
│ │ └── ConfigManager.java # Config file manager
│ └── test/
│ └── java/
│ ├── base/
│ │ └── BaseTest.java # Test setup/teardown
│ └── tests/
│ └── BookstoreTests.java # API test cases
│── reports/ # Test execution reports
│── config.properties # Config file (base URL, envs, etc.)
│── pom.xml # Maven dependencies
│── testng.xml # TestNG suite
│── .github/workflows/maven.yml # GitHub Actions CI/CD pipeline
│── README.md # Documentation



---

## 🛠️ Tech Stack
- **Language:** Java 17
- **API Testing:** RestAssured
- **Test Framework:** TestNG
- **Reports:** Extent Reports
- **Build Tool:** Maven
- **CI/CD:** GitHub Actions

---

## ⚡ Setup & Execution

### 1. Clone the Repo
```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd bookstore_automation_java
