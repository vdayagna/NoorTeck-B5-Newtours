package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SingOnPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public WebDriver driver;
	
	//declare class objects and common objects
	public HomePage homeobj;
    public RegisterPage registerPageobj;
    public FlightsPage flightspageobj;
    public SingOnPage signonobj;
}
