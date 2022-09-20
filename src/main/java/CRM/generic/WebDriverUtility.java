package CRM.generic;

import java.io.File;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	public WebDriver launchBrowser(String browser) {
		WebDriver driver = null;
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("invalid broswer name");
			break;
		}

		return driver;
	}

	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	@SuppressWarnings("deprecation")
	public void waitPageTillGetLoad(WebDriver driver, Long longtimeout) {
		driver.manage().timeouts().implicitlyWait(longtimeout, TimeUnit.SECONDS);
	}

	public void navigateapplication(WebDriver driver, String url) {
		driver.get(url);
	}

	public WebDriver OpenBrowserWithApplication(String broswer, Long longtimeout, String url) {
		WebDriver driver = launchBrowser(broswer);
		maximizeBrowser(driver);
		waitPageTillGetLoad(driver, longtimeout);
		navigateapplication(driver, url);
		return driver;
	}

	public void mouseHoverAction(WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}

	public void doubleClick(WebDriver driver, WebElement element) {
		new Actions(driver).doubleClick().perform();
	}

	public void closeBroswer(WebDriver driver) {
		driver.quit();
	}

	public void waitTillElement(WebDriver driver, long longTime, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(longTime));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchWindow(WebDriver driver) {
		Set<String> windowsId = driver.getWindowHandles();
		for (String string : windowsId) {
			driver.switchTo().window(string);
			if (string.contains("Accounts"))
				break;
		}

	}
	private JavascriptExecutor jsExecutor;
public void jsInitialization(WebDriver driver) {
	jsExecutor=(JavascriptExecutor) driver;

}

public void openApplicationusingJS(String url) {
	jsExecutor.executeScript("window.location=arguments[0]",url);
	
}
public void sendKeysUsingJs(WebElement element,String data) {
	jsExecutor.executeScript("arguments[0].value=arguments[1]", element,data);
}
public void clickUsingJS(WebElement element) {
	jsExecutor.executeScript("arguments[0].click()", element);
	
}
public void scrollTillElementJS(WebElement element) {
	jsExecutor.executeScript("arguments[0].scrollIntoView()", element);
}
public void screenShot (WebDriver driver,JavaUtility  javaUtility,String className) throws Throwable {
	String currentTime=javaUtility.currentTime();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst= new  File("/screenshot/"+className+"_"+currentTime+".png");
	FileUtils.copyFile(src, dst);
	
	
	
	
}
	
}








//webDriver driver = open
