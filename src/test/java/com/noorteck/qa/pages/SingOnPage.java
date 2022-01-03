package com.noorteck.qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SingOnPage extends CommonUI {

	@FindBy(xpath = "//input[@name = 'userName']")
	WebElement userNameField;
	
	@FindBy(xpath ="//input[@name ='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@name ='submit']")
     WebElement submit;
	
	@FindBy(xpath = "//*[text()='Login Successfully']")
	WebElement Loginsuccessfully;
	
	@FindBy(xpath = "//b[contains(text(), 'Thank you for Loggin')]")
	WebElement ThankyouforLoggin;


	public SingOnPage() {
		PageFactory.initElements(driver,this);
	}
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	public void clickSubmitButton() {
		click(submit);
	}
	
	public boolean isDisplayed(WebElement element) {
			try {

				return element.isDisplayed();

			} catch (Exception e) {
	
				System.out.println("Element is displayed:" + element);
				e.printStackTrace();
	
				return false;
}
	
}	

}

/**
Test case 1:
1) Open the browser
2) Enter the URL http://demo.guru99.com/test/newtours/
3) Click on SIGN-ON link
4) Enter username in username textbox
5) Enter password in password textbox
6) Click on Submit button
7) Verify “Login Successfully” messaged displayed
8) Verify “Thank you for Loggin.” messaged displayed




*/