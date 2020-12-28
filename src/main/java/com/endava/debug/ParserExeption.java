package com.endava.debug;

public class ParserExeption extends Exception {

    public ParserExeption() {
        super();
    }

    @Override
    public String getMessage() {
        return "Error occurs while parsing the CSV file: " + super.getMessage();
    }
}
