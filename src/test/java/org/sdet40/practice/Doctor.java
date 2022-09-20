package org.sdet40.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import CRM.generic.Excelutility;
import CRM.generic.FileUtility;
import CRM.generic.IConstantPath;
import CRM.generic.WebDriverUtility;

public class Doctor {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileUtility fu=new FileUtility();
		Excelutility ex=new Excelutility();
		WebDriverUtility we=new WebDriverUtility();
		
		fu.initializePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
		String user=fu.getDataFromPropertyFile("us_doc");
		String pass=fu.getDataFromPropertyFile("pass_doc");
		String url=fu.getDataFromPropertyFile("url");
		String browser=fu.getDataFromPropertyFile("browser");
		String user1=fu.getDataFromPropertyFile("username");
		String pass1=fu.getDataFromPropertyFile("password");
		
		
		WebDriver driver=we.OpenBrowserWithApplication(browser, (long) 10, url);
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		driver.findElement(By.name("username")).sendKeys(user,Keys.TAB);
		driver.findElement(By.name("password")).sendKeys(pass,Keys.TAB);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()=' Patients ']")).click();
		driver.findElement(By.xpath("//a[@href='add-patient.php']")).click();
		 String pname = ex.getDataFromExcel(IConstantPath.EXCEL_PATH, "DoctorModule", 2, 2);
		 String pcon=ex.getDataFromExcel(IConstantPath.EXCEL_PATH, "DoctorModule", 2, 3);
		 String pemail=ex.getDataFromExcel(IConstantPath.EXCEL_PATH, "DoctorModule", 2, 4);
		 String padd=ex.getDataFromExcel(IConstantPath.EXCEL_PATH, "DoctorModule", 2, 5);
		 String page=ex.getDataFromExcel(IConstantPath.EXCEL_PATH, "DoctorModule", 2, 6);
		String mhis= ex.getDataFromExcel(IConstantPath.EXCEL_PATH, "DoctorModule", 2, 7);
		
		driver.findElement(By.xpath("//input[@name='patname']")).sendKeys(pname,Keys.TAB);
		driver.findElement(By.xpath("//input[@name='patcontact']")).sendKeys(pcon,Keys.TAB);
		driver.findElement(By.xpath("//input[@name='patemail']")).sendKeys(pemail,Keys.TAB);
		driver.findElement(By.xpath("//label[@for='rg-male']")).click();
		driver.findElement(By.xpath("//textarea[@name='pataddress']")).sendKeys(padd,Keys.TAB);
		driver.findElement(By.xpath("//input[@name='patage']")).sendKeys(page,Keys.TAB);
		driver.findElement(By.xpath("//textarea[@name='medhis']")).sendKeys(mhis,Keys.TAB);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//i[@class='ti-angle-down']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user1,Keys.TAB);
		driver.findElement(By.name("password")).sendKeys(pass1,Keys.TAB);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[text()=' Patients ']")).click();
		driver.findElement(By.xpath("//span[text()=' Appointment History ']")).click();


	}

}
