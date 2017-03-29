package com.main.ExcelConfigLib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigExcelData1 {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ConfigExcelData1(String excelpath){
		
		try {
			FileInputStream fis = new FileInputStream(new File(excelpath));
			
			 wb = new XSSFWorkbook(fis);
			
	        } catch (Exception e) {
			e.printStackTrace();
		}
        }
	
	public String getData(String sheetname,int row,int column){
		
		sheet = wb.getSheet(sheetname);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public int rowCount(int Sheetindex){
		
		int rows=wb.getSheetAt(Sheetindex).getLastRowNum();
		
		rows=rows+1;
		
		return rows;
	}
	
	
	
	

}
