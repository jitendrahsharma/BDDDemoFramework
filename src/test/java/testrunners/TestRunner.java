package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				   "timeline:test-output-thread/"
				      },
				monochrome = true,
				glue = {"parallel"},
				features = {"src/test/resources/parallel/LoginPage.feature"}
		)
public class TestRunner {


}
