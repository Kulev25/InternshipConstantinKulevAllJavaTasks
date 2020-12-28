Feature: Calculator
  As a user
  I want to use a calculator to count numbers,
  So that I don't have to do it by myself
#Like simple variables
  @Run
  Scenario: Subtract two numbers
    Given I have a calculator for subtraction
    When I subtract 5 from 30
    Then The result of subtraction is 25

  Scenario: Subtract two numbers
    Given I have a calculator for subtraction
    When I subtract 8 from 20
    Then The result of subtraction is 12

  Scenario: Subtract two numbers
    Given I have a calculator for subtraction
    When I subtract 35 from 85
    Then The result of subtraction is 50