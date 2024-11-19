package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.pageclass.CreateAccount_Page;
import org.pageclass.HomePage;
import org.utility.Utility;

import io.cucumber.java.en.*;

public class Account_creation_with_valid_data extends Utility{
	public static HomePage homePage;
	public static CreateAccount_Page createAccount_Page;
	@Given("User navigates to the Create an Account page")
	public void user_navigates_to_the_create_an_account_page() {
	    getDriver("Chrome");
	    getUrl("https://magento.softwaretestingboard.com/");
	    winMax();
	    
	    homePage =new HomePage();
	  homePage.getCreateAccount().click();
	    
	}
	@When("User enter valid details for account creation")
	public void user_enter_valid_details_for_account_creation() {
	    
		createAccount_Page=new CreateAccount_Page();
		createAccount_Page.getFirstName().sendKeys("Boopathi");
		createAccount_Page.getLastName().sendKeys("Raj");
		createAccount_Page.getEmail().sendKeys("Boopathirajsomasundharam@gmail.com");
		createAccount_Page.getPassword().sendKeys("Boop@123");
		createAccount_Page.getConPass().sendKeys("Boop@123");
		
	}
	@When("User clicks on the Create an Account button")
	public void user_clicks_on_the_create_an_account_button() {
		createAccount_Page=new CreateAccount_Page();
		createAccount_Page.getConfirmButton().click();
	    
	}
    
}

