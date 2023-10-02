package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.Loginpage;
import projectT.pages.PerformancePage;

public class TestCasePerformance extends BaseClass {
	
	@Test
	public void Performance_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		
		PerformancePage pp=new PerformancePage(driver);
		pp.SelectPerformance();
		pp.ValidatePerformancetPage();
		pp.ConfigureKPIDetails("Capable of Analaysing Quality", "10", "100");
		pp.ConfigureTrackerDetails("Kalki Activity Tracker",Util.readconfig("Adminname"),Util.readconfig("EmployeeName"));
		pp.ConfigureTrackerDetails("Saritha Activity Tracker",Util.readconfig("EmployeeName3"),Util.readconfig("EmployeeName1"));
		pp.MypositiveTrackersDetails("Bio Login", "Submited Bio-metrics for LogIn ");
		pp.MyNegativeTrackersDetails("Scrum Meet", "Failed to attend Scrum meet");
		pp.MypositiveTrackersDetails("Client Meet", "Interacted with Client");
		pp.MyNegativeTrackersDetails("Daily Tasks", "Failed in completing Given task");
		pp.EmployeePositiveTracker(Util.readconfig("EmployeeName3"),"Bio Login", "Submited Bio-metrics for LogIn ");
		pp.EmployeePositiveTracker(Util.readconfig("EmployeeName3"),"Team Meet", "Attended team meet");
		pp.EmployeeNegativeTracker(Util.readconfig("EmployeeName3"), "Bugs Detection", "Not able to find any bugs today");
		pp.EmployeeNegativeTracker(Util.readconfig("EmployeeName3"), "Daily tasks", "Failed to compleate some of the tasks");
		
		driver.quit();

	}
}
