package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.Loginpage;
import projectT.pages.MaintenancePage;

public class TestCaseMaintanance extends BaseClass {
	@Test
	public void Maintainance_page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("Username"),Util.readconfig("Password"));
		
		MaintenancePage mp=new MaintenancePage(driver);
		mp.AuthenticateAdmin(Util.readconfig("Password"));
		mp.CandidateRecords("TestLead");
		mp.AccessRecords(Util.readconfig("EmployeeName"));
		//mp.PastEmpRecords(Util.readconfig("EmployeeName1"));
		mp.TerminateEmployee(Util.readconfig("EmployeeName4"),"2023-03-12","Terminate Immediately");
		mp.AuthenticateAdmin(Util.readconfig("Password"));
		mp.PastEmpRecords(Util.readconfig("EmployeeName4"));
		driver.quit();

	}

}
