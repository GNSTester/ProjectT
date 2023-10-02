package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.AdminPage;
import projectT.pages.Loginpage;

public class TestCaseAdmin extends BaseClass {
	@Test(priority=2)
	public void Admin_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		AdminPage ap=new AdminPage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("Username"),Util.readconfig("Password"));
		ap.SelectAdmin();
		ap.ValidateAdminPage();
		//ap.add_Employee("TesterSai","saiTheTester","Sai@1117");
		ap.add_admin_or_ESS(Util.readconfig("Adminname"),Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"),Util.readconfig("role1"),Util.readconfig("statusE"));
		lp.validateLogout();  
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		ap.SelectAdmin();
		
		  ap.ValidateAdminPage(); 
		  ap.JobDetails("Testlead","Tested","GradeXL","Pending","Head Of The Department","Emergency WeekDays","25000","50000");
		  ap.OrganisationDetails("AUG-15-1947","HOGWARTS HQ","UNIT007","Promotions");
		  ap.QualificationsDetails("PowerBi","Degree of IT","Certified Expert(CE)","Telugu","Expert Members Association(EMA)");
		  ap.NationalitiesDetails("Super Indian");
		  ap.CorporateBranding("#380bff","#0a14da");
		  ap.ConfigurationDetails("arere@gmail.com","Sai","OrangeHRM_facebook", "www.facebook.com");
		 
		driver.quit();
	}

}
