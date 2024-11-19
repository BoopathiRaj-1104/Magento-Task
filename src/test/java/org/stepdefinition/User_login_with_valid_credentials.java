
package org.stepdefinition;

import org.pageclass.HomePage;
import org.pageclass.SignIn_Page;
import org.utility.Utility;

import io.cucumber.java.en.*;

public class User_login_with_valid_credentials extends Utility {
	public static HomePage homePage;
	public static SignIn_Page signIn_Page;
	@Given("Users navigate to the Sign in page")
	public void users_navigate_to_the_sign_in_page() {
	    getDriver("Chrome");
	    getUrl("https://magento.softwaretestingboard.com/");
	    winMax();
	    homePage=new HomePage();
	    homePage.getSignIn().click();
	}
	@When("User enter valid login details")
	public void user_enter_valid_login_details() {
	    signIn_Page=new SignIn_Page();
	    signIn_Page.getEmailid().sendKeys("Boopathirajsomasundharam@gmail.com");
	    signIn_Page.getPassword().sendKeys("Boop@123");
	    
	    
	}
	@When("Users click on the Sign in button")
	public void users_click_on_the_sign_in_button() {
		signIn_Page=new SignIn_Page();
		signIn_Page.getSignInButton().click();
	    
	}
	


	
}