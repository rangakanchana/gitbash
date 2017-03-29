package Exceptionhandling;

import java.util.Scanner;

/*THROW keyword is used to handover the user created exception object to JVM.
JVM handles the exception.*/

//1:userdefined checked exception by default constructor

public class ThrowEx {
	
	public static void status(int age) throws InvalidAgeException{
		if(age>20){
			System.out.println("eligible for marriage");
		}else{
			throw new InvalidAgeException();
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		Scanner s = new Scanner(System.in);
		System.out.println("enter ur age: ");
		int age = s.nextInt();
		 new ThrowEx();
		ThrowEx.status(age);
		s.close();
		}
	    }

