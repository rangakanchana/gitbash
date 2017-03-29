package com.test.java;

public class StaticEx {
	int id;
	String name;
	 static String college = "Stanford";


	StaticEx(int i,String n){
		this();
		id = i;
		name = n;
		
	}
	StaticEx()
	{
		System.out.println("Hii All");
	}
	
	
	void display()
	{
		System.out.println(id+""+name+""+college+"");
	}
	static void change()
	{
		college = "Oxford";
	}
	public static void main(String[] args) {
		
		StaticEx g = new StaticEx(1,"geetha");
		
		StaticEx g1 = new StaticEx(2,"kanchana");
		
		StaticEx g2 = new StaticEx(3,"Saritha");
	/*	g.display();
		g1.display();
		g2.display();*/
		
		StaticEx.change();
		
		g.display();
		g1.display();
		g2.display();
		
		
				
		
	}

}
