package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class DashboardPage {
	WebDriver driver;
	String Exp_title="Dashboard";
	
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By btn_add=By.xpath("//button[text()=' Add ']");
	 By btn_save=By.xpath( "//button[text()=' Save ']");
	 By btn_search=By.xpath("//button[text()=' Search ']");
	 By btn_confirm=By.xpath("//button[text()=' Confirm ']");
	 By firstoption=By.xpath("//div[@role='option'][1]/span");
	 By btn_apply=By.xpath("//button[text()=' Apply ']");
	 By btn_assign=By.xpath("//button[text()=' Assign ']");
	 By btn_edit=By.xpath("//button[text()=' Edit ']");
	 By btn_submit=By.xpath("//button[text()=' Submit ']");
	 By btn_view=By.xpath("//button[text()=' View ']");
	 By records=By.xpath("//div[@role='table']");
	 By applic_rec=By.xpath("//div[@class='oxd-layout-context']/div[1]/form");


	
	 By select_Dashboard=By.xpath("//span[text()='Dashboard']");
	 
	 By click_Interview=By.xpath("//button[@class='oxd-icon-button oxd-icon-button--info orangehrm-report-icon']");
	 By Enter_CandName=By.xpath("//label[text()='Candidate Name']/following::div[3]/input");
	 By click_JobTitle=By.xpath("//label[text()='Job Title']/following::div[1]");
	 By sel_TestLead1=By.xpath("//div[@role='listbox']//div/span[text()='TestLead']");
     By click_vacancy=By.xpath("//label[text()='Vacancy']/following::div[1]");
	 By btn_AKDrec=By.xpath("//div[text()='Ajay Kumar Deshmukh']/ancestor::div[@role='row']//button[1]");
     By btn_PassIntervew=By.xpath("//button[text()=' Mark Interview Passed ']");
     By btn_OfferJob=By.xpath("//button[text()=' Offer Job ']");
     By btn_HireJob=By.xpath("//button[text()=' Hire ']");
     By click_candidate=By.linkText("Candidates");
     
     By Approve_Timesheet=By.xpath("//button[@class='oxd-icon-button oxd-icon-button--warn orangehrm-report-icon']");
     By approve_LeaveReq=By.xpath("//button[@class='oxd-icon-button oxd-icon-button--success orangehrm-report-icon']");
     
     By click_Attendance=By.xpath("//div[@class='orangehrm-attendance-card']//button");
     
     By btn_AssnLeave=By.xpath("//button[@title='Assign Leave']");
     By btn_Leavelist=By.xpath("//button[@title='Leave List']");
     By btn_TimeSheets=By.xpath("//button[@title='Timesheets']");
     By btn_ApplyLeave=By.xpath("//button[@title='Apply Leave']");
     By btn_MyLeave=By.xpath("//button[@title='My Leave']");
     By btn_MyTimeSheet=By.xpath("//button[@title='My Timesheet']");

	public DashboardPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectDashboard() {
		Util.click(driver, select_Dashboard,"Dashboard option");
		
	}
	public void ValidateDashboardPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Dashboard page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Dashboard page is not opened");
		
	}
	
	public void CandidateInterview(String Ename) {
		Util.click(driver, click_Interview, "Click tInterview Candidates ");
		
		Util.click(driver, click_vacancy, "Vacancy");
 		Util.click(driver, sel_TestLead1, "TestLead");
 		Util.click(driver, btn_search, "Search button");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
 		
 		Util.click(driver, btn_AKDrec, "Ajay Kumar Deshmukh Record");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, click_candidate, "Records");
 		Util.click(driver, btn_PassIntervew, "Marks Interview Passed");
		Util.click(driver, btn_save, "Save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, click_candidate, "Records");
		Util.Hardwait(2);
		Util.click(driver, btn_OfferJob, "Offer Job Button");
		Util.click(driver, btn_save, "Save button");
		Util.Hardwait(4);
		Util.CheckRecords(driver, click_candidate, "Records");
		Util.Hardwait(2);
		Util.click(driver, btn_HireJob, "HIre Button");
		Util.click(driver, btn_save, "Save button");
		
		Util.click(driver, click_candidate, "candidates in tab");
 		Util.sendkeys(driver, Enter_CandName, Ename, "Candidate Name");
 		 Util.click(driver, firstoption, "First Hint");
 		Util.click(driver, btn_search, "Search button");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}
public void Checking_Modules() {
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, Approve_Timesheet, "Approve Timesheeets");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, approve_LeaveReq, "Approve Leave Requests");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, click_Attendance, "Attendance button in Quick launch");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, btn_AssnLeave, "Assign Leave Button in Quick launch");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, btn_Leavelist, "Leave list Button in Quick launch");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, btn_TimeSheets, "Timesheet Button in Quick launch");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, btn_ApplyLeave, "Apply Leave Button in Quick Launch ");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, btn_MyLeave, "My Leave Button in Quick Launch");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.click(driver, btn_MyTimeSheet," My TimeSheet Button in Quick launch");
	Util.click(driver, select_Dashboard,"Dashboard option");
	Util.Hardwait(5);
}
}
