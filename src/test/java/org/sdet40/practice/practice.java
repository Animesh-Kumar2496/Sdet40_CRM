package org.sdet40.practice;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import CRM.generic.Excelutility;
import CRM.generic.FileUtility;
import CRM.generic.IConstantPath;
import CRM.generic.WebDriverUtility;

public class practice  {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		@SuppressWarnings("unused")
		WebDriverUtility web=new WebDriverUtility();
		FileUtility fu=new FileUtility();
		Excelutility excel=new Excelutility(); 
			fu.initializePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
			// TODO Auto-generated catch block

		@SuppressWarnings("unused")	 
		String browser=fu.getDataFromPropertyFile("browser");
		String url=fu.getDataFromPropertyFile("url");
		String user=fu.getDataFromPropertyFile("username");
		String pass=fu.getDataFromPropertyFile("password");
		WebDriver driver=web.OpenBrowserWithApplication(browser, (long) 10, url);
		driver.findElement(By.xpath("//a[@href='hms/admin']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user,Keys.TAB);
		driver.findElement(By.name("password")).sendKeys(pass,Keys.TAB);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[text()=' Doctors ']")).click();
		driver.findElement(By.xpath("//a[@href='add-doctor.php']")).click();
		@SuppressWarnings("unused")
		String uss=excel.getDataFromExcel(IConstantPath.EXCEL_PATH, "AdminModule", 2, 2);
		String add=excel.getDataFromExcel(IConstantPath.EXCEL_PATH, "AdminModule", 2, 3);
		String fees=excel.getDataFromExcel(IConstantPath.EXCEL_PATH, "AdminModule", 2, 4);
		String conno=excel.getDataFromExcel(IConstantPath.EXCEL_PATH, "AdminModule", 2, 5);
		String email=excel.getDataFromExcel(IConstantPath.EXCEL_PATH, "AdminModule", 2, 6);
		String pas=excel.getDataFromExcel(IConstantPath.EXCEL_PATH, "AdminModule", 2, 7);
		String cpass=excel.getDataFromExcel(IConstantPath.EXCEL_PATH, "AdminModule", 2, 8);
		WebElement SelectDoctorSpec = driver.findElement(By.name("Doctorspecialization"));
		Select s=new Select(SelectDoctorSpec);
		s.selectByValue("General Physician");
	
		List<Map<String, String>> list=excel.getDataFromExcelInList1("AdminModule");
		System.out.println(list);
		

		driver.findElement(By.xpath("//input[@name='docname']"));
		driver.findElement(By.name("clinicaddress")).sendKeys(add,Keys.TAB);
		driver.findElement(By.name("docfees")).sendKeys(fees,Keys.TAB);
		driver.findElement(By.name("doccontact")).sendKeys(conno,Keys.TAB);
		driver.findElement(By.name("docemail")).sendKeys(email,Keys.TAB);
		driver.findElement(By.name("npass")).sendKeys(pas,Keys.TAB);
		driver.findElement(By.name("cfpass")).sendKeys(cpass,Keys.TAB);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//li[@class='dropdown current-user open']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		driver.findElement(By.xpath("//a[@href='hms/doctor/']")).click();
		driver.findElement(By.xpath("//span[text()=' Patients ']")).click();
		driver.findElement(By.xpath("//span[text()=' Appointment History ']")).click();
		
		
		




	}
}
