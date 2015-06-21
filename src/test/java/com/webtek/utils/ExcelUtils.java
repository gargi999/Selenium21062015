package com.webtek.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtils {
	private static ExcelUtils excelutils=new ExcelUtils();
	
	public static ExcelUtils getInstance(){
		return excelutils;
	}

	public static Object[][] readData(String workbook,int sheet) throws IOException{
		Object[][] data=new Object[0][0];
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(new FileInputStream(new File(workbook)));
		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(sheet);
		
		Row header_row=hssfSheet.getRow(0);
		int maxrownum=hssfSheet.getLastRowNum();
		int maxcellnum=header_row.getLastCellNum();
		
		data=new Object[maxrownum][maxcellnum];
		
		StringBuffer dataStringBuffer = new StringBuffer("WorkBook Data\n");
		for(int row=1;row<=maxrownum;row++)
		{
			for(int cell=0;cell<maxcellnum;cell++)
			{
				Object cellValue=hssfSheet.getRow(row).getCell(cell).toString();
				data[row-1][cell]=cellValue;
				System.out.println("The data are : Row :" + (row - 1)+ "   Col: " + cell + "   : " + cellValue);
			}
		}
		return data;
		
		
	}
	
}
