

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import CRM.generic.BaseClass;
import CRM.generic.IConstantPath;
public class PatientSearchTest extends BaseClass {
	@Test
	public void patientSrchTest() throws IOException, InterruptedException {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		// String docUsername = fileUtil.getPropertyKeyValue("doctorusername");
		// String docPassword = fileUtil.getPropertyKeyValue("doctorpassword");
		String patientName = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 0);
		String patientContact = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 1);
		String patientEmail = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 2);
		String patientAddress = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 3);
		String patientAge = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 4);
		String patientMedicalHistory = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 5);
		String patientSearch = excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "PatientSearch", 1, 6);
		//	loginPage.();
		//	loginPage.docLoginActivity(userName, password);
		String expectedResult = "Jackson";
		docDashboard.patFeature();
		docDashboard.patientAdd();
		addPatientPage.addPatientActivity(patientName, patientContact, patientEmail, patientAddress, patientAge,
				patientSearch, patientMedicalHistory);
		addPatientPage.clickButton();
		docDashboard.searchPatFeature();
		managePatient.searchPattxt(patientSearch);
		managePatient.submitButton();
		String actualResult = managePatient.patExpected();
		 if (expectedResult.equalsIgnoreCase(actualResult)) {
		 System.out.println("Test case is passed");
		 } else
		 {
		 System.out.println("Test case is Failed");
		 }
		//Assert.assertEquals(actualResult, expectedResult);
	}
}

