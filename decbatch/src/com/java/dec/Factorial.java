package com.java.dec;

public class Factorial {
	
public int Fact(int num)
{
int result = 1;
for(int i = num; i>1;i--)
result = result * i;
return result;
}
public static void main(String[] args) {
	Factorial fact = new Factorial();
	int f = fact.Fact(6);
	System.out.println("the factorial of number is "+f);
}
	
	
	
	
	
	
	
	
}



