package com.test.java;

public class Sum {

	public static void main(String[] args) {

	
int sum = 0;
double average = 0.0;
int minno = 1;
double maxno = 100;
for(int number = minno; number<=maxno;number++){
	sum = sum + number;
	 average = sum/maxno;
}
System.out.println("the sum of the given numbers by for loop ="+ sum);
System.out.println( "the average of the given numbers by for loop = "+average);
int number;
double average1 = 0.0;
number = 1;
int sum1= 0;
while(number <=maxno){
	sum1+=number;
	number++;
	average1 = sum1/maxno;
}
System.out.println("the sum of the given numbers by while loop is "+ sum1);
System.out.println("the average of the given numbers by while loop is "+ average1);

}
}
	
