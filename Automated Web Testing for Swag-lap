Getting Started

#Prerequisites
Java JDK 11 or later
Maven
WebDriver for your chosen browser (Chrome, Edge, etc.)

Installation
1-Clone this repository.
2-Download the WebDriver for your desired browser and place it in a directory accessible to your system path.
3-Open a terminal in the project directory and run mvn install.

Running Tests
1-Open a terminal in the project directory.
2-Run mvn test to execute all test cases.

# Sauce Demo Automation Tests
This project automates tests for the Sauce Demo [PLACEHOLDER LINK saucedemo ON Sauce Labs saucelabs.com] website using Selenium WebDriver and the TestNG framework.

## Table of Contents
.Project Setup
.Page Object Model (POM)
  -Pages
  -Base Test Class
.Test Cases
.Running Tests

## Project Setup
1-Clone this repository.
2-Install dependencies:
. Use a dependency management tool like Maven or Gradle to install required libraries (refer to project documentation for specific dependencies).
. Ensure you have the WebDriver for your chosen browser (e.g., ChromeDriver). Configure its path accordingly.
                                                                                       
## Page Object Model (POM)
This project utilizes the Page Object Model (POM) to improve code organization and maintainability. The POM separates page logic (elements and actions) from the test logic.

#Pages
.LoginPage: Contains methods for login functionality and verification.
.HomePage: Contains methods to interact with the home page elements.
.ProductPage: Contains methods to interact with the product page elements, including adding items to the cart.
.CartPage: Contains methods to interact with the shopping cart page elements, including checkout.
.CheckInfoPage: Contains methods to interact with the checkout information page.
.CheckOverViewPage: Contains methods to interact with the checkout overview page.
.FinishPage: Contains methods to interact with the order confirmation page.
                                                                                     
#Base Test Class
BaseTest: This class provides common functionalities like launching the browser and quitting it after tests are complete.
                                                                                     
# Test Cases
The Testpages package contains test classes for various functionalities of the Sauce Demo website. Here are some examples:
.LoginTest: Tests successful and unsuccessful login scenarios.
.HomeTest: Verifies successful login and asserts that the user lands on the home page.
.ProductTest: Tests product price validation and adding a product to the cart.
.CartTest: Asserts navigating to the cart page and initiates checkout flow.
.CheckInfoTest: Verifies navigating to the checkout information page.
.CheckOverViewTest: Verifies navigating to the checkout overview page.
.FinishTest: Performs an end-to-end test adding a product to the cart, checkout, and order confirmation.
                                                                                     
# Running Tests
.Ensure you have completed the project setup steps.
.Use TestNG to execute the test classes.
.Test results will be generated in the format specified by TestNG (e.g., reports).

# Dependencies  
This project uses the following external libraries:
.TestNG - A testing framework for Java.
.Selenium WebDriver - A library for automating web browsers.
.Checker Framework (Optional) - A static analysis framework for Java.                                                                                       
