package org.sdet40.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CRM.generic.WebDriverUtility;

public class MvnPractice {
	@Test(groups="Sanity")
	public void step1Test() {
		String browsers=System.getProperty("b");
		String url=System.getProperty("u");
		
		System.out.println("Browser name is ======= "+browsers);
		System.out.println("Url is ======   "+url);
		WebDriverUtility webd=new WebDriverUtility();
		webd.OpenBrowserWithApplication(browsers, 10l, url);
		
	}
	
	

}
