package com.main;

public class MyCard extends CreditCard {
	public MyCard(){
		 		// cardtype won't work as cardtype is private so not access outside the class
		 		//cardtype = "Mastercard";
		 		
		 		//cardno can be accessed within the package and subclass as it is protected.
		 	   cardno = 468;
		 	    
		    } 

}
