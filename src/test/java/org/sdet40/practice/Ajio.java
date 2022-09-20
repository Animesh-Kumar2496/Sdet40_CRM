package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/Book2.xlsx");
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet sheet=wb.getSheet("Ajio");
		 String Productname=sheet.getRow(1).getCell(0).getStringCellValue();
		 
		 
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions cr= new ChromeOptions();
		cr.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(cr); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//a[@title='KIDS']")).click();
		driver.findElement(By.xpath("//a[@href='/s/0-to-2-years-3767-54091']")).click();
		driver.findElement(By.xpath("//div[text()='"+Productname+"']")).click();
		String productprice = driver.findElement(By.xpath("//div[text()='"+Productname+"']/following-sibling::div/span[@class='price  ']")).getText();
		System.out.println(productprice);
		sheet.getRow(1).createCell(1).setCellValue(productprice);
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Book2.xlsx");
	wb.write(fos);
	
	

	}

}
