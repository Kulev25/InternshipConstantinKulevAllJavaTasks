package com.endava.cucumber.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        glue = {"com.endava.cucumber.steps"},//Step definitions package
        features = {"src/test/java/com/endava/resources/features"},//feature file directory
        tags = {"@Run"}//Tags
)
public class Runner {

}
