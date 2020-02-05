package com.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict=true, 
		features= { "src/test/resources/features"},
		glue= {"com.stepdefs"},
		plugin = {"json:target/cucumber.json" },
		monochrome=true
		)
public class CucumberRunner {

}