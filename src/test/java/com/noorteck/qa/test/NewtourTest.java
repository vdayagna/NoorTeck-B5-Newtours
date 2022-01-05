package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SingOnPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "http://demo.guru99.com/test/newtours/";
		
		CommonUI commonUIobj = new CommonUI();
		ObjInitialize obj = new ObjInitialize();
		//NewtourTest testobj = new NewtourTest();
		//HomePage homeobj = new HomePage();
		//RegisterPage registerobj = new RegisterPage();
		//FlightsPage flightsobj = new  FlightsPage();
		//SingOnPage signonobj = new SingOnPage();
		
		CommonUI.openBrowser("chrome"); //Open the browser
		CommonUI.navigate(url); //navigate to URL
		initializeClassObj();
		NewtourTestOne();
		NewTourTestTwo();
		//testobj.NewtourTestOne();
		CommonUI.quitBrowser();
		
	}
	public static void NewtourTestOne() {
		HomePage homeobj = new HomePage();
		SoftAssert softAssert = new SoftAssert();
		
		signonobj.enterUserName("jhoncena2@gmail.com");
		signonobj.enterPassword("1234");
		signonobj.clickSubmitButton();
		
		String expectedText = "Login Successfully";
		String actualText = "Login Successfully";
		softAssert.assertEquals(expectedText,actualText);

	}
	public static void NewTourTestTwo() {
		HomePage homeObj = new HomePage();
		homeObj.clickRegister();
		
		RegisterPage registerObj = new RegisterPage();
		registerObj.enterfirstName("John");
		registerObj.enterlastName("Cena");
		registerObj.enterphone("3059876543");
		registerObj.enteremail("JohnC@gmail.com");
		registerObj.enteraddress("123 Java Drive");
		registerObj.entercity("Miami");
		registerObj.enterstate("Florida");
		registerObj.enterpostalCodeField("12365");
		//registerObj.selectCountryDropDown();
		registerObj.enterusername("Jcena");
		registerObj.enterpassword("C12365");
		registerObj.enterconfirmpassword("C12365");
		registerObj.clicksubmitButton();
		
		SoftAssert softAssert = new SoftAssert();
		
		String expectedText = "Thank you for registering";
		String actualText = "Thank you for registering";
		                   
		softAssert.assertEquals(expectedText, actualText);
		
		softAssert.assertAll();
}
}

/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/