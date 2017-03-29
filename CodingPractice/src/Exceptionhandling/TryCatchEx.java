package Exceptionhandling;

import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= scan.nextInt();

try{
	System.out.println(10/n);
	System.out.println("ratan".charAt(20));
}
catch(ArithmeticException ae){
	System.out.println(10/2);
	}
	catch(StringIndexOutOfBoundsException se){
		System.out.println("ratansoft");
	}
finally{
	System.out.println("rest of the code");
}
}
}
