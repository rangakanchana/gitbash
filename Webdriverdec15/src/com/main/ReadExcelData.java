package com.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExcelData {
	
	public void tc() throws Exception{
		
	WebDriver driver = new FirefoxDriver();
 driver.get("https://www.rightstart.com/customer/account/login");
 ArrayList<String> username = readExData(0);
 ArrayList<String> password = readExData(1);
 
 for(int i =0;i<username.size();i++){
	// driver.findElement(By.id("email" )).sendKeys(username);
	// driver.findElement(By.id("pass")).sendKeys(password);
	 driver.findElement(By.id("send2" )).click();
	 driver.findElement(By.linkText("Sign Out")).click();
	 driver.findElement(By.linkText("Sign In")).click();
	 }
 
 
 
	
 
	
	
	

}
	public ArrayList<String> readExData(int colNo) throws IOException{
		
	FileInputStream fis = new FileInputStream("Desktop");	
    HSSFWorkbook wb = new HSSFWorkbook(fis);	
    HSSFSheet s = wb.getSheet("sheetdata");
    
    Iterator<Row> it = s.iterator();
    it.next();
    //create arraylist to store the data
    ArrayList<String> list = new ArrayList<String>();
    while(it.hasNext()){
    list.add(it.next().getCell(colNo).getStringCellValue());
    wb.close();
    }
    System.out.println("List::::"+list);
	return list;
    
	}
	public static void main(String[] args) throws IOException {
		ReadExcelData data = new ReadExcelData();
		data.readExData(0);
		data.readExData(1);
	}
}