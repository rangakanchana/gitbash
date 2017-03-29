package com.main.ExcelConfigLib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigExcelData {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	
	public ConfigExcelData(String excelpath){  //whenever construcotr calls the excel also loads
	
		try {
			FileInputStream fis = new FileInputStream(new File(excelpath));
			 wb = new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	
	public String getData(String Sheetname,int row,int columnno){
		
		sheet = wb.getSheet(Sheetname);
		String data = sheet.getRow(row).getCell(columnno).getStringCellValue();
		return data;

		}
	    }
