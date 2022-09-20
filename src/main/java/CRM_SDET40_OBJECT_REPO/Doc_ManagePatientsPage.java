package CRM_SDET40_OBJECT_REPO;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class Doc_ManagePatientsPage {
	public Doc_ManagePatientsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	// @FindBy (xpath = "//span[.=' Search ']")
	// private WebElement searchFeature;
	@FindBy(name ="searchdata" )
	private WebElement searchTxt;
	@FindBy (id = "submit")
	private WebElement submitBtn;
	@FindBy(xpath = "//td[.='Jackson']")
	private WebElement expectedPat;
	@FindBy (xpath = "//td[.='harish']")
	private WebElement expectedPat2;
	//business library
	public void searchPattxt(String search) {
	searchTxt.sendKeys(search);
	}
	public void submitButton() {
	submitBtn.click();
	}
	public String patExpected() {
	return expectedPat.getText();
	}
	public String patExpected2() {
	return expectedPat2.getText();
	}
	}

