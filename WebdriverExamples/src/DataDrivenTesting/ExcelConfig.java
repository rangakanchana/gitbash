package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
 //create constructor and provide the excelpath
	
	public ExcelConfig(String excelpath){
		
		try {
			FileInputStream fis = new FileInputStream(new File(excelpath));
			
			 wb = new XSSFWorkbook(fis);
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getData(int sheetnumber,int row,int column){
		
		 sheet = wb.getSheetAt(sheetnumber);
		 
		 String data = sheet.getRow(row).getCell(column).getStringCellValue();
		 
		 return data;
		 
		 }
	
	public int rowCount(int sheetindex){
		
		int rowcount = wb.getSheetAt(sheetindex).getLastRowNum();
		
		rowcount = rowcount+1;          //4
		
		return rowcount;
		
	}

	}


