package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//*[text() ='REGISTER']")
	WebElement register;

	@FindBy(xpath = "//*[text()='SIGN-ON']")
	WebElement signOn;

	@FindBy(xpath = "//*[text()='Flights']")
	WebElement flights;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickRegister() {
		click(register);
	}

	public void clickSignOn() {
		click(signOn);
	}

	public void clickFlights() {
		click(flights);
	}
}