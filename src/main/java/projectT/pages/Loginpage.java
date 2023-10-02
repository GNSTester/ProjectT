package projectT.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class Loginpage {
	String Exptitle="OrangeHRM";
	 WebDriver driver; 
	
	 public Loginpage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	 
   By Input_username=By.name("username");
   By input_password=By.name("password");
   By  btn_login=By.xpath("//button[@type='submit']");
   By select_admin=By.xpath("//span[text()='Admin']");
   By click_proMenu=By.xpath("//span[@class=\"oxd-userdropdown-tab\"]//i");
   By btn_logout=By.linkText("Logout");
   
   public void LoginIsOpened()
   {
	   String acttitle = driver.getTitle();
	   ReportFile.infoTest(acttitle);
		 
		 if(acttitle.equals(Exptitle)) {
			 ReportFile.infoTest("lOGIN SUCCESSFULL");
			 
			 }
		 else
			 ReportFile.infoTest("LOGIN IS NOT SUCCESFULL");
			
		 
   }
   
	public void AuthenticateLogin(String Username, String Password) {
		
	Util.sendkeys(driver, Input_username, Username, "Username");
	Util.sendkeys(driver, input_password, Password , "Password");
	Util.click(driver, btn_login, "Login button");
	}
	public void validateLogout() {
	Util.Hardwait(5);
	Util.click(driver, click_proMenu, "Profile Dropdown");
	Util.click(driver, btn_logout, "Logout Button");
	
}


}
