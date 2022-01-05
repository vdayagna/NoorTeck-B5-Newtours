package com.noorteck.qa.utils;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SingOnPage;

public class ObjInitialize extends Constants {
	
	 
	
	public static void initializeClassObj() {
		//initialize each page class objects here..
		
		    homeobj = new HomePage();
		  registerPageobj = new RegisterPage();
		   flightspageobj = new FlightsPage();
			signonobj = new SingOnPage();
			
			
		}
		
	}