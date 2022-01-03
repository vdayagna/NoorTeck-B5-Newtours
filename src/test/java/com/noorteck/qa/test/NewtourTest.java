package com.noorteck.qa.test;

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
		NewtourTest testobj = new NewtourTest();
		HomePage homeobj = new HomePage();
		RegisterPage registerobj = new RegisterPage();
		FlightsPage flightsobj = new  FlightsPage();
		SingOnPage signonobj = new SingOnPage();
		
		commonUIobj.openBrowser("chrome"); //Open the browser
		commonUIobj.navigate(url); //navigate to URL
		
		testobj.NewtourTest();
		commonUIobj.quitBrowser();
		
	}
	public void NewtourTest() {
		signonobj.enterUserName("jhoncena2@gmail.com");
		signonobj.enterPassword("1234");
		signonobj.clickSubmitButton();
		
		String expectedConfirmText = "Welcome to Address Book";
		String actualTitle = "Welcome to Address Book";

		if( actualTitle.equals(expectedConfirmText)) {
			System.out.println("TITLE VERIFIED");
		} else {
			System.out.println("TITLE VERIFIED FAILED");
		}
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