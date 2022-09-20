package CRM_SDET40_OBJECT_REPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']") private WebElement userNameTextFiled;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordTextFiled;
	@FindBy(xpath="//button[@name='submit']") private WebElement submitButton;
	
	
	

   public void LoginAction(String username,String password) {
	   userNameTextFiled.sendKeys(username);
	   passwordTextFiled.sendKeys(password);
	   submitButton.click();
   }



}




