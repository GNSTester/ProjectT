package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.DashboardPage;
import projectT.pages.Loginpage;

public class TestCaseDashboard extends BaseClass {
	
	@Test
	public void Dashboard_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		
		DashboardPage dp=new DashboardPage(driver);
		dp.SelectDashboard();
		dp.ValidateDashboardPage();
		dp.CandidateInterview("Ajay");
		dp.Checking_Modules();
		
		driver.quit();

}}
