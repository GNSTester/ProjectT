package projectT.config;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentTest;


import projecT.Utils.Util;
import projectT.reports.ReportFile;


public class BaseClass {
public WebDriver driver;
public static ExtentTest report ;

@BeforeMethod
public void BeforeTest(Method m) throws IOException {
	report = ReportFile.startReport(System.getProperty("user.dir")+"\\Reports\\ExtentReportFile.html",m.getName(), "Complete Automation");
	ReportFile.passTest("*********** Execution starts **************");
	
	Launchbrowser(Util.readconfig("browser"));	
}

@BeforeSuite
 public void StartTime() {
	 System.out.println("Execution Start Time is  "+ java.time.LocalTime.now());
 }
@AfterSuite
public void EndTime() {
	 System.out.println("Execution Finish Time is  "+ java.time.LocalTime.now());
}	 



@AfterMethod
public void afterMethod(ITestResult result) {
	
	ReportFile.passTest("************** Execution completed *************");

	ReportFile.getReporter(System.getProperty("user.dir")+"\\Reports\\ExtentReportFile.html").flush();
	//driver.quit();
}

	
	public  void Launchbrowser(String browser) throws IOException {
		 if(browser.equals("Chrome")){
		driver = new ChromeDriver();	 
		 }
		 if(browser.equals("firefox")){
				driver = new FirefoxDriver();
				 }
		 if(browser.equals("edge")){
				driver = new EdgeDriver();	 
				 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(Util.readconfig("URL"));

}
}