package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./src/test/resources/Book2.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		  Sheet sheet =wb.getSheet("commondata");
		  
		 /* Row row=sheet.createRow(2);*/
		   Row row=sheet.getRow(18);
		          Cell cell=row.createCell(14);
		          cell.setCellValue(false);
		          FileOutputStream fos= new FileOutputStream("./src/test/resources/Book2.xlsx");
		          wb.write(fos);
		          System.out.println("Successfully updated");
		          wb.close();
	}
		          
		          
		          
		          
		          
		          

	}

