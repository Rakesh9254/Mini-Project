# Mini Project - Amazon India Website Testing

## Project Overview
This is a Selenium WebDriver automation testing project for Amazon India website. The project uses TestNG framework to automate basic functionality tests including title verification and logo visibility checks.

**Project Name:** Mini Project
**Module Name:** Amazon VerifyTitle, Logo
**Created By:** Rakesh Kumar Roshan
**Date of Creation:** 08/12/2023
**Date of Review:** 08/12/2023

## Features
- Automated UI testing using Selenium WebDriver
- TestNG framework integration for test management
- Chrome browser automation
- Page title verification
- Logo visibility verification

## Technologies Used
- **Java** - Programming language
- **Selenium WebDriver** - Browser automation framework
- **TestNG** - Testing framework
- **ChromeDriver** - Chrome browser driver
- **Maven/Gradle** (recommended for dependency management)

## Prerequisites
Before running this project, ensure you have the following installed:

1. **Java Development Kit (JDK)** - Version 8 or higher
   - Download from: https://www.oracle.com/java/technologies/downloads/

2. **Chrome Browser** - Latest version recommended

3. **ChromeDriver** - Compatible with your Chrome browser version
   - Download from: https://chromedriver.chromium.org/downloads
   - Ensure ChromeDriver is in your system PATH

4. **IDE** (Recommended)
   - Eclipse, IntelliJ IDEA, or any Java IDE

5. **Dependencies** (Add to your project):
   - Selenium WebDriver
   - TestNG

## Project Structure
```
Mini-Project/
│
├── ProjectMini.java           # Main test class with test cases
├── Mini Project Amazon - Google Sheets.pdf  # Test case documentation
└── README.md                  # This file
```

## Test Cases

### TC_VerifyTitle_01: Verify Page Title
**Test Scenario:** Verify that the Amazon India website title matches the expected title.

**Test Steps:**
1. Open the Amazon India website
2. Get the actual title of the web page
3. Assert that the actual title matches the expected title

**Expected Result:** "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"

### TC_VerifyTitle_02: Verify Logo
**Test Scenario:** Verify that the Amazon logo is displayed on the homepage.

**Test Steps:**
1. Open the Amazon India website
2. Locate the logo element with ID 'nav-logo-sprites'
3. Check if the logo is displayed
4. Assert that the logo is visible

**Expected Result:** The Amazon logo should be visible on the page.

## Setup Instructions

### Option 1: Using Maven (Recommended)

1. Create a `pom.xml` file in your project root:
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.15.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.8.0</version>
    </dependency>
</dependencies>
```

2. Run `mvn clean install` to download dependencies

### Option 2: Manual Setup

1. Download Selenium WebDriver JAR files
2. Download TestNG JAR files
3. Add JARs to your project's build path

## Running the Tests

### Using IDE (Eclipse/IntelliJ)
1. Right-click on `ProjectMini.java`
2. Select "Run As" > "TestNG Test"
3. View results in the TestNG Results tab

### Using Maven Command Line
```bash
mvn test
```

### Using TestNG XML (Create testng.xml)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Amazon Test Suite">
    <test name="Amazon Tests">
        <classes>
            <class name="Project01.ProjectMini"/>
        </classes>
    </test>
</suite>
```

Run with:
```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Expected Output
When tests run successfully, you should see:
```
[TestNG] Running:
  Default Suite

PASSED: VerifyTitle
PASSED: VerifyLogo

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================
```

## Troubleshooting

### Common Issues

1. **ChromeDriver version mismatch**
   - Ensure your ChromeDriver version matches your Chrome browser version
   - Download the correct version from ChromeDriver downloads

2. **Element not found**
   - Amazon's website structure may change
   - Update the XPath locator if the logo element ID changes

3. **Title mismatch**
   - Amazon may update their page title
   - Update the expected title string in the code

4. **Browser doesn't launch**
   - Verify ChromeDriver is in your system PATH
   - Check that Chrome browser is installed

## Future Enhancements
- Add more test cases (search functionality, cart operations, etc.)
- Implement Page Object Model (POM) design pattern
- Add data-driven testing using TestNG DataProvider
- Integrate with CI/CD pipeline (Jenkins, GitHub Actions)
- Add test reporting (Extent Reports, Allure)
- Implement parallel test execution
- Add cross-browser testing support (Firefox, Edge, Safari)

## Contributing
Feel free to fork this project and submit pull requests for any improvements.

## License
This project is for educational purposes.

## Contact
**Author:** Rakesh Kumar Roshan
**Date:** 08/12/2023

---

**Note:** This is a learning project for automation testing practice. The tests interact with Amazon India's live website, so test behavior may vary based on website changes.
