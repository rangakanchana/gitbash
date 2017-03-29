package com.main;

public class CreditCard {
	public String cardname;
	 
	 	private String cardtype;
	 	
	 	protected int cardno;
	 	
	 	int limit;
	 	
	 	public CreditCard() {
	 	   cardname = "VISA";
	 	   
	 	   cardtype = "debit";
	 	   
	 	   cardno = 468;
	 	   
	 	   limit = 5000;
	 	   
	 	 }
	 	public static void main(String[] args) {
	 		CreditCard cr = new CreditCard();
	 		
	 		// will work only within class as it is private
	 		System.out.println(cr.cardtype);
	 	}

}
