package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import projectT.reports.ReportFile;

public class MyListeners implements ITestListener {
	public static ExtentTest report ;
     
	public void onTestStart(ITestResult result) {
		String testName=result.getTestName();
		report = ReportFile.startReport(System.getProperty("user.dir")+"\\Reports\\ExtentReportFile.html",testName, "Complete Automation");
	//	ReportFile.passTest("*********** Execution starts **************");
	}

	

	public void onFinish(ITestContext context) {
		//ReportFile.passTest("************** Execution completed *************");
		ReportFile.getReporter(System.getProperty("user.dir")+"\\Reports\\ExtentReportFile.html").flush();
	}

	

	
	

}
