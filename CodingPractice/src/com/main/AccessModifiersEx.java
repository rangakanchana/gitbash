package com.main;

public class AccessModifiersEx {

		public static void main(String[] args) {
			 		CreditCard cr = new CreditCard();
			 
			
			 	// will work anywhere as it is public
			 		System.out.println(cr.cardname);
			 		
			 		// won't work as cardtype is private.
			 		//System.out.println(cr.cardtype);
			 		
			 		// will work as it is protected and can be access within package.
			 		System.out.println(cr.cardno);
			 	
				// will work as it is default and can be access within package.
			 		System.out.println(cr.limit);
			 }
	}


