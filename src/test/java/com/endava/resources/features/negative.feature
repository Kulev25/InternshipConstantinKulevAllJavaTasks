Feature: Calculator
  As a user
  I want to use a calculator to count numbers,
  So that I don't have to do it by myself

  @Run
  Scenario: Subtract two numbers if first is smaller than second
    Given I have a calculator for fail subtraction test
    When I want to subtract 30 from 5
    Then The result of failed subtraction is 0