package com.endava.debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());
    private String fileName;
    private String delimiter;
    private List<Calculator> calculators = new ArrayList<>();

    public CSVParser() {
        fileName = "operator_and_operation.csv";
        delimiter = ",";
    }

    public CSVParser(String fileName, String delimiter) {
        this.fileName = fileName;
        this.delimiter = delimiter;
    }

    public void parse() {                                                            //method for reading file from resources
        Class clazz = CSVParser.class;
        InputStream inputStream = clazz.getResourceAsStream("/" + fileName);   // reads data from the file
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;                                                            //initialization of line
            while ((line = br.readLine()) != null) {                                //reads from CSV line by line
                logger.info("Line  " + line + " Has been successfully parsed");     //writes logs for every operation
                Calculator calculator = new Calculator();                           //initialization of calculator
                String[] lines = line.split(delimiter);                             //split each line on numbers
                for (int i = 0; i < line.length(); i++) {
                    calculator.addAttributes(lines[0], lines[2], lines[1]);         //adding attributes into calculator
                }
                calculator.setRow(line);
                calculators.add(calculator);
            }

            System.out.println("Display failed rows");                              //will show which rows got error
            for (Calculator calc : calculators) {
                calc.displayWrongRow();
            }

            System.out.println("Display calculator result");
            for (Calculator calc : calculators) {
                if (calc.isStatus())
                    System.out.println("Result for " + calc.getRow() + ": " + calc.doAction());
            }

        } catch (Exception e) {
            logger.error("The CSV file not found" + e.getMessage());
        }
    }
}
