package Exceptionhandling;

import java.util.Scanner;

//userdefined checked exception by parameterised constructor
//super() class means Exception class.

public class ThrowCheckedEx1 {
	void status(int age) throws InvalidAgeException1{
		if(age>20){
			System.out.println("eligible for marraige");
		}else{
			throw new InvalidAgeException1("not eligible /by zero");
			
		}
	}

	public static void main(String[] args) throws InvalidAgeException1 {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur age: ");
		int age = s.nextInt();
		new ThrowCheckedEx1().status(age);
s.close();
	}

}
