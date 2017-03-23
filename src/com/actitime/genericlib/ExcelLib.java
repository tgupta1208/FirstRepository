package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {	
	String filePath ="F:\\BhanuSirNotes\\ActTimeFrameWork\\testData\\Test_Data.xlsx";
		
	public String getExcelRowData(String sheetName, int rowNum , int colNum) throws InvalidFormatException, IOException{		
		  FileInputStream fis = new FileInputStream(filePath);
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetName);
		  Row row = sh.getRow(rowNum);
		  String data = row.getCell(colNum).getStringCellValue();
		  
		  return data;
	}
	
	public int getRowCount(String sheetName) throws InvalidFormatException, IOException{
		  FileInputStream fis = new FileInputStream(filePath);
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetName);
		  int rowCount = sh.getLastRowNum()+1;
		  return rowCount;
	}
	
	public void setExcelData(String sheetName, int rowNum , int colNum , String data) throws InvalidFormatException, IOException{
		
		  FileInputStream fis = new FileInputStream(filePath);
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetName);
		  Row row = sh.getRow(rowNum);	
		Cell cel = row.createCell(colNum);
		cel.setCellType(cel.CELL_TYPE_STRING);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		
	}
}
