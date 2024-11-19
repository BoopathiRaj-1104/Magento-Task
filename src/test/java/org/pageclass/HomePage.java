package org.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Utility;

public class HomePage extends Utility {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[contains(text(), 'Sign In')])[1]")
	private WebElement signIn;


	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	private WebElement createAccount;


	public WebElement getSignIn() {
		return signIn;
	}


	public WebElement getCreateAccount() {
		return createAccount;
	}
	
}
