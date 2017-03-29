package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;

public class ConfigUtils {
	private Log logger = null;
	
	Properties prop;
	public final String BROWSER;
	public final String URL;
	
	
	public ConfigUtils(String filename){
		
		prop = new Properties();
    try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//resources//"+filename);
		prop.load(fis);
		
		
	} catch (FileNotFoundException e) {
		logger.error("file not found:::please give correct file details");
    } catch (IOException e) {
		logger.error("Issue reading the config properties file");	
    }
	BROWSER = prop.getProperty("browser");
	URL = prop.getProperty("url");
	}

}
