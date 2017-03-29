package com.test.java;

public class Box {
	double width = 10;
	double height = 10;
	double depth = 5;
	
	/*Box(){
		width = 10;
		height = 10;
		depth = 5;
		System.out.println("Constructing Box");
	}*/
	
double volume(){
	
	
	return   width*height*depth;
}
public static void main(String[] args) {
	
	Box b1 = new Box();
	double vol=b1.volume();
	System.out.println("the volume of first box b1 is "+vol);
	Box b2 = new Box();
	double vol2 = b2.volume();
	System.out.println("the volume of second box is "+vol2);
	
	
}
}



