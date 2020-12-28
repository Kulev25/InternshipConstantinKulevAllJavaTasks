package com.endava.debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());

    private double firstNumber;
    private double secondNumber;
    private String operator;
    private boolean status;
    private String row;             //a line with error for logs

    public Calculator() {           //constructor without parameters
    }

    public Calculator(double firstNumber, double secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    //method for validation
    public void addAttributes(String firstNumber, String secondNumber, String operator) {
        try {
            this.firstNumber = Double.parseDouble(firstNumber);
            this.secondNumber = Double.parseDouble(secondNumber);
            this.operator = operator;
            this.status = true;
        } catch (Exception e) {                    //в случае ошибки запись логов
            logger.error(e.getMessage());
            status = false;
        }
    }

    //choosing an action depending on the operator we have
    public Double doAction() {
        switch (operator) {
            case "+": {
                logger.info("Result of sum: ");         //writing logs
                return firstNumber + secondNumber;
            }
            case "-": {
                logger.info("Result of minus: ");
                return firstNumber - secondNumber;
            }
            case "*": {
                logger.info("Result of multiplication: ");
                return firstNumber * secondNumber;
            }
            case "/": {
                logger.info("Result of divide: ");
                return firstNumber / secondNumber;
            }
            case "%": {
                logger.info("Result of %: ");
                return firstNumber % secondNumber;
            }
            default:
                logger.info("Result of invalid operator: ");
        }
        return null;
    }

    public void displayWrongRow() {                                      //a method for displaying rows with an error
        if (!status) {
            System.out.println("Failed row: " + this.row);
        }
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getRow() {
        return row;
    }

    public boolean isStatus() {
        return status;
    }
}