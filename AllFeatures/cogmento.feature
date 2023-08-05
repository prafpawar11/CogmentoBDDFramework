@RegressionSuite
Feature: Test Cogmento CRM application

  #Login Functionality Written by Senior Automation Test Engineer
  Scenario: Test login Functionality
    Given user is on login page
    When user enter valid username and password and click on login button

  #Home Page Code By Amit Automation test Engineer
  Scenario: Test Home Page Functionality
    When user is on home page and validate home page title
    And validate home page url
    And validate home page logo

  #Gauri Automation test Engineer
  Scenario: Create user account
    Given user click on contact link
    Then user click on create create button
    Then user enters Firstname Last
    And click on save button

  #Sarita Automation test Engineer
  Scenario: Test Deals Page
    Given User click on deals link
    Then user enters title
    And click on Deals save button
