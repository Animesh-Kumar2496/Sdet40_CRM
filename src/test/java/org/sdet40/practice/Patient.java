package org.sdet40.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CRM.generic.BaseClass;
import CRM.generic.FileUtility;
import CRM.generic.IConstantPath;
import CRM.generic.WebDriverUtility;

public class Patient extends BaseClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverUtility wd = new WebDriverUtility();
		FileUtility ful = new FileUtility();
		ful.initializePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
		String url = ful.getDataFromPropertyFile("url");
		String browser = ful.getDataFromPropertyFile("browser");
		String use = ful.getDataFromPropertyFile("pat_us");
		String pass = ful.getDataFromPropertyFile("pat_pass");

		WebDriver driver = wd.OpenBrowserWithApplication(browser, (long) 10, url);
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		driver.findElement(By.name("username")).sendKeys(use, Keys.TAB);
		driver.findElement(By.name("password")).sendKeys(pass, Keys.TAB);
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//span[text()=' Book Appointment ']")).click();
		WebElement s1 = driver.findElement(By.xpath("//select[@name='Doctorspecialization']"));

		Select s2 = new Select(s1);
		s2.selectByValue("Gynecologist/Obstetrician");
		driver.findElement(By.name("fees")).sendKeys("10000");
		driver.findElement(By.name("appdate")).click();
		driver.findElement(By.name("appdate")).sendKeys("2022-09-21");
		driver.findElement(By.name("apptime")).click();
		driver.findElement(By.xpath("//input[@class='bootstrap-timepicker-hour form-control']")).click();
		driver.findElement(By.xpath("//input[@class='bootstrap-timepicker-hour form-control']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@class='bootstrap-timepicker-minute form-control']")).click();
		driver.findElement(By.xpath("//input[@class='bootstrap-timepicker-minute form-control']")).sendKeys("30");
		driver.findElement(By.xpath("//input[@class='bootstrap-timepicker-meridian form-control']")).click();
		driver.findElement(By.xpath("//input[@class='bootstrap-timepicker-meridian form-control']")).sendKeys("AM");
		driver.findElement(By.name("submit")).click();

	}
}
