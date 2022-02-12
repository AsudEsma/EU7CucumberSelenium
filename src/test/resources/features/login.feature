@login
Feature: User should be able to login
  @driver @smoke
  Scenario: Login as a driver
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
  @sales_manager
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login
  @store_manager @smoke
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login