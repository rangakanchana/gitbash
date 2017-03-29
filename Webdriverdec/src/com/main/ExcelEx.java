package com.main;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelEx { 
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet1;
	
	public static void getRowCount(){
		File src = new File("C:\\Users\\sridhar\\Exceldata\\testdata.xlsx");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			sheet1 = wb.getSheet("Sheet1");  //using getSheet(sheet name)
			
			int rowCount= sheet1.getLastRowNum();
			rowCount = rowCount+1;
			System.out.println(rowCount);
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			File src = new File("C:\\Users\\sridhar\\Exceldata\\testdata.xlsx");
			FileInputStream fis = new FileInputStream(src);
			
			 wb = new XSSFWorkbook(fis);
			 sheet1 = wb.getSheetAt(0);  //using getSheetAt(index)
			String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println("data from excel: "+data0);
			String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
			System.out.println("data from excel: "+data1);

			wb.close();
            } catch (Exception e) {
			e.getMessage();
		   
		    }
		    ExcelEx.getRowCount();
		
		    }
	
}
