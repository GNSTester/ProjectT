package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class PerformancePage {
	WebDriver driver;
	String Exp_title="Performance";
	
	 By select_Performance=By.xpath("//span[text()='Performance']"); 
	
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
	 By Profile_name=By.xpath("//p[@class=\"oxd-userdropdown-name\"]");
	 By logs=By.xpath("//div[@class='orangehrm-container']//div[@class='orangehrm-employee-tracker-log-title'][1]");
	 By records=By.xpath("//div[@role='table']");

	
	 
	 By click_configure=By.xpath("//span[text()='Configure ']");
	 By click_kpi=By.linkText("KPIs");
	 By Enter_KPI=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Key Performance Indicator']/following::div[1]/input");
	 By Enter_MInRate=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Minimum Rating']/following::div[1]/input");
	 By Enter_MaxRate=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Maximum Rating']/following::div[1]/input");
	 By sel_TestLead1=By.xpath("//div[@role='listbox']//div/span[text()='Testlead']");
	 By click_JobTitle=By.xpath("//label[text()='Job Title']/following::div[1]");
	 By switch_DefScale=By.xpath("//input[@type='checkbox']");
	
	 By click_track=By.linkText("Trackers");
	 By Enter_TrackName=By.xpath("//label[text()='Tracker Name']/following::div[1]/input");
	 By Enter_Ename=By.xpath("//label[text()='Employee Name']/following::div[3]/input");
	 By Enter_RevName=By.xpath("//label[text()='Reviewers']/following::div[3]/input");
	 
	 
	 
	 By click_ManReviews=By.xpath("//span[text()='Manage Reviews ']");
	 By sel_ManReviews=By.linkText("Manage Reviews");
	 By sel_MyRevies=By.linkText("My Reviews");
	 By sel_EmpReviews=By.linkText("Employee Reviews");
	 
	 
	 By click_MyTrack=By.linkText("My Trackers");
	 By click_ViewKalki=By.xpath("//div[text()='Kalki Activity Tracker']/ancestor::div[@role='row']//button[text()=' View ']");
	 By click_AddLog=By.xpath("//button[text()=' Add Log ']");
	 By Enter_logName=By.xpath("//div[@role='document']//div[2]/input");
	 By btn_positive=By.xpath("//button[text()=' Positive ']");
	 By btn_Negative=By.xpath("//button[text()=' Negative ']");
	 By click_SaveDoc=By.xpath("//div[@role='document']//button[text()=' Save ']");
	 By Enter_comment=By.xpath("//form//textarea");
	 
	 By click_EmpTrack=By.linkText("Employee Trackers");
	
	 
	 

	public PerformancePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectPerformance() {
		Util.click(driver, select_Performance,"Performance option");
		
	}
	public void ValidatePerformancetPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Performance']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Performance page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Performance page is not opened");
		
	}
	
	public void ConfigureKPIDetails(String KPI,String MINrate,String MAXrate) {
		Util.click(driver, click_configure, "Configure in Tab");
		Util.click(driver,click_kpi, "KPI's in Dropdown");
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_KPI, KPI, "Enter KPI");
		Util.click(driver, click_JobTitle, "Job Title");
    	Util.click(driver, sel_TestLead1, "TestLead option");
    	Util.sendkeys(driver, Enter_MInRate, MINrate, "MInimmum Rating");
    	Util.sendkeys(driver, Enter_MaxRate, MAXrate, "Maximmun Rating");
   	    Util.click(driver, btn_save, "Save button");
   	    Util.Hardwait(5);
   	    Util.click(driver, click_JobTitle, "Job Title");
 	    Util.click(driver, sel_TestLead1, "TestLead option");
    	Util.click(driver, btn_search, "Search button");
    	Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}
	
public void ConfigureTrackerDetails(String track,String ename,String Reviwers) {
		Util.click(driver, click_configure, "Configure in Tab");
	    Util.click(driver, click_track, "Trackers in Dropdown");
	    Util.click(driver, btn_add, "add button");
	    Util.sendkeys(driver, Enter_TrackName, track, "Tracker Name");
	    Util.sendkeys(driver, Enter_Ename, ename, "Employee Name");
	    Util.click(driver, firstoption, "First Hint");
	    Util.sendkeys(driver, Enter_RevName, Reviwers, "Reviewers Name");
	    Util.click(driver, firstoption, "First Hint");
   	    Util.click(driver, btn_save, "Save button");
   	    Util.Hardwait(5);
   	    Util.sendkeys(driver, Enter_Ename, ename, "Employee Name");
	    Util.click(driver, firstoption, "First Hint");
    	Util.click(driver, btn_search, "Search button");
    	Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
	}
 
public void ManageReviews() {
    Util.click(driver, click_ManReviews, "Manage Reviews Option");
    Util.click(driver, sel_ManReviews, "Manage Reviews in Dropdown");
    
	
}

public void MypositiveTrackersDetails(String Log,String comment) {
	Util.click(driver, click_MyTrack, "My Tracker in Tab"); 
	Util.click(driver, click_ViewKalki, "View button");
	Util.click(driver, click_AddLog, "Add Log Button");
	Util.sendkeys(driver, Enter_logName, Log, "Log Name");
	Util.click(driver, btn_positive, "Positive button");
	Util.sendkeys(driver, Enter_comment, comment, "Comments");
	Util.click(driver, click_SaveDoc, "Save button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, logs, "Records");
	Util.Hardwait(2);
}
public void MyNegativeTrackersDetails(String Log,String comment) {
	Util.click(driver, click_MyTrack, "My Tracker in Tab"); 
	Util.click(driver, click_ViewKalki, "View button");
	Util.click(driver, click_AddLog, "Add Log Button");
	Util.sendkeys(driver, Enter_logName, Log, "Log Name");
	Util.click(driver, btn_Negative, "Negative button");
	Util.sendkeys(driver, Enter_comment, comment, "Comments");
	Util.click(driver, click_SaveDoc, "Save button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, logs, "Records");
	Util.Hardwait(2);
}	
public void EmployeePositiveTracker(String ename,String Log,String comment) {
	Util.click(driver, click_EmpTrack,"Employees Tracker");
	 Util.sendkeys(driver, Enter_Ename, ename, "Employee Name");
	 Util.click(driver, firstoption, "First Hint");
 	Util.click(driver, btn_search, "Search button");
 	Util.click(driver, btn_view, "View Button");
 	Util.click(driver, click_AddLog, "Add Log Button");
	Util.sendkeys(driver, Enter_logName, Log, "Log Name");
	Util.click(driver, btn_positive, "Positive button");
	Util.sendkeys(driver, Enter_comment, comment, "Comments");
	Util.click(driver, click_SaveDoc, "Save button");	
	Util.Hardwait(5);
	Util.CheckRecords(driver, logs, "Records");
	Util.Hardwait(2);
}
public void EmployeeNegativeTracker(String ename,String Log,String comment) {
	Util.click(driver, click_EmpTrack,"Employees Tracker");
	 Util.sendkeys(driver, Enter_Ename, ename, "Employee Name");
	 Util.click(driver, firstoption, "First Hint");
 	Util.click(driver, btn_search, "Search button");
 	Util.click(driver, btn_view, "View Button");
 	Util.click(driver, click_AddLog, "Add Log Button");
	Util.sendkeys(driver, Enter_logName, Log, "Log Name");
	Util.click(driver, btn_Negative, "Negative button");
	Util.sendkeys(driver, Enter_comment, comment, "Comments");
	Util.click(driver, click_SaveDoc, "Save button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, logs, "Records");
	Util.Hardwait(2);
}
    
}
