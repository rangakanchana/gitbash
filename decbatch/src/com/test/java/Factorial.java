package com.test.java;

public class Factorial {
	int fact(int num){
		int result=1;
		
		for(int i=num;i>1;i--){
			result = result * i;
		}
		return result;
	}
		public static void main(String[] args) {
			Factorial f = new Factorial();
			int a = f.fact(5);
			System.out.println("the factorial of given number is "+a);
			
		}
	}
	



