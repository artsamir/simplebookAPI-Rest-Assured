# SimpleBookAPI Rest-Assured with TestNG

This repository demonstrates how to automate API testing using Rest-Assured and TestNG for a simple book API.

## Table of Contents
1. [Introduction](#introduction)
2. [Techstack](#Techstack)
3. [Project Setup](#project-setup)
4. [Folder Structure](#folder-structure)
5. [How to Run the Tests](#how-to-run-the-tests)
6. [Test Results](#test-results)


## Introduction

This project provides automated tests for the SimpleBook API using the Rest-Assured library, integrated with TestNG for testing and reporting. It demonstrates how to validate HTTP requests, responses, and perform various checks such as status code validation, response time, and JSON schema validation.

## Tech Stack

The following technologies are used in this project:

- ![Java](https://img.shields.io/badge/Java-11-F7B731?style=flat&logo=openjdk&logoColor=white) ![Java Icon](https://img.shields.io/static/v1?label=&message=Java&color=F7B731&logo=openjdk&logoColor=white&style=flat)
- ![Maven](https://img.shields.io/badge/Maven-3.8.4-2E6C71?style=flat&logo=apache-maven&logoColor=white) ![Maven Icon](https://img.shields.io/static/v1?label=&message=Maven&color=2E6C71&logo=apache-maven&logoColor=white&style=flat)
- ![Rest-Assured](https://img.shields.io/badge/Rest--Assured-4.3.3-50C878?style=flat&logo=swagger&logoColor=white) ![Rest-Assured Icon](https://img.shields.io/static/v1?label=&message=Rest-Assured&color=50C878&logo=swagger&logoColor=white&style=flat)
- ![TestNG](https://img.shields.io/badge/TestNG-7.4.0-1D8348?style=flat&logo=testng&logoColor=white) ![TestNG Icon](https://img.shields.io/static/v1?label=&message=TestNG&color=1D8348&logo=testng&logoColor=white&style=flat)


## Project Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/artsamir/simplebookAPI-Rest-Assured.git
    ```

2. **Prerequisites**:
    - Java 11 or higher
    - Maven
    - IDE (e.g., IntelliJ IDEA or Eclipse)

3. **Install Dependencies**:
    In the project directory, run:
    ```bash
    mvn install
    ```

4. **Project Configuration**:
    - **Rest-Assured**: Used for making API requests and assertions.
    - **TestNG**: A testing framework used for organizing and running tests.
    - **Maven**: For managing project dependencies and running tests.
  
## Folder Structure

```
artsamir-simplebookAPI-Rest-Assured/
│
├── pom.xml                              # Maven build configuration
├── src/
│   └── test/
│       └── java/
│           └── rest_assured/
│               └── simpleBook.java      # Main test case file
│
├── test-output/
│   ├── emailable-report.html            # Test results in email-friendly format
│   ├── index.html                       # General test overview page
│   ├── testng-reports/                  # TestNG reports and logs
│   │   ├── Default suite/
│   │   ├── junitreports/                # JUnit reports
│   │   └── old/                         # Archive of old reports
│
└── .metadata/
    ├── .plugins/                        # Eclipse plugin configurations
    └── version.ini                      # Version and workspace data
```
    

## How to Run the Tests

1. **Run Tests Using Maven**:  
   You can run the tests using Maven commands:
   ```bash
   mvn test
2. **Run Individual Test Class**:
   If you want to run a specific test class, use your IDE (e.g., IntelliJ IDEA or Eclipse) to run individual test files.

## Test Results
After the tests are executed, TestNG generates a test report (usually under /target/test-classes/testng-results.xml). You can also view the results in a more user-friendly format using the TestNG HTML report.

### Test Case Execution Status

| Test Case No. | Test Case Name        | Status                                      | Execution Time |
|---------------|-----------------------|---------------------------------------------|----------------|
| TC1           | Status                | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.5s           |
| TC2           | List of Books         | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.7s           |
| TC3           | Get a Single Book     | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.3s           |
| TC4           | API Authentication    | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.5s           |
| TC5           | Submit an Order       | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.7s           |
| TC6           | Get All Orders        | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.5s           |
| TC7           | Get an Order          | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 2s             |
| TC8           | Update an Order       | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.5s           |
| TC9           | Delete an Order       | ![Pass](https://img.shields.io/badge/Status-Pass-brightgreen)  | 1.7s           |

**Total Test Cases**: 9  
**Pass**: 1  
**Skipped**: 8  
**Fail**: 0

