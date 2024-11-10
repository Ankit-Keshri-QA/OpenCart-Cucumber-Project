package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/h2")
	private WebElement returningCustomerText;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/h2//following-sibling::p//strong")
	private WebElement returningCustomerSubText;

	@FindBy(name = "email")
	private WebElement emailField;

	@FindBy(name = "password")
	private WebElement passwordField;

	@FindBy(css = "div[class='form-group'] [href*='forgotten']")
	private WebElement forgottenPasswordLink;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButton;

	public String getReturningCustomerText() {
		return returningCustomerText.getText();
	}

	public String getReturningCustomerSubText() {
		return returningCustomerSubText.getText();
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickForgottenPassword() {
		forgottenPasswordLink.click();
	}

	public void clickLogin() {
		loginButton.click();
	}

	public void doLogin(String email, String pass) {
		enterEmail(email);
		enterPassword(pass);
		clickLogin();

	}

}
