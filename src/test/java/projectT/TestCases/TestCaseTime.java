package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.Loginpage;
import projectT.pages.TimePage;

public class TestCaseTime extends BaseClass {
	@Test
	public void Time_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		 //lp.AuthenticateLogin(Util.readconfig("Username"),Util.readconfig("Password"));
	    lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
	    
	     TimePage tp=new TimePage(driver);
	     tp.SelectTime();
	     tp.ValidateTimePage();
	     tp.ProjectInfoDetails("GNS AI Services","Provide Innovative AI softwares for everything ","Project CyberAI","AI monitoring security",Util.readconfig("Adminname"),Util.readconfig("P3A1"),Util.readconfig("P3A2"),Util.readconfig("P3A3"));
	     tp.ProjectInfoDetails("GNS Cloud Tech", "Provide Cloud services", "Project cloud power","Cloud Development and support",Util.readconfig("Adminname"),Util.readconfig("P2A1"),Util.readconfig("P2A2"),Util.readconfig("P2A3")); 
	     tp.ProjectInfoDetails("GNS Power API", "provides API Services", "Project API", "Handling of API ",Util.readconfig("Adminname"),Util.readconfig("P1A1"),Util.readconfig("P1A2"),Util.readconfig("P1A3"));
	     tp.TimesheetsDetails(Util.readconfig("pro1"),"05","07",Util.readconfig("pro2"),"06","04",Util.readconfig("pro3"),"03","08");
	     tp.CheckTimesheets(Util.readconfig("Adminname"));  
	        lp.validateLogout(); 
	        lp.LoginIsOpened();
	        lp.AuthenticateLogin(Util.readconfig("Username"),Util.readconfig("Password"));
			tp.SelectTime();
		 tp.manageTimesheets(Util.readconfig("Adminname"),"Perfect  upto Now");
			Util.Hardwait(2);
			lp.validateLogout();
			lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		 tp.SelectTime();
		 tp.CheckTimesheets(Util.readconfig("Adminname")); 
		 tp.PunchINandOUT("2023-08-04","11:00 AM","Plan Prepare Started");
		 tp.PunchOut("2023-08-04","05:00 PM","Plan is Prepared");
		 tp.PunchINandOUT("2023-08-07","11:30 AM","Coding Started");
		 tp.PunchOut("2023-08-07","04:00 PM","Coding compleated");
		 tp.PunchINandOUT("2023-08-11","11:15 AM","Testing Started");
		 tp.PunchOut("2023-08-11","04:30 PM","Testing compleated");
		 tp.AttendanceDetails("2023-08-04","2023-08-07","2023-08-11",Util.readconfig("Adminname"));
		 tp.ProjectReportsDetails(Util.readconfig("pro1"));
		 tp.ProjectReportsDetails(Util.readconfig("pro2"));
		 tp.ProjectReportsDetails(Util.readconfig("pro3"));
		 tp.ReportDetails(Util.readconfig("Adminname"));
		 
		 Util.Hardwait(2);
			driver.quit();

	}
}
