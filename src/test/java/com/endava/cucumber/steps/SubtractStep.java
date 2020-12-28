package com.endava.cucumber.steps;

import com.endava.cucumber.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class SubtractStep {
    //Like simple variables

    int expectedResult;
    private Calculator calculator;

    @Given("I have a calculator for subtraction")
    public void initializeCalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("I subtract {int} from {int}")
    public void subtractTwoNumbers(int secondNumber, int firstNumber)throws Throwable{
        expectedResult += Calculator.subtract(secondNumber,firstNumber);
        System.out.println("I subtract " + firstNumber + " from " + secondNumber);
    }

    @Then("The result of subtraction is {int}")
    public void validateResult(int result)throws Throwable{
        assertThat(expectedResult, Matchers.equalTo(result));
        System.out.println("compare the result " + result + " and the expected result " + expectedResult);
        }
    }