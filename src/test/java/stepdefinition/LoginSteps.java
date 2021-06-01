package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@When("^I authorize user \"([^\"]*)\" to access application$")
	public void i_authorize_user_to_access_application(String arg1) {
		System.out.println("LogIn to application");
	}
	
	@Then("^User can get information on home page$")
	public void user_can_get_information_on_home_page() {
		System.out.println("Home page");
	}
}
