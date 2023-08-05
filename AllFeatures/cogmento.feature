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
