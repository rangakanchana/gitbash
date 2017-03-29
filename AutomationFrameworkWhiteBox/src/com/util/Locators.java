package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Locators {
	
public static HashMap<String,String> loc = new HashMap<>();
 
 public static void getElements(){
  //we have to read the properties from locators
 Properties prop = new Properties();
 try {
	FileReader reader = new FileReader("locators.properties");
	prop.load(reader);
	Enumeration elements= prop.propertyNames();
	 while(elements.hasMoreElements()){
		String key = (String)elements.nextElement();
		loc.put(key, prop.getProperty(key));
} 
 }
	 catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
 
 }
 
 
}
