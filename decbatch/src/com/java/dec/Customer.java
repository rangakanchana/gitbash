package com.java.dec;

public class Customer {
	int  accountno;
	double multiply(double a,double b){
		double multiply = a*b;
		return multiply;
	}
	double division(double a,double b){
		double division = a/b;
		return division;
	}
public static void main(String[] args) {
	Customer kanchana = new Customer();
	kanchana.accountno = 23456;
	double m = kanchana.multiply(2.5,3.5);
	double d = kanchana.division(2.5,.5);
	System.out.println("the multiplication of numbers is "+ m);
	System.out.println("the division of the numbers is "+ d);
	}
	}
