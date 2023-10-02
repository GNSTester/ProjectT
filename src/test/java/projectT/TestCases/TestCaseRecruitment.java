package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.Loginpage;
import projectT.pages.RecruitmentPage;

public class TestCaseRecruitment extends BaseClass {
	
	@Test
	public void Recruitment_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		
		RecruitmentPage rep=new RecruitmentPage(driver);
	    rep.SelectRecuitment();
	    rep.ValidateRecruitmentPage();
	    rep.TestleadVacancyDetails("TestLead", "Candidates needs to lead testing Team", Util.readconfig("Adminname"), "03");
	    rep.CandidateDetails("Sir", "Aurther", "Doyle", "SAD123@gmail.com", "987654321", "Certified QA Tester", "2023-08-05", "I had 2 Years Experiance as TestLead");
        rep.CandidateDetails("Ajay", "Kumar", "Deshmukh","AKD123@email.com","9988776655","Experienced Tester","2023-04-02","Working on Testing Since last Year");
		rep.reject_Candidate("Sir");
		rep.Shortlist_candidate("Ajay","TestLead Interview","Kalki","2023-09-15");
        driver.quit();

	}
}