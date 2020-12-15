package com.SeleniumTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("C://seleniumpratcie//data1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");//provding sheetname//roows are present in sheet
	int rowcount=sheet.getLastRowNum();//returnrowcount
	int colcount=sheet.getRow(0).getLastCellNum();//retrn coloum/cell count
	
	for(int i=0;i<rowcount;i++) {
		XSSFRow currentrow=sheet.getRow(i);//focuused on the current row
		for(int j=0;j<colcount;j++) {
			String value=currentrow.getCell(j).toString();
			System.out.print("  "+value);
		}
		System.out.println();
		
	}
	
	
	
	
	}

}
