package org.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Utility;

public class SignIn_Page extends Utility {

	public SignIn_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailId;

	@FindBy(name="login[password]")
	private WebElement password;

	public WebElement getEmailid(){
	return emailId;
	}

	public WebElement getPassword(){
	return password;
	}
	
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement signInButton;

	public WebElement getSignInButton() {
		return signInButton;
	}
	

}
