package com.array;


public class StringExample {
public static void main(String[] args) {
	String s = "good morning";
	String s1 = s + "baby";
	StringBuffer buff = new StringBuffer("hello Laddu");
	System.out.println("before" + buff.hashCode());
	
	buff = buff.append("cutie");
	
	System.out.println(buff.hashCode());
	System.out.println(buff.capacity());
	System.out.println(buff.insert(1, "a"));
	System.out.println(buff.reverse());

	

	
	System.out.println(s.charAt(2));
	System.out.println(s.length());
	System.out.println(s.trim());
    System.out.println(s.concat(" " +"kanchana"));
	System.out.println(s.compareTo("good morning"));
	
System.out.println(s.compareToIgnoreCase("GOOD MORNING"));
System.out.println("before" + s.hashCode());
System.out.println(s1);
System.out.println("after "+ s1.hashCode());
System.out.println(s.lastIndexOf(s));
System.out.println(s.replace("morning", "evening"));
System.out.println(s.substring(1, 4));
System.out.println(s.toUpperCase());
System.out.println(s.toCharArray());


    
	
	
	
	
	
	
	

	

	

	
	
	
	
}	

	
}
