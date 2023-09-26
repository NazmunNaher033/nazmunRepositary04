@Employee
Feature: EmployeeOrderFunctionality
  Description:
  As a Employee
  I Want to Login as Employee
  So that I can see Employee Home Page

  Scenario: Verify Employee Order Functionality
    Given I am in Landing Page of Microtech
    Then I click on Login Menu Button
    And I click on Employee Login Menu
    And I input User Id
    And I input Password
    When I click on Employee Login button
    Then I click Product Order Menu
    Then I verify Product Name
    Then I put Order Date
    Then Click Product Button
    When I confirm Order Product
    Then I Confirmed Employee Order