package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JxlExcel {

	public static void main(String[] args) throws BiffException, IOException {
		
		
		FileInputStream file=new FileInputStream("D:\\Guru\\input.xls");
		Workbook w=Workbook.getWorkbook(file);
		Sheet s=w.getSheet(0);
		System.out.println(s.getName());
		
		int rows=s.getRows();
		System.out.println("Total rows="+rows);
		
		String user=s.getCell(0, 0).getContents();
    	String  pwd=s.getCell(1, 0).getContents();
		
    	System.out.println(user +" "+ pwd);
    	
    	for(int i=0;i<rows;i++)
    	{
    		String data=s.getCell(0, i).getContents();
    		String data1=s.getCell(1, i).getContents();
    		
    		System.out.println(data  +"  "+data1);
    	}
		
    	
		
	}
}
