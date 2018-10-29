package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIExcel {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("D:\\Guru\\input.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(file);
	XSSFSheet s=w.getSheetAt(0);
	
	int rows=s.getLastRowNum() - s.getFirstRowNum() +1;
	System.out.println("Total rows="+rows);
	XSSFRow row=s.getRow(1);
	XSSFCell cell=row.getCell(0);
	XSSFCell cell1=row.getCell(1);
	System.out.println(cell +" "+ cell1);
	
	for(int i=0;i<rows;i++)
	{
		Row row1=s.getRow(i);
		for(int j=0;j<row1.getLastCellNum();j++)
		{
			System.out.println(row1.getCell(j).getStringCellValue());
		}
	}
	
}
}
