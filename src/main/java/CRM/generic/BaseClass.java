package CRM.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import CRM_SDET40_OBJECT_REPO.AddDoctorPage;
import CRM_SDET40_OBJECT_REPO.AddPatientPage_Doc;
import CRM_SDET40_OBJECT_REPO.AdminDashboardPage;
import CRM_SDET40_OBJECT_REPO.DocUpdateProfPage;
import CRM_SDET40_OBJECT_REPO.Doc_ManagePatientsPage;
import CRM_SDET40_OBJECT_REPO.DoctorDashboard;
import CRM_SDET40_OBJECT_REPO.LoginPage;

public class BaseClass {
	protected WebDriver driver;
	/* Object Creation for Lib */
	protected String userName;
	protected String password;
	protected String url;
	protected String browser;
	protected JavaUtility javaUtil;
	protected WebDriverUtility webdriverUtil;
	protected Excelutility excelUtil;
	protected FileUtility fileUtil;
	protected CommonPage commonPage;
	protected AddPatientPage_Doc addPatientPage;
	protected Doc_ManagePatientsPage managePatient;
	protected DoctorDashboard docDashboard;
	protected LoginPage loginPage;
	protected AdminDashboardPage adminDash;
	protected AddDoctorPage addDoc;
	
	protected DocUpdateProfPage docUpdatefee;
	public static WebDriver sdriver;
	public static JavaUtility sjavaUtility;
	@BeforeClass
	
	public void configBC() throws IOException {
		javaUtil = new JavaUtility();
		webdriverUtil = new WebDriverUtility();
		excelUtil = new Excelutility();
		fileUtil = new FileUtility();
		userName = fileUtil.getDataFromPropertyFile("doctorusername");
		password = fileUtil.getDataFromPropertyFile("doctorpassword");
		String url = fileUtil.getDataFromPropertyFile("url");
		String browser = fileUtil.getDataFromPropertyFile("browser");
		//launching the browser
		driver=webdriverUtil.OpenBrowserWithApplication(browser, (long) 10, url);
		addPatientPage = new AddPatientPage_Doc(driver);
		managePatient = new Doc_ManagePatientsPage(driver);
		docDashboard = new DoctorDashboard(driver);
		loginPage=new LoginPage(driver);
		adminDash=new AdminDashboardPage(driver);
		addDoc=new AddDoctorPage();
		docUpdatefee=new DocUpdateProfPage();
		
		
	}
	@AfterClass
	public void configAC() {
		commonPage = new CommonPage(driver);
		commonPage.logoutActivity();
		System.out.println("=============Close the Browser=======");
		driver.quit();
	}
}		
	
	
	