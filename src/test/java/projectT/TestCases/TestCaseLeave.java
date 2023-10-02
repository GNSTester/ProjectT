package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.LeavePage;
import projectT.pages.Loginpage;

public class TestCaseLeave extends BaseClass {
	@Test(enabled=true,priority=3)
	public void Leaves_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		
		LeavePage lep=new LeavePage(driver);
		lep.SelectLeave();
		lep.ValidateLeavePage();
		
		lep.ConfigureDetails("Emergency","Medical","Company Anniversary","2023-06-25","2023-02-01","2023-06-30");
	    lep.Leave_Entitlements(Util.readconfig("Adminname"), "45","12","60");
		lep.ApplyVacLeave("2023-02-01","2023-02-20","11","00","04","05","Digital Detox");
		lep.ApplyEmergencyLeave("2023-04-03","2023-04-06","10","30","05","30","Family Emergency");
		lep.ApplyMedicalLeave("2023-08-02","2023-09-17","Post Surgery Bed Rest");
		
	    lep.AssignLeave(Util.readconfig("Adminname"), "2023-12-04","2023-12-05","Paid leaves");
		Util.Hardwait(3);
		
		lep.LeaveList(Util.readconfig("Adminname"));
		lp.validateLogout();
		
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("Username"),Util.readconfig("Password"));
		lep.SelectLeave();
		lep.Leavemanage(Util.readconfig("Adminname"));
		Util.Hardwait(2);
		lp.validateLogout();
		
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		lep.SelectLeave();
		lep.MyLeaves(Util.readconfig("MedLeave"),Util.readconfig("EmergencyLeave"),Util.readconfig("AssignEL"),Util.readconfig("vacLeave"));
		lep.CheckReports(Util.readconfig("Adminname"));
        Util.Hardwait(2);

		driver.quit();

}
}