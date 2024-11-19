package org.stepdefinition;

import org.pageclass.CreateAccount_Page;
import org.pageclass.HomePage;
import org.utility.Utility;

import io.cucumber.java.en.*;

public class Account_creation_with_blank_required_fields extends Utility {
	public static HomePage homePage;
	public static CreateAccount_Page createAccount_Page;
	@Given("User navigate to Create an Account page")
	public void user_navigate_to_create_an_account_page() {
		 getDriver("Chrome");
		    getUrl("https://magento.softwaretestingboard.com/");
		    winMax();
		    homePage =new HomePage();
			  homePage.getCreateAccount().click();
	    
	}
	@When("User leaves the Full Name and Email fields blank")
	public void user_leaves_the_full_name_and_email_fields_blank() {
		createAccount_Page=new CreateAccount_Page();
		createAccount_Page.getFirstName().sendKeys("");
		createAccount_Page.getLastName().sendKeys("Raj");
		createAccount_Page.getEmail().sendKeys("");
		
		
	}
	@When("User enter a valid password and confirm password")
	public void user_enter_a_valid_password_and_confirm_password() {
		createAccount_Page=new CreateAccount_Page();
		createAccount_Page.getPassword().sendKeys("Boop@123");
		createAccount_Page.getConPass().sendKeys("Boop@123");
	    
	}
	@When("User clicks the Create an Account button")
	public void user_clicks_the_create_an_account_button() {
		createAccount_Page=new CreateAccount_Page();
		createAccount_Page.getConfirmButton().click();
	    
	}
	

}
