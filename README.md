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

- ![Java](https://img.shields.io/badge/Java-11-blue?style=flat&logo=openjdk&logoColor=white)  
- ![Maven](https://img.shields.io/badge/Maven-3.8.4-c71a36?style=flat&logo=apache-maven&logoColor=white)  
- ![Rest-Assured](https://img.shields.io/badge/Rest--Assured-4.3.3-00b0b9?style=flat&logo=swagger&logoColor=white)  
- ![TestNG](https://img.shields.io/badge/TestNG-7.4.0-2e6a47?style=flat&logo=testng&logoColor=white)


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

- **`pom.xml`**: Maven build configuration file for managing dependencies and build settings.
- **`src/test/java/rest_assured/simpleBook.java`**: Main test case file containing the automation tests.
- **`test-output/`**: Contains the test results and reports.
  - **`emailable-report.html`**: A report formatted for easy emailing.
  - **`index.html`**: A general overview of the test results.
  - **`testng-reports/`**: Detailed TestNG reports and logs.
    - **`Default suite/`**: Default suite report data.
    - **`junitreports/`**: JUnit-style reports.
    - **`old/`**: Archived reports from previous test runs.
- **`.metadata/`**: Metadata for the Eclipse IDE.
  - **`.plugins/`**: Eclipse plugin configurations.
  - **`version.ini`**: Eclipse workspace and version data.
    

## How to Run the Tests

1. **Run Tests Using Maven**:  
   You can run the tests using Maven commands:
   ```bash
   mvn test
2. **Run Individual Test Class**:
   If you want to run a specific test class, use your IDE (e.g., IntelliJ IDEA or Eclipse) to run individual test files.

## Test Results
After the tests are executed, TestNG generates a test report (usually under /target/test-classes/testng-results.xml). You can also view the results in a more user-friendly format using the TestNG HTML report.
