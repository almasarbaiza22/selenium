package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		 plugin = {"pretty"},
         features = "src/test/java/Features"
         ,glue= {"stepdefs"}
        ,tags = {"@test1"}
	     ) 

public class TestRunner {

}
