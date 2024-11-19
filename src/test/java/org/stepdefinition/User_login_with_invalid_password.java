package org.stepdefinition;

import org.pageclass.CreateAccount_Page;
import org.pageclass.HomePage;
import org.pageclass.SignIn_Page;
import org.utility.Utility;

import io.cucumber.java.en.*;

public class User_login_with_invalid_password extends Utility{
	public static HomePage homePage;
	public static SignIn_Page signIn_Page;
	@Given("User navigate to  Sign in page")
	public void user_navigate_to_sign_in_page() {
		 getDriver("Chrome");
		    getUrl("https://magento.softwaretestingboard.com/");
		    winMax();
		    homePage =new HomePage();
		   homePage.getSignIn().click();
	    
	}
	@When("User enter a valid email and an invalid password")
	public void user_enter_a_valid_email_and_an_invalid_password() {
		signIn_Page=new SignIn_Page();
		signIn_Page.getEmailid().sendKeys("Boopathirajsomasundharam@gmail.com");
		signIn_Page.getPassword().sendKeys("IBoop@123");
		
	   
	}
	@When("User click Sign in button")
	public void user_click_sign_in_button() {
		signIn_Page=new SignIn_Page();
		signIn_Page.getSignInButton().click();
	}
	@Then("User should see an error message indicating that the password is incorrect")
	public void user_should_see_an_error_message_indicating_that_the_password_is_incorrect() {
	    
	    
	}
	
}
