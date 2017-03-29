package Strings;

import java.util.Scanner;
//success
public class StringReverseEx {

	/*public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string: ");
 String original;
  original = sc.nextLine();
 String reverse="";
 sc.close();
 
 for(int i =original.length()-1;i>=0;i--){
	  reverse = reverse+original.charAt(i);
 }
	System.out.println("the reversed string is: "+reverse);	
}*/
	
	public static String revString(String s){
		String reverse=" ";
		
		for(int i = s.length()-1;i>=0;i--){
			reverse = reverse + s.charAt(i);
			
		}
		System.out.println("the reverse string is: "+reverse);
		
		
		return reverse;
	}
	public static void main(String[] args) {
		
		//StringReverseEx.revString("javalanguage");
		StringReverseEx.reverseString("selenium");
		
		
	}
	public static String reverseString(String original){
		
		String reverse="";
		
		char[] c = original.toCharArray();
		
		for(int i=c.length-1;i>=0;i--){
			reverse = reverse+c[i];
		}
		System.out.println("the reversed strng is: "+reverse.toString());

		
		return reverse;
	}

}
