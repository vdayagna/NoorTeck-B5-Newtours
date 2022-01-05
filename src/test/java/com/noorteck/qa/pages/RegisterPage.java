package com.noorteck.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI{

	@FindBy(xpath = "//*[@name = 'firstName']")
	WebElement firstNameField;
	
	@FindBy(xpath = "//*[@name = 'lastName']")
	WebElement lastNameField;
	
	@FindBy(xpath = "//*[@name = 'phone']")
	WebElement phoneField;
	
	@FindBy(xpath = "//*[@name = 'userName']")
	WebElement emailField;
	
	@FindBy(xpath = "//*[@name = 'address1']")
    WebElement addressField;
	
	@FindBy(xpath = "//*[@name = 'city']")
	WebElement cityField;
	
	@FindBy(xpath = "//*[@name = 'state']")
	WebElement stateField;
	
	@FindBy(xpath = "//*[@name = 'postalCode']")
	WebElement postalCodeField;
	
	@FindBy(xpath = "//*[@name = 'email']")
	WebElement usernameField;
	
	@FindBy(xpath = "//*[@name = 'password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//b[contains(text(),'Country')]")
	WebElement countrydropdown;
	
	@FindBy(xpath = "//*[@name = 'confirmPassword']")
	WebElement confirmpasswordField;
	
	@FindBy(xpath = "//*[@name = 'submit']")
	WebElement submitButton;


	
	public RegisterPage() {
		PageFactory.initElements(driver,this);
	}
	public void enterfirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	public void enterphone(String phone) {
		enter(phoneField, phone);
	}
	public void enterlastName(String lastName) {
		enter(firstNameField, lastName);
	}
	public void enteremail(String email) {
		enter(emailField, email);
	}
	public void enteraddress(String address) {
		enter(addressField,address);
	}
	public void entercity(String city) {
		enter(cityField,city);
	}
	public void enterstate(String state) {
		enter(stateField,state);
	}
	public void enterpostalCodeField(String postalCode) {
		enter(postalCodeField, postalCode);
	}
	public void enterusername(String username) {
		enter(usernameField,username);
	}
	public void enterpassword(String password) {
		enter(passwordField,password);
	}
	public void entercountrydropdown(String methodName, String indexTextValue) {
		selectFromDropdown(countrydropdown,methodName, indexTextValue);
	}
	public void enterconfirmpassword(String confirmpassword) {
	enter(confirmpasswordField, confirmpassword);
	}
	public void clicksubmitButton() {
		click(submitButton);
	}
	
	}
	
/**

Test case 2:
1) Open the browser
2) Enter the URL http://demo.guru99.com/test/newtours/
3) Click on REGISTER link
4) Enter first name in first name textbox 
5) Enter last name in last name textbox
6)Enter phone number in phone textbox
7) Enter email in email textbox 
8) Enter address in address textbox
9) Enter city in city textbox
10) Enter state in state textbox
11) Enter zipcode in postal code textbox
12) Select your country from country dropdown
13) Enter username in username textbox
14) Enter password in password textbox
15) enter confirm password in confirm password textbox
16) Click on Submit button
17) Verify “Thank you for registering” messaged displayed

*/