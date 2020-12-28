package com.endava.debug;

public class Application {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser("operator_and_operation.csv", ",");
        csvParser.parse();
    }
}
