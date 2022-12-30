package Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Tc "+result.getName()+" is Succeced",true);
		
	}

	
	public void onTestFailure(ITestResult result) {
		Reporter.log("Tc "+result.getName()+" is Failed",true);
		
		try {
			Utilities.Screenshot(result.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	  Reporter.log("Tc "+result.getName()+" is passed");
	}
}
