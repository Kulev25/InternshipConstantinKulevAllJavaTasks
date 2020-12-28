package com.endava.cucumber.steps;

import com.endava.cucumber.Calculator;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
//like a List

public class DivideStep {
    double expectedResult;
    private Calculator calculator;

    @Given("I have a calculator for division")
    public void initializeCalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("I divide firstNumber by secondNumber")
    public void divideTwoNumbers(DataTable numbers) throws Throwable {
        List<Map<String, String>> list = numbers.asMaps(String.class, String.class);
        expectedResult = Double.parseDouble(list.get(0).get("firstNumber")) / Double.parseDouble(list.get(0).get("secondNumber"));
    }

    @Then("The result of division is {double}")
    public void validateResult(double result){
        assertEquals(result, expectedResult);
    }
}
