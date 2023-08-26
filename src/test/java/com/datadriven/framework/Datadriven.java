package com.datadriven.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	// will give file location
	public static File f = new File(
			"C:\\Users\\Barani seenu\\eclipse-workspace\\Ganishka\\FrameworkClass\\Credentials23.xlsx");
	
	public static void readData() throws Exception {

		// To read data from file
		// then from file we use to create object to read the data from file
		// to fetch the data we use to create object that is fileInput stream
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis); // will load the data using fis object

		Sheet sheetAt = wb.getSheetAt(0); 

		for (int row = 1; row < sheetAt.getPhysicalNumberOfRows(); row++) {

			Row r = sheetAt.getRow(row);

			for (int col = 0; col < r.getPhysicalNumberOfCells(); col++) {

				Cell cell = r.getCell(col);

				CellType cellType = cell.getCellType(); // check the cell type

				if (cellType.equals(CellType.STRING)) {
					System.out.println(cell.getStringCellValue());
				} else if (cellType.equals(CellType.NUMERIC)) {
					System.out.println(String.valueOf(cell.getNumericCellValue()));
				}
			}
		}
	}

	public static void writeData() throws Exception {

		FileOutputStream fos = new FileOutputStream(f);

		Workbook wb1 = new XSSFWorkbook();

		Sheet createSheet = wb1.createSheet();

		createSheet.createRow(0).createCell(0).setCellValue("Ganishka");
		createSheet.createRow(1).createCell(0).setCellValue("Pragadeesh");
		createSheet.createRow(2).createCell(0).setCellValue("Nandhini");
		createSheet.createRow(3).createCell(0).setCellValue("Vignesh");
		createSheet.createRow(4).createCell(0).setCellValue("Dhamo");

		wb1.write(fos);
		wb1.close();

		System.out.println("Mission completed");

	}

	public static void main(String[] args) throws Exception {

		readData();
		writeData();
	}

}
