@Customer
Feature: CustomerOrderFunctionality
  Description:
  As a Customer
  I Want to Login as Customer
  So that I can see Customer Home Page

  Scenario: Verify Customer Order Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter User Id
    And I Enter Password
    When I click on Login button
    Then Verify I am in Customer Home Page
    Then I click Customer Product Order Menu
    Then I verify Customer Product Name
    Then I Write Order Date
    Then Click Submit Product Button
    When I confirm Customer Order Product
    And I verified Product Confirmed