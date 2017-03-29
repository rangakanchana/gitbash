package com.util;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;

public class Locators {
	
	public static HashMap<String,String> locators;  //to store locators
	
	public static void readLocators(){
		
	Properties prop = new Properties();
		
	FileReader reader;
	
	locators = new HashMap<>();
	try {
	reader = new FileReader(new File("locators.properties"));
    prop.load(reader);
			
	for(Map.Entry<Object,Object> val: prop.entrySet()){
				
	String key = (String)val.getKey();
				String value =(String) val.getValue();
		    	locators.put(key, value);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static By get(String key)
	{
		    if(key.contains("_"))
		    {
			String[] val = key.split("_");
        
			if(val[0].equals("css"))
			{
				return By.cssSelector(locators.get(key));
			}
			else if(val[0].equals("xpath"))
			{
				return By.xpath(locators.get(key));
			}
			else if(val[0].equals("id"))
			{
				return By.id(locators.get(key));
			}
			else if(val[0].equals("name"))
			{
				return By.name(locators.get(key));
		    }
			else if(val[0].equals("class"))
			{
				return By.className(locators.get(key));
				
			}
			else if(val[0].equals("link"))
			{
				return By.linkText(locators.get(key));
			}
			else if(val[0].equals("plink"))
			{
				return By.partialLinkText(locators.get(key));
			}
			else if(val[0].equals("tag"))
			{
				return By.tagName(locators.get(key));
			}
		}
		return By.cssSelector(locators.get(key));
	}
	}
