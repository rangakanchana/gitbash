package com.test.java;

public class SumOddNumbers {

	public static void main(String[] args) {
int number;
int result=0;
int result1 = 0;
for(number = 1;number<=100;number++){
	if(number%2!=0){
		
		result+=number;
	}else{
		result1 = result1+number;
	}
}
System.out.println("the sum of the given odd number="+result);
System.out.println("the sum of the given even number ="+result1);
	}

}

