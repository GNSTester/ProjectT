package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.BuzzPage;
import projectT.pages.Loginpage;

public class TestCaseBuzz extends BaseClass {
    
	@Test
	public void Buzz_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
		
		BuzzPage bp=new BuzzPage(driver);
		bp.SelectBuzz();
		bp.ValidateBuzzPage();
		bp.SelectBuzz();
		bp.ReactBuzzPage("Check Mate! Orange Amigos, Have a Nice Day! Have a Great Life!");
	  
		driver.quit();

	}

}
