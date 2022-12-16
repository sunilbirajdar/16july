package Bb;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Utilitynew.common_;


public class Listener extends Base  implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		//String methodnsme = result.getTestName();
		Reporter.log("test C"+result.getTestName()+ " is faile ", true);
	try {common_.screenshot(driver,result.getTestName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	
	
	public void onTestSuccess(ITestResult result) {
		String methodnsme = result.getTestName();
		Reporter.log("test C"+methodnsme+ " is  completed successfully ", true);}
	
	public void onTestSkipped(ITestResult result) {
		//String methodnsme = result.getTestName();
		Reporter.log("test C"+result.getTestName()+ " is  completed successfully ", true);	

	}
}
