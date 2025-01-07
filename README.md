# SimpleBook API Automation with Rest Assured

Welcome to the **SimpleBook API Automation** project! This repository demonstrates the power of **Rest Assured** for performing automated tests on APIs. It's built with modern tools and follows best practices for API testing and report generation.

## Tech Stack

The following technologies are used in this project:

- <img src="https://img.icons8.com/ios-filled/50/000000/java-coffee-cup-logo.png" width="20" height="20" /> **Java**
- <img src="https://img.icons8.com/ios-filled/50/000000/automation.png" width="20" height="20" /> **Rest Assured**
- <img src="https://img.icons8.com/ios-filled/50/000000/test-tube.png" width="20" height="20" /> **TestNG**
- <img src="https://img.icons8.com/ios-filled/50/000000/apache-maven.png" width="20" height="20" /> **Maven**
- <img src="https://img.icons8.com/ios-filled/50/000000/git.png" width="20" height="20" /> **Git**
- <img src="https://img.icons8.com/ios-filled/50/000000/junit.png" width="20" height="20" /> **JUnit**
- <img src="https://img.icons8.com/ios-filled/50/000000/html.png" width="20" height="20" /> **HTML Reports**
- <img src="https://img.icons8.com/ios-filled/50/000000/docker.png" width="20" height="20" /> **Docker** *(if applicable)*

### Color Palette

- **Java**: <span style="color:#007396;">#007396</span>
- **Rest Assured**: <span style="color:#F48C06;">#F48C06</span>
- **TestNG**: <span style="color:#E04E39;">#E04E39</span>
- **Maven**: <span style="color:#C71A36;">#C71A36</span>

---

## Project Structure

Here's an overview of the project directory structure:

```bash
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
