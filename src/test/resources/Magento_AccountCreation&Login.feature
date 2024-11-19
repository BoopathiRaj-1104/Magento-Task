Feature: User account creation and login functionality in Magento

  # Positive Test Scenarios for Account Creation and Login

  Scenario: Account creation with valid data
    Given User navigates to the Create an Account page
    When User enter valid details for account creation
    And User clicks on the Create an Account button
@signIN
  Scenario: User login with valid credentials
    Given Users navigate to the Sign in page
    When User enter valid login details
    And Users click on the Sign in button
    

  # Negative Test Scenarios for Account Creation and Login
@NegScen01
  Scenario: Account creation with blank required fields
    Given User navigate to Create an Account page
    When User leaves the Full Name and Email fields blank
    And User enter a valid password and confirm password
    And User clicks the Create an Account button
    
@NegScen02
  Scenario: User login with invalid password
    Given User navigate to  Sign in page
    When User enter a valid email and an invalid password
    And User click Sign in button
    Then User should see an error message indicating that the password is incorrect


@NegScen03
  Scenario: User login with blank fields
    Given User navigate Sign in page
    When User leave the Email and Password fields blank
    And User clicks the Sign in button
    