package CRM.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override //BM
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override //AM
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override //AM
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 
			try {
				new WebDriverUtility().screenShot(BaseClass.sdriver, BaseClass.sjavaUtility, result.getMethod().getMethodName());
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

	@Override //AM
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override //AT
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override //BT
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override //AT
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
