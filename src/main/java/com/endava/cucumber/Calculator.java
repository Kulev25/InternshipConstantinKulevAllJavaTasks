package com.endava.cucumber;

public class Calculator {
    public static double multiply(double firstNumber, double secondNumber) {
        if (firstNumber >= 0 && firstNumber <= 100 && secondNumber >= 0 && secondNumber <= 100) {
            return firstNumber * secondNumber;
        } else return 0;
    }

    public static int subtract(int secondNumber, int firstNumber) {
        if (secondNumber >= 0 && firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else return 0;
    }

    public static double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Division by zero is impossible");
        } else if (secondNumber >= 0 && firstNumber > secondNumber) {
            return firstNumber / secondNumber;
        } else return 0;
    }
}

