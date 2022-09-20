package CRM_SDET40_OBJECT_REPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AdminDashboardPage {
public AdminDashboardPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//span[.=' Patient Search ']")
private WebElement patSearchInAdmin;
@FindBy(id="searchdata")
private WebElement patSearchTxt;
@FindBy(id="submit")
private WebElement submitBtn;
@FindBy (xpath = "/span[.=' Doctors ']")
private WebElement doctorFeature;
@FindBy (xpath = "//span[.=' Add Doctor']")
private WebElement addDocFeaturee;
@FindBy (xpath="//a[@href='manage-doctors.php']")
private WebElement manageDocFea;
//business library
public void patSearch() {
patSearchInAdmin.click();
}
public void patSrch() {
patSearchTxt.sendKeys("Harish");
}
public void clickOnSubmit() {
submitBtn.click();
}
public void docFeature() {
doctorFeature.click();
}
public void addDocFeature() {
addDocFeaturee.click();
}
public void manageDocFeature() {
manageDocFea.click();
}
}
