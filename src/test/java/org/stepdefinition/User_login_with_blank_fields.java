package org.stepdefinition;

import org.pageclass.HomePage;
import org.pageclass.SignIn_Page;
import org.utility.Utility;

import io.cucumber.java.en.*;

public class User_login_with_blank_fields extends Utility{
	public static HomePage homePage;
	public static SignIn_Page signIn_Page;
	@Given("User navigate Sign in page")
	public void user_navigate_sign_in_page() {
		getDriver("Chrome");
	    getUrl("https://magento.softwaretestingboard.com/");
	    winMax();
	    homePage=new HomePage();
	    homePage.getSignIn().click();
	    
	}
	@When("User leave the Email and Password fields blank")
	public void user_leave_the_email_and_password_fields_blank() {
		signIn_Page=new SignIn_Page();
	    signIn_Page.getEmailid().sendKeys("");
	    signIn_Page.getPassword().sendKeys("");
	    
	    
	}
	@When("User clicks the Sign in button")
	public void user_clicks_the_sign_in_button() {
		signIn_Page=new SignIn_Page();
		signIn_Page.getSignInButton().click();
	}



	}


