package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.DirectoryPage;
import projectT.pages.Loginpage;

public class TestCaseDirectory extends BaseClass {
	
	@Test
	public void Directory_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
	    DirectoryPage dp=new DirectoryPage(driver);
	    dp.SelectDirectory();
	    dp.ValidateDirectoryPage();
	    dp.SearchInDirectory("Kalki");
	
		driver.quit();

	}
}
