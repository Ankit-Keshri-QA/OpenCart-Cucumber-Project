package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class LoginPageSteps {
	
	public WebDriver driver;
		

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	}

	@When("I enter a valid email {string}")
	public void i_enter_a_valid_email(String string) {
	}

	@When("I enter a valid password {string}")
	public void i_enter_a_valid_password(String string) {
	}

	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
	}

	@Then("I should be redirected to the customer dashboard")
	public void i_should_be_redirected_to_the_customer_dashboard() {
	}

	@When("I enter an invalid email {string}")
	public void i_enter_an_invalid_email(String string) {
	}

	@When("I enter an invalid password {string}")
	public void i_enter_an_invalid_password(String string) {
	}

	@Then("I should see an I should see {string}")
	public void i_should_see_an_i_should_see(String string) {
	}

	@When("I click on the forgotten password link")
	public void i_click_on_the_forgotten_password_link() {
	}

	@Then("I should be redirected to the password recovery page")
	public void i_should_be_redirected_to_the_password_recovery_page() {
	}

	@When("I enter an email {string}")
	public void i_enter_an_email(String string) {
	}

	@When("I enter a password {string}")
	public void i_enter_a_password(String string) {
	}

	@Then("I should see redirected to the dashboard")
	public void i_should_see_redirected_to_the_dashboard() {
	}

	@Then("I should see I should see {string}")
	public void i_should_see_i_should_see(String string) {
	}

}
