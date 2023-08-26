package com.datadriven.framework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven1 {

	public static void main(String[] args) throws Exception {

		Workbook wrkBook = new XSSFWorkbook(
				"C:\\Users\\Barani seenu\\eclipse-workspace\\Ganishka\\FrameworkClass\\Credentials23.xlsx");
		Sheet sheetAt = wrkBook.getSheetAt(0);

		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();

		int physicalNumberOfCells = sheetAt.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
	}
}
