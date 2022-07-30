package com.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData 
{
	XSSFWorkbook workBook;
	
	public ExcelData()
	{
		File file = new File("./testdata/Tide test(Automation).xlsx");
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			workBook = new XSSFWorkbook(fis);
			
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to Read Excel Data");
			
		}
	}
	
	public String getstringdata(int sheetIndex, int row, int columm) {
		return workBook.getSheetAt(sheetIndex).getRow(row).getCell(columm).getStringCellValue();
	}
	
	public String getstringdata(String SheetName, int row, int columm) {
		return workBook.getSheet(SheetName).getRow(row).getCell(columm).getStringCellValue();
	}
	
	public double getNumericdata(int sheetIndex, int row, int columm) {
		return workBook.getSheetAt(sheetIndex).getRow(row).getCell(columm).getNumericCellValue();
	}

	public double getNumericdata(String sheetname, int row, int columm) {
		return workBook.getSheet(sheetname).getRow(row).getCell(columm).getNumericCellValue();
	}
	
}
