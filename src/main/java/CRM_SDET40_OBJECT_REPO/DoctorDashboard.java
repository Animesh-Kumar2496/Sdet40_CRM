package CRM_SDET40_OBJECT_REPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DoctorDashboard {
public DoctorDashboard(WebDriver driver) {
PageFactory.initElements(driver, this);
}
@FindBy (xpath = "//span[.=' Patients ']")
private WebElement patientFeature;
@FindBy(xpath = "//span[.=' Add Patient']")
private WebElement addPatient;
@FindBy (xpath = "//span[.=' Search ']")
private WebElement searchFeature;
@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
private WebElement updateFeaturee;
//business library
public void patientAdd() {
addPatient.click();
}
public void searchPatFeature() {
searchFeature.click();
}
public void patFeature() {
patientFeature.click();
}
public void docUpdateFea() {
updateFeaturee.click();
}
}

