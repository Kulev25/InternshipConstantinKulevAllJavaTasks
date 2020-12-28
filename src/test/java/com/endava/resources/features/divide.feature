Feature: Calculator
  As a user
  I want to use a calculator to count numbers,
  So that I don't have to do it by myself
#like a List
  @Run

  Scenario: Divide two numbers from list
    Given I have a calculator for division
    When I divide firstNumber by secondNumber
      | firstNumber | secondNumber |
      | 99          | 3            |
    Then The result of division is 33

  Scenario: Divide two numbers from list
    Given I have a calculator for division
    When I divide firstNumber by secondNumber
      | firstNumber | secondNumber |
      | 36          | 12           |
    Then The result of division is 3

