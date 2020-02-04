package com.cucumber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict=true, 
		features= { "src/test/resources/features"},
		glue= {"com.stepdefs"},
		plugin = { "html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
	        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
		monochrome=true,
		tags={"@runthis"}
		)
public class CucumberRunner {

}