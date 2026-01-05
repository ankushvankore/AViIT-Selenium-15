package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class D03ReadFromExcel {

	public static void main(String[] args) throws IOException {
		D03ReadFromExcel d1 = new D03ReadFromExcel();
		d1.getData();
	}

	/*
	 * For reading data from Excel add 2 dependencies
	 * 1. Apache POI
	 * 2. Apache POI OOXML
	 */
	
	@DataProvider
	public String[][] getData() throws IOException {
		String fPath = "C:\\Users\\Dell\\Desktop\\OHRMLoginData.xlsx";
		File file = new File(fPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][]data = new String[rows][cells];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cells; j++) {
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		wb.close();
		
		return data;
	}
}
