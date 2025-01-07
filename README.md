# SimpleBookAPI Rest-Assured with TestNG

This repository demonstrates how to automate API testing using Rest-Assured and TestNG for a simple book API.

## Table of Contents
1. [Introduction](#introduction)
2. [Project Setup](#project-setup)
3. [Folder Structure](#folder-structure)
4. [How to Run the Tests](#how-to-run-the-tests)
5. [Test Results](#test-results)


## Introduction

This project provides automated tests for the SimpleBook API using the Rest-Assured library, integrated with TestNG for testing and reporting. It demonstrates how to validate HTTP requests, responses, and perform various checks such as status code validation, response time, and JSON schema validation.

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
    

## How to Run the Tests

1. **Run Tests Using Maven**:  
   You can run the tests using Maven commands:
   ```bash
   mvn test
2. **Run Individual Test Class**:
   If you want to run a specific test class, use your IDE (e.g., IntelliJ IDEA or Eclipse) to run individual test files.

## Test Results
After the tests are executed, TestNG generates a test report (usually under /target/test-classes/testng-results.xml). You can also view the results in a more user-friendly format using the TestNG HTML report.
