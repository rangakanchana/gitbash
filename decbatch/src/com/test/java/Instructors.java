package com.test.java;

public class Instructors extends Employee{
	int bonus = 1000;
public static void main(String[] args) {
	Instructors i = new Instructors();
	
	int newsalary = i.salary + i.bonus;
	System.out.println("the salary is "+newsalary);
}
}
