package projectT.TestCases;

import java.io.IOException;


import org.testng.annotations.Test;


import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.Loginpage;
import projectT.pages.PIM_page;


public class TestCasePIM extends BaseClass {
	
	@Test
	public void PIM_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("Username"),Util.readconfig("Password"));

		PIM_page pim=new PIM_page(driver);
		pim.SelectPIM();
		pim.ValidatePIMPage();
		pim.AddEmployee("Kalki","Automationwala","Tester","TesterSai","Sai@1117","GNS4U");
		pim.AddEmployee("Arya", "Manual", "Tester", "TesterA", "Arya@1117", "Arya369");
		pim.AddEmployee("Karthik", "Quality", "Tester", "TesterK", "Kark@1117", "Kark789");
		pim.AddEmployee("Saritha", "Performance", "Test Engineer", "TesterSATA", "Saru@1117", "Saru112");
		pim.AddEmployee("Bheem", "Load", "Checker", "TesterBheem", "Bheem@1122", "Bheems505");
		pim.AddEmployee("Vijay","API","Tester","SpyVijay","Vijay@9897","Vijay201");
		pim.reports("Secrets");
		pim.configurationdetails("Important Contacts","Emergency","Poor performance");
		
		driver.quit();

	}	
}
