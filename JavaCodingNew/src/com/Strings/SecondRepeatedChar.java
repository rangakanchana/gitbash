package com.Strings;


       public class SecondRepeatedChar{
	     
		 public static void main(String[] args) {
			 
			
			 
		 String s = "kayak";
		 String z = "";
		 int count = 0, p = 0;
		 for (int i = 0; i < s.length(); i++) {
		 char c = s.charAt(i);
		 for (int j = 0; j < s.length(); j++) {
		 if (!z.contains("" + c) && s.charAt(i) == s.charAt(j) && i != j) {
		 count++;

		 }

		 }

		 z = z + c;
		 if (count >= 1) {
		 p++; // for checking the 2nd repeated character
		 if(p==2)
		 System.out.println("" + c);
		 
		 }
		 
		 count = 0;
		  }
		  }
		 
	}