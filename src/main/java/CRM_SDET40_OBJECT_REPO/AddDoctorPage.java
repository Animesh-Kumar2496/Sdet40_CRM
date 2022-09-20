package CRM_SDET40_OBJECT_REPO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AddDoctorPage {
@FindBy (name = "Doctorspecialization")
private WebElement docspecializ;
@FindBy (name="docname")
private WebElement docNameTxt;
@FindBy(name="clinicaddress")
private WebElement clinicAddTxt;
@FindBy(name="docfees")
private WebElement docFeesTxt;
@FindBy(name="doccontact")
private WebElement docContTxt;
@FindBy(id="docemail")
private WebElement docMailTxt;
@FindBy(name="npass")
private WebElement pwdTxt;
@FindBy(name="cfpass")
private WebElement cfrmPwdTxt;
@FindBy(id="submit")
private WebElement submitBtn;
//business library
public void addDoctor() {
docspecializ.click();
docNameTxt.sendKeys("docName");
clinicAddTxt.sendKeys("clinicAddress");
docContTxt.sendKeys("docContact");
//docMailTxt.sendKeys(JavaUtility.getRanDomNum(1000)+"docEmail");
docMailTxt.sendKeys("docMail");
pwdTxt.sendKeys("docpwdTxt");
cfrmPwdTxt.sendKeys("confirmpwd");
submitBtn.click();
}
}

