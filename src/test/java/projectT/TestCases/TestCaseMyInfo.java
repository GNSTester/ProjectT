package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.Loginpage;
import projectT.pages.MyInfoPage;
import projectT.pages.PIM_page;

public class TestCaseMyInfo extends BaseClass{
	
	@Test(enabled=true)
	public void Config_MyInfo_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		PIM_page pim=new PIM_page(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("Username"),Util.readconfig("Password"));
		pim.SelectPIM();
		pim.EditEmployee1(Util.readconfig("Adminname"), "2023-10-04", "Failed in finding Defects", "25000", "Level 2 Employee");
		pim.AddSupervisor(Util.readconfig("EmployeeName"));
		pim.AddSubordinateDirect(Util.readconfig("EmployeeName1"));
		pim.AddSubordinateDirect(Util.readconfig("EmployeeName2"));
		pim.AddSubordinateInDirect(Util.readconfig("EmployeeName3"));
		lp.validateLogout();
		driver.quit();
	}
	@Test
	public void Edit_MyInfo_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		MyInfoPage mp=new MyInfoPage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		mp.SelectMyInfo();
		mp.ValidateMyInfotPage();
		mp.UpdateDetails("2000-08-15","Guntur", "987654321","admin@kalki.com","Manager", "HarryPotter","Brother","Tester INFOTECH", "Lead Tester");
		mp.VerifyEmployeeRecord(Util.readconfig("Adminname"));
		
		driver.quit();

	}

}
