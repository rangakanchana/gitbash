package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	public String BROWSER;
	public String URL;
	
	public  void readProperties(){
		
		Properties prop = new Properties();
		
		FileReader reader;
		try {
			reader = new FileReader(new File("config.properties"));
			prop.load(reader);
			
			BROWSER = prop.getProperty("browser");
			URL = prop.getProperty("url");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	

}
