package projectT.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import projecT.Utils.Util;
import projectT.config.BaseClass;
import projectT.pages.ClaimPage;
import projectT.pages.Loginpage;

public class TestCaseClaim extends BaseClass{
	@Test
	public void Claim_Page_Automation() throws IOException {
		Loginpage lp=new Loginpage(driver);
		lp.LoginIsOpened();
		lp.AuthenticateLogin(Util.readconfig("AdminUsername"),Util.readconfig("AdminPassword"));
        
		ClaimPage cp=new ClaimPage(driver);
		cp.SelectClaim();
		cp.ValidateClaimPage();
		cp.ConfigAddEvent("ClientMeet", "Client wants to Interact and discuss in Private Places");
		cp.ConfigAddEvent("Onsite Trips", "Send an Employee for Onsite Work for Couple of months");
		cp.ConfigAddExpenseType("Accomedation and Dining", "Expenses involve Room Rents and Food Charges ");
		cp.ConfigAddExpenseType("Accomodation and Transportation", "Expenses of private Rental places and Transportation charges");
	    cp.SubmitClaim("Expenses of Client", "2023-07-20", "7000");
	    cp.AssignClaim("Hospital Charges", "2023-03-18", "85000",Util.readconfig("EmployeeName2"));
	    cp.MyClaims("Rental and Accomodation Expenses","2023-05-04","3500");
        cp.EmployeeClaims(Util.readconfig("Adminname"));
        cp.EmployeeClaims(Util.readconfig("EmployeeName2"));
        
		driver.quit();

	}}