@Employee
Feature: EmployeeLoginFuntionality
  Description:
  As a Employee
  I Want to Login as Employee
  So that I can see Employee Home Page
@test
  Scenario: Verify Employee Login Functionality
    Given I am in Landing Page of Microtech
    Then I click on Login Menu Button
    And I click on Employee Login Menu
    And I input User Id
    And I input Password
    When I click on Employee Login button
    Then I Varify Employee Home Page
    Then I Varify Employee Id Massage
#
#  @test3
#  Scenario: Verify Employee Login Functionality
#    Given I am in Landing Page of Microtech
#    Then I click on Login Menu Button
#    And I click on Employee Login Menu
#    And I input User Id
#    And I input Password
#    When I click on Employee Login button
#    Then I Varify Employee Home Page
#    Then I Varify Employee Id Massage