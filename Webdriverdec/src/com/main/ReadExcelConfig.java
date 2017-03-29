package com.main;

import com.main.ExcelConfigLib.ConfigExcelData;

public class ReadExcelConfig {

	public static void main(String[] args) {

   ConfigExcelData data = new ConfigExcelData("C:\\Users\\sridhar\\Exceldata\\testdata.xlsx");
 
   String data0 = data.getData("Sheet2", 0, 0);
   System.out.println("Username :"+data0);
   
    String data1 = data.getData("Sheet2", 0, 1);
   System.out.println("Password :"+data1);

		
}

}
