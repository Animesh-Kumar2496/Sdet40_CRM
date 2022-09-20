package org.sdet40.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Patienttodoctor {
	static WebDriver driver=null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
		driver.findElement(By.xpath("//a[@href='hms/user-login.php']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='book-appointment.php']")).click();
		WebElement we=driver.findElement(By.name("Doctorspecialization"));
		Select s=new Select(we);
		s.selectByIndex(4);
		
		WebElement wi=driver.findElement(By.id("doctor"));
		wi.click();
		Select s1=new Select(wi);
		s1.selectByVisibleText("Sarita Pandey");
		driver.findElement(By.xpath("//select[@name='fees']")).sendKeys("500");
		
}

}
