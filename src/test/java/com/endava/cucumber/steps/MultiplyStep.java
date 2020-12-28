package com.endava.cucumber.steps;

import com.endava.cucumber.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class MultiplyStep {
    double expectedResult;
    private Calculator calculator;


    @Given("I have a calculator for multiplication")
    public void initializeCalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("I multiply {double} & {double}")
    public void imultiply(double firstNumber, double secondNumber) throws Throwable {
        expectedResult += Calculator.multiply(firstNumber, secondNumber);
        System.out.println("I multiply " + firstNumber + " by " + secondNumber);
    }


    @Then("I get the result {double}")
    public void validateResult(double result) throws Throwable {
        assertThat(expectedResult, Matchers.equalTo(result));
        System.out.println("compare the result " + result + " and the expected result " + expectedResult);
    }

}

