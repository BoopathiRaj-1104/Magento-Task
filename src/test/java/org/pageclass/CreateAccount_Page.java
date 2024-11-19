package org.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Utility;

public class CreateAccount_Page extends Utility {

	public CreateAccount_Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstname")
	private WebElement firstName;
	@FindBy(id="lastname")
	private WebElement lastName;
	@FindBy(id="email_address")
	private WebElement email;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="password-confirmation")
	private WebElement conPass;
	@FindBy(xpath="//span[text()='Create an Account']/parent::button")
	private WebElement confirmButton;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConPass() {
		return conPass;
	}
	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
}
