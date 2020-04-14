package org.utils;

import java.io.IOException;

import org.PSM.SuperClass;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel   {

  public String[][] readExcel(String data) throws IOException {  
	  
	  XSSFWorkbook book = new XSSFWorkbook("./Data/"+data+".xlsx");
	  XSSFSheet sheet = book.getSheetAt(0);
	  
	  int lastRowNum = sheet.getLastRowNum();
	  System.out.println("row_count = "+lastRowNum);
	  
	  short lastCellNum = sheet.getRow(0).getLastCellNum();
	  System.out.println("column_count  = "+lastCellNum);
	  
	  String[][] data1  = new String[lastRowNum][lastCellNum];	  
	  for (int i = 1; i <= lastRowNum; i++) {
		  for (int j = 0; j < lastCellNum; j++) {
			  String value = sheet.getRow(i).getCell(j).getStringCellValue();
			  System.out.println(value);
			  data1[i-1][j] = value;
			
		}
		  
		
	}
	  return data1;
	  
  }
}
