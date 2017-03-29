package Strings;

import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {

Scanner s = new Scanner(System.in);
System.out.println("Enter the string: ");
String s1 = s.nextLine();
String rev = "";
s.close();

for(int i = s1.length()-1;i>=0;i--){
	rev = rev+s1.charAt(i);
}
if(s1.equals(rev)){
	System.out.println("the given string is palindrome");
	}else {
		System.out.println("the given string is not a palindrome");
	}
	}
}
