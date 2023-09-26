@Employee
Feature: CustomerLoginFunctionality
  Description:
  As a Customer
  I Want to Login as Customer
  So that I can see Customer Home Page

  Scenario: Verify Customer Login Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter User Id
    And I Enter Password
    When I click on Login button
    Then Verify I am in Customer Home Page




