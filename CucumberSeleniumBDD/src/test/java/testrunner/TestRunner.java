package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"stepdefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		monochrome = true
		
		)

public class TestRunner {
	

}
