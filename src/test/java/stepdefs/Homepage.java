package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepsPages.HomepagePages;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import utility.util.TestBase;


public class Homepage extends TestBase{

	HomepagePages product;

	@Given("^I want to navigate to the UI$")
	public void i_want_to_navigate_to_the_UI() throws Throwable {
		TestBase.initialization();
	
}
	@Given("^I search for 'test'$")
	public void i_search_for_test() throws Throwable {

	}

	@Then("^I should see results$")
	public void i_should_see_results() throws Throwable {
	  
	}
}