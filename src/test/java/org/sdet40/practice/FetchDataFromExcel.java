package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/Book2.xlsx.");
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		try {
			Sheet sheet = wb.getSheet("Sheet3");
			/*
			 * Row row=sheet.getRow(1); Cell cell=row.getCell(1); String
			 * username=cell.getStringCellValue();
			 */
			Cell cell = sheet.getRow(0).getCell(0);
			String data = df.formatCellValue(cell);

			System.out.println(data);
		} finally {
			wb.close();
		}

	}

}
