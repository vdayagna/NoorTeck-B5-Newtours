package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI {
	
	@FindBy(xpath = "//*[@value='roundtrip")
	WebElement clickRoundTrip;
	
	@FindBy(xpath ="//*[@value='oneway']")
	WebElement clickOneWay;
	
	@FindBy(xpath="//*[@name='passCount']")
	WebElement PassengerCount;
	
	@FindBy(xpath ="//*[@name='fromPort']")
    WebElement DepartingFrom;
	
	@FindBy(xpath = "//*[@name='fromMonth']")
	WebElement DepartingMonth;
	
	@FindBy(xpath = "//*[@name='fromDay']")
	WebElement OnDay;
	
	@FindBy(xpath = "//*[@name='toPort']")
	WebElement ArrivingIn;
	
	@FindBy(xpath = "//*[@name='toMonth']")
	WebElement ReturningMonth;
	
	@FindBy(xpath = "//*[@name='toDay']")
	WebElement returningDay;
	
	@FindBy(xpath = "//*[@value='Coach']")
	WebElement EconomyClass;
	
	@FindBy(xpath = "//*[@value='Business']")
	WebElement BusinessClass;
	
	@FindBy(xpath = "//*[@value='First']")
	WebElement FirstClass;
	
	@FindBy(xpath = "//*[@name='airline']")
	WebElement  noAirlinePreference;
	
	@FindBy(xpath ="//*[@name='findFlights']")
	WebElement clickContinue;
	
	@FindBy(xpath = "//*[@size= '4']")
	WebElement message;

	
}
/**

Test case 3:
1) Open the browser
2) Enter the URL http://demo.guru99.com/test/newtours/
3) Click on Flights tab
4) Select One Way from Type Options 
5) Select 3 from Passengers dropdown
6) Select New York from Departing From dropdown
7) Select January from Month dropdown 
8) Select 5 from date dropdown 
9) Select London from Returning Month dropdown 
10) Select 31 from Returning date dropdown 
11) Select First Class from Service Class Options 
12) Select Unified Airlines from Airline dropdown
16) Click on Continue button
17) Verify “After flight finder – No Seats Available” messaged displayed
*/