package oracle.assignmnet.stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber-reports"},
		tags= "@Assignment1",
		features = "src/test/resources",
		glue= {"stepdefinations"},
		monochrome = true
		)
 
public class TestRunner {

}