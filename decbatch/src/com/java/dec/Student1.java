package com.java.dec;

public class Student1 {
	int rno;
	int sum( int a, int b){
		int sum = a + b;
		return sum;
		}
	double subtract(int a, int b){
		double subtract = a - b;
		return subtract;
	}
	public static void main(String[] args) {
		Student1 sreeram = new Student1();
		sreeram.rno = 1;
		int s = sreeram.sum(100, 50);
		System.out.println("the sum of the numbers is "+ s);
	double d = sreeram.subtract(50, 20);
	System.out.println("the subtract of the numbers is "+d);
	Student1 sreeraj = new Student1();
	sreeraj.rno = 2;
	int sr = sreeraj.sum(10,20);
	double dr = sreeraj.subtract(10, 20);
	System.out.println("the sum of the numbers is "+ sr);
	System.out.println("the subtract of the numbers is "+dr);
	}
	}
