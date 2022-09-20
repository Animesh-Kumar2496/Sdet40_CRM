package org.sdet40.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CRM.generic.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		driver.manage().window().maximize();
		
		webDriverUtility.jsInitialization(driver);
		webDriverUtility.openApplicationusingJS("http://localhost:8888");
        webDriverUtility.sendKeysUsingJs(driver.findElement(By.name("user_name")), "admin");
        webDriverUtility.sendKeysUsingJs(driver.findElement(By.name("user_password")), "admin");
        webDriverUtility.clickUsingJS(driver.findElement(By.id("submitButton")));
      //  webDriverUtility.scrollTillElementJS(driver.findElement(By.xpath("//b[contains(text();
		
		
	}

}
