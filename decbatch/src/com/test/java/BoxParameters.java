package com.test.java;

public class BoxParameters {
	double width;
	double height;
	double depth;
	BoxParameters(double w,double h,double d)
	{
		width = w;
	     depth = d;
		 height = h;
	}
	 double volume()
	{
		return width*depth*height;
		
		}
public static void main(String[] args) {
	BoxParameters b1 = new BoxParameters(10,5,20);
	BoxParameters b2 = new BoxParameters(5,6,10);
	double box1=b1.volume();
	System.out.println("the volume of first box is "+box1);
	double box2 = b2.volume();
	System.out.println("the volume of second box is "+box2);
	}	
}
