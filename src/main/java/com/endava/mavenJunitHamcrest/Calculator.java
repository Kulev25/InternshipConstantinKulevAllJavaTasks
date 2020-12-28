package com.endava.mavenJunitHamcrest;

public class Calculator {
    public static double multiply(double firstNumber, double secondNumber) {
        if (firstNumber >= 0 && firstNumber <= 100 && secondNumber >= 0 && secondNumber <= 100) {
            return firstNumber * secondNumber;
        } else return 0;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        if (secondNumber >= 0 && firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else return 0;
    }

    public static double divide(double numberToBeDivided, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is impossible");
        } else if (divisor >= 0 && numberToBeDivided > divisor) {
            return numberToBeDivided / divisor;
        } else return 0;
    }
}
