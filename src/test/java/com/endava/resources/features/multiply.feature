Feature: Calculator
  As a user
  I want to use a calculator to count numbers,
  So that I don't have to do it by myself

  @Run
  Scenario Outline: Multiply two numbers
    Given I have a calculator for multiplication
    When I multiply <firstNumber> & <secondNumber>
    Then I get the result <expectedResult>

    Examples:
      | firstNumber | secondNumber | expectedResult |
      | 5           | 3            | 15             |
      | 17          | 17           | 289            |
      | 35          | 26           | 910            |
      | 52          | 35           | 1820           |