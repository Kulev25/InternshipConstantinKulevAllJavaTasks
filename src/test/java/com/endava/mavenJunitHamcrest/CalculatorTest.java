package com.endava.mavenJunitHamcrest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
class CalculatorTest extends Calculator {

    @DisplayName("Multiply - Happy test")
    @CsvSource(value = {"10, 2", "20, 5", "5, 3"})
    @ParameterizedTest(name = "Multiply between {0} and {1}")
    void multiplyHappyTest(double firstNumber, double secondNumber) {
        double actualResult = Calculator.multiply(firstNumber, secondNumber);
        double expectedResult = firstNumber * secondNumber;
        assertThat(String.format("Verifying numbers [%s, %s] are multiplied correctly", firstNumber, secondNumber), actualResult, is(expectedResult));
    }

    @DisplayName("Multiply - Negative test")
    @CsvSource(value = {"-5, 2", "105, 3", "-2, 110"})
    @ParameterizedTest(name = "Multiply between {0} and {1}")
    void multiplyNegativeTest(double firstNumber, double secondNumber) {
        double actualResult = Calculator.multiply(firstNumber, secondNumber);
        double expectedResult = 0;
        assertThat("Verifying multiplication of outbound numbers gives '0' as result", actualResult, is(expectedResult));
    }

    @DisplayName("Subtract - Happy test")
    @CsvSource(value = {"50,10", "20,5", "10,6"})
    @ParameterizedTest
    void subtractHappyTest(int firstNumber, int secondNumber) throws Exception {
        int actualResult = Calculator.subtract(firstNumber, secondNumber);
        int expectedResult = firstNumber - secondNumber;
        assertThat(String.format("Verifying numbers [%s, %s] are substracted correctly", firstNumber, secondNumber), actualResult, is(expectedResult));
    }

    @DisplayName("Subtract - Negative test")
    @CsvSource(value = {"-10,6", "20,105", "10,60"})
    @ParameterizedTest
    void subtractNegativeTest(int firstNumber, int secondNumber) throws Exception {
        int actualResult = Calculator.subtract(firstNumber, secondNumber);
        int expectedResult = 0;
        assertThat("Verifying subtraction of outbound numbers gives '0' as result", actualResult, is(expectedResult));
    }

    @DisplayName("Division - Happy test")
    @MethodSource("methodSource")
    @ParameterizedTest
    public void divideHappyTest(double numberToBeDivided, double divisor) {
        assertEquals(numberToBeDivided / divisor, Calculator.divide(numberToBeDivided, divisor));
    }

    static Stream<Arguments> methodSource() {
        return Stream.of(Arguments.of(40, 20),
                Arguments.of(100, 25),
                Arguments.of(75, 3));
    }

    @DisplayName("Division by zero test")
    @Test
    void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> divide(50, 0));
    }

    @DisplayName("Division - Negative test")
    @RepeatedTest(3)
    void divisionHappyTest() {
        assertEquals(0, divide(50, 100));
        assertEquals(0, divide(-20, 5));
    }

    //To run the test from mvn command - mvn -Dtest=CalculatorTest test

}



