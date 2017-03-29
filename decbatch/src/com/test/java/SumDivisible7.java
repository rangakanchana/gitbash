package com.test.java;

public class SumDivisible7 {

	public static void main(String[] args) {
		int result = 0;
for(int number = 7;number <=100;number+=7)
{
	if(number%7 ==0){
		result+=number; 
	}
	}
System.out.println("the sum of the given numbers divisible by 7 =" +result);
}

}
