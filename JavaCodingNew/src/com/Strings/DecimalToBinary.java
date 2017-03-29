package com.Strings;

public class DecimalToBinary {
	
	public static void deciToBin(int decimalValue){
		//for printing purpose, copying decimalvalue to copydecimalvalue;
		int copyDecimalValue = decimalValue;
		
		String binary = "";
		int remainder = 0;
		while(decimalValue>0){
			
			remainder = decimalValue%2;     //if decimalValue=50; rem = 0;
			binary = binary+remainder;        //bin = 0+""=0;
			decimalValue = decimalValue/2;     //decimalValue=25;
		}
		
		System.out.println("binary value of "+copyDecimalValue+" is "+binary);
		
	}
	public static void main(String[] args) {
		DecimalToBinary.deciToBin(50);
		
	}

}
