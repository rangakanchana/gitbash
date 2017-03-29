package com.java.dec;

public class Student {
int id;
int salary;
double comm;
void sum(){
	int num1 = 10;
	int num2 = 20;
	int sum = num1 + num2;
	System.out.println("the sum of the numbers is "+ sum);
}

int subtract(int a , int b)
{
	int sub = a - b;
	return sub;
}
double CalSal1(){
	double grosssal = salary  + comm;
	return grosssal;	
}
double CalSal(int salary,double comm){
	
double grosssal = salary  + comm;
return grosssal;
}


public static void main(String[] args) {
	Student s = new Student();
	s.id = 100;
	s.salary = 1000;
	s.comm = 100.3;
	 s.sum();
	int x = s.subtract(30,20);
double a = s.CalSal1();

	System.out.println("the gross salary is " +a);
	System.out.println("the subtract is " +x);
	Student t = new Student();
	t.id = 101;
	t.sum();
	int y = t.subtract(40, 20);
	double e = t.CalSal(2000,200.8);
	System.out.println("the subtract is" + y);
	System.out.println("the gross salary is "+e);
}
}





