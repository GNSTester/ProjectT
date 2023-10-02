package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class TimePage {
	WebDriver driver;
	String Exp_title="Time";
	 
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
	 By pro_records=By.xpath("//div[@class='oxd-report-table --frame']");

	
	 By select_Time=By.xpath("//span[text()='Time']");
	 
	 By click_timesheets=By.xpath("//span[text()='Timesheets ']");
	 By click_Mytimesheets=By.linkText("My Timesheets");
	 By click_btnCreate=By.xpath("//button[text()=' Create Timesheet ']");
	 By Enter_ProName1=By.xpath("//tbody/tr[1]/td[1]//input");
	 By select_activity1=By.xpath("//tbody/tr[1]/td[2]//div");
	 By Enter_MonText1=By.xpath("//tbody/tr[1]/td[3]//input");
	 By Enter_TueText1=By.xpath("//tbody/tr[1]/td[4]//input");
	 By Enter_WedText1=By.xpath("//tbody/tr[1]/td[5]//input");
	 By Enter_ThuText1=By.xpath("//tbody/tr[1]/td[6]//input");
	 By Enter_FriText1=By.xpath("//tbody/tr[1]/td[7]//input");
	 By Enter_SatText1=By.xpath("//tbody/tr[1]/td[8]//input");
	 By Enter_SunText1=By.xpath("//tbody/tr[1]/td[9]//input");
	 By Enter_ProName2=By.xpath("//tbody/tr[2]/td[1]//input");
	 By select_activity2=By.xpath("//tbody/tr[2]/td[2]//div");
	 By Enter_MonText2=By.xpath("//tbody/tr[2]/td[3]//input");
	 By Enter_TueText2=By.xpath("//tbody/tr[2]/td[4]//input");
	 By Enter_WedText2=By.xpath("//tbody/tr[2]/td[5]//input");
	 By Enter_ThuText2=By.xpath("//tbody/tr[2]/td[6]//input");
	 By Enter_FriText2=By.xpath("//tbody/tr[2]/td[7]//input");
	 By Enter_SatText2=By.xpath("//tbody/tr[2]/td[8]//input");
	 By Enter_SunText2=By.xpath("//tbody/tr[2]/td[9]//input");
	 By Enter_ProName3=By.xpath("//tbody/tr[3]/td[1]//input");
	 By select_activity3=By.xpath("//tbody/tr[3]/td[2]//div");
	 By Enter_MonText3=By.xpath("//tbody/tr[3]/td[3]//input");
	 By Enter_TueText3=By.xpath("//tbody/tr[3]/td[4]//input");
	 By Enter_WedText3=By.xpath("//tbody/tr[3]/td[5]//input");
	 By Enter_ThuText3=By.xpath("//tbody/tr[3]/td[6]//input");
	 By Enter_FriText3=By.xpath("//tbody/tr[3]/td[7]//input");
	 By Enter_SatText3=By.xpath("//tbody/tr[3]/td[8]//input");
	 By Enter_SunText3=By.xpath("//tbody/tr[3]/td[9]//input");
	 By click_APIDev=By.xpath("//div[@role='listbox']//div/span[text()='API Development']");
	 By click_APIIntg=By.xpath("//div[@role='listbox']//div/span[text()='API Integration']");
	 By click_APITest=By.xpath("//div[@role='listbox']//div/span[text()='API Testing']");
	 By click_CLDDev=By.xpath("//div[@role='listbox']//div/span[text()='Cloud Development']");
	 By click_CLDIntg=By.xpath("//div[@role='listbox']//div/span[text()='Cloud Integration']");
	 By click_CLDTest=By.xpath("//div[@role='listbox']//div/span[text()='Cloud Testing']");
	 By click_AIDev=By.xpath("//div[@role='listbox']//div/span[text()='AI Development']");
	 By click_AIIntg=By.xpath("//div[@role='listbox']//div/span[text()='AI Integration']");
	 By click_AITest=By.xpath("//div[@role='listbox']//div/span[text()='AI Testing']");
	 By click_AddRow=By.xpath("//p[text()='Add Row']/ancestor::td//button");
	 
	 
	 
	 By click_EmpTimesheets=By.linkText("Employee Timesheets");
	 By Enter_Ename=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Employee Name']/following::div[3]/input");
	 By btn_ViewRec=By.xpath("//div[@class=\"oxd-form-actions\"]//button[text()=' View ']");
	 By Comment=By.xpath("//form//textarea");
	 By btn_Approve=By.xpath("//form//button[text()=' Approve ']");
	 
     By click_attendence=By.xpath("//span[text()='Attendance ']");
     By click_MyRec=By.linkText("My Records");
     By click_PinPout=By.linkText("Punch In/Out");
     By Enter_Date=By.xpath("//label[text()='Date']/following::div[3]/input");
     By Enter_Date1=By.cssSelector("form.oxd-form>div:nth-child(1)>div>div:nth-child(1)>div>div>div");
   // By Enter_Date1=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Date']/following::div[3]");
     By Enter_time=By.xpath("//div [@class=\"oxd-grid-4 orangehrm-full-width-grid\"]//label[text()='Time']/following::div[3]/input");
     By btn_IN=By.xpath("//button[text()=' In ']");
     By btn_OUT=By.xpath("//button[text()=' Out ']");
     By click_Emprecords=By.linkText("Employee Records");
     By click_config=By.linkText("Configuration");
     
     
     By click_Reports=By.xpath("//span[text()='Reports ']");
     By click_Proreports=By.linkText("Project Reports");
     By Enter_ProNsme=By.xpath("//label[text()='Project Name']/following::div[3]/input");
     By click_EmpRecords=By.linkText("Employee Reports");
     By click_AttSummary=By.linkText("Attendance Summary");
     
     
     By click_ProjectInfo=By.xpath("//span[text()='Project Info ']");
     By click_customers=By.linkText("Customers");
     By Enter_Name=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Name']/following::div[1]/input");
     By Enter_Desc=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Description']/following::div[1]/textarea");
     By click_project=By.linkText("Projects");
     By Enter_CustName=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Customer Name']/following::div[3]/input");
     By Enter_ProAdmin=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Project Admin']/following::div[3]/input");
     By Enter_Actname=By.xpath("//label[text()='Name']/ancestor::div[@role='document']//input");
     By btn_ActSave=By.xpath("//div[@role='document']//button[text()=' Save ']");
     
	public TimePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectTime() {
		Util.click(driver, select_Time,"Time option");
		
	}
	public void ValidateTimePage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Time']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Time page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Time page is not opened");
		
	}
	
	public void ProjectInfoDetails(String CUstomer,String DEsc,String Project,String DEsc1,String ProAdmin,String Act1,String Act2,String Act3) {
		Util.click(driver, click_ProjectInfo, "Project Info in tab");
		Util.click(driver, click_customers, "Customers in Dropdown");
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_Name, CUstomer, "Customer Name");
		Util.sendkeys(driver, Comment,  DEsc, "Descriptrion");
		Util.click(driver, btn_save, "Save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, click_ProjectInfo, "Project Info in tab");
	    Util.click(driver, click_project, "Project in Dropdown");
	    Util.click(driver, btn_add, "add button");
	    Util.sendkeys(driver, Enter_Name, Project, "Project Name");
	    Util.sendkeys(driver, Enter_CustName, CUstomer, "Customer Name");
	    Util.click(driver, firstoption, "First Hint");
	    Util.sendkeys(driver, Comment,  DEsc1, "Descriptrion");
	    Util.sendkeys(driver, Enter_ProAdmin, ProAdmin, "Project admin name");
	    Util.click(driver, firstoption, "First Hint");
	    Util.click(driver, btn_save, "Save button");
	   
	    Util.click(driver, btn_add, "add button");
	    Util.sendkeys(driver, Enter_Actname, Act1, "First Activity");
	    Util.click(driver, btn_ActSave, "Save activity button");
	    Util.click(driver, btn_add, "add button");
	    Util.sendkeys(driver, Enter_Actname, Act2, "Second Activity");
	    Util.click(driver, btn_ActSave, "Save activity button");
	    Util.click(driver, btn_add, "add button");
	    Util.sendkeys(driver, Enter_Actname, Act3, "Third Activity");
	    Util.click(driver, btn_ActSave, "Save activity button");
	    Util.Hardwait(5);
	    
	    Util.click(driver, click_ProjectInfo, "Project Info in tab");
	    Util.click(driver, click_project, "Project in Dropdown");
	    Util.sendkeys(driver, Enter_CustName, CUstomer, "Customer Name");
	    Util.click(driver, firstoption, "First Hint");
	    Util.click(driver, btn_search, "Search button");
	    Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}
	
public void TimesheetsDetails(String p1,String td1,String fd1,String p2,String m2,String w2,String p3,String m3,String th3) {
	Util.click(driver, click_timesheets, "Timesheets in Menu");
	Util.click(driver, click_Mytimesheets, "My Timesheets in Dropdown");
	//Util.click(driver, click_btnCreate, "Create Timesheet button");
	Util.click(driver, btn_edit, "Edit Button");
	Util.click(driver, click_AddRow, "Add row");
	Util.click(driver, click_AddRow, "Add row");
	
	Util.sendkeys(driver, Enter_ProName1, p1, "First Project Name");
	 Util.click(driver, firstoption, "First Hint");
	Util.click(driver, select_activity1, "First activity ");
	Util.click(driver, click_APIDev, "API Development");
	Util.sendkeys(driver, Enter_TueText1, td1, "Tuesday Hours");
	Util.sendkeys(driver, Enter_FriText1, fd1, "Friday Hours");
	Util.sendkeys(driver, Enter_ProName2, p2, "Second Project Name");
	 Util.click(driver, firstoption, "First Hint");
	Util.click(driver, select_activity2, "Second activity ");
	Util.click(driver, click_CLDIntg, "Cloud Integration");
	Util.sendkeys(driver, Enter_MonText2, m2, "Monday Hours");
	Util.sendkeys(driver, Enter_WedText2, w2, "Friday Hours");
	Util.sendkeys(driver, Enter_ProName3, p3, "Third Project Name");
	 Util.click(driver, firstoption, "First Hint");
	Util.click(driver, select_activity3, "Third activity ");
	Util.click(driver, click_AITest, "AI Testing");
	Util.sendkeys(driver, Enter_MonText3, m3, "Monday Hours");
	Util.sendkeys(driver, Enter_ThuText3, th3, "Thursday Hours");
	 Util.click(driver, btn_save, "Save button");
	 Util.Hardwait(5);
	Util.CheckRecords(driver, btn_submit, "Records");
	Util.Hardwait(2);
	 Util.click(driver, btn_submit, "Submit button");
	 Util.Hardwait(2);
	 }

	public void CheckTimesheets(String Ename) {
	Util.click(driver, click_timesheets, "Timesheets in Menu");
	Util.click(driver, click_EmpTimesheets, "Employee Timesheets in Dropdown");
	Util.sendkeys(driver, Enter_Ename, Ename, "Employee name");
	 Util.click(driver, firstoption, "First Hint");
	Util.click(driver, btn_ViewRec, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
	
}
public void manageTimesheets(String Ename,String comment) {
	Util.click(driver, click_timesheets, "Timesheets in Menu");
	Util.click(driver, click_EmpTimesheets, "Employee Timesheets in Dropdown");
	Util.sendkeys(driver, Enter_Ename, Ename, "Employee name");
	 Util.click(driver, firstoption, "First Hint");
	Util.click(driver, btn_ViewRec, "View button");
	 Util.sendkeys(driver, Comment, comment, "Comment");
	 Util.Hardwait(5);
		Util.CheckRecords(driver, btn_Approve, "Records");
		Util.Hardwait(2);
	 Util.click(driver, btn_Approve, "Approve button");
	 Util.Hardwait(4);
}

public void PunchINandOUT(String date,String time,String note) {
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_PinPout, "Punch in/out in dropdown");
	Util.Hardwait(2);
	Util.sendkeys(driver, Enter_Date, date, "Date");
	Util.sendkeys(driver, Enter_time, time, "Time");
	Util.sendkeys(driver, Comment, note, "Note");
	Util.click(driver, btn_IN, "In button");
	Util.Hardwait(2);
}
public void PunchOut(String date1,String time1,String note1) {
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_PinPout, "Punch in/out in dropdown");
	Util.Hardwait(2);
	Util.sendkeys(driver, Enter_Date, date1, "Date");
	Util.sendkeys(driver, Enter_time, time1, "Time");
	Util.sendkeys(driver, Comment, note1, "Note");
	Util.click(driver, btn_OUT, "Out button");
	Util.Hardwait(2);
	
}
public void AttendanceDetails(String date1,String date2,String date3,String Ename) {
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_MyRec, "My Records in Dropdown");
	Util.sendkeys(driver, Enter_Date, date1, "Date");
	Util.click(driver, btn_view, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_MyRec, "My Records in Dropdown");
	Util.sendkeys(driver, Enter_Date, date2, "Date");
	Util.click(driver, btn_view, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_MyRec, "My Records in Dropdown");
	Util.sendkeys(driver, Enter_Date, date3, "Date");
	Util.click(driver, btn_view, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	
	
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_Emprecords, "Employee record in Dropdown");
	Util.sendkeys(driver, Enter_Ename, Ename, "Employee name");
	Util.click(driver, firstoption, "First Hint");
	Util.sendkeys(driver, Enter_Date, date1, "Date");
	Util.click(driver, btn_ViewRec, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_Emprecords, "Employee record in Dropdown");
	Util.sendkeys(driver, Enter_Ename, Ename, "Employee name");
	Util.click(driver, firstoption, "First Hint");
	Util.sendkeys(driver, Enter_Date, date2, "Date");
	Util.click(driver, btn_ViewRec, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_Emprecords, "Employee record in Dropdown");
	Util.sendkeys(driver, Enter_Ename, Ename, "Employee name");
	Util.click(driver, firstoption, "First Hint");
	Util.sendkeys(driver, Enter_Date, date3, "Date");
	Util.click(driver, btn_ViewRec, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
	
	Util.click(driver, click_attendence, "Attendence in tab");
	Util.click(driver, click_config, "Congiguration in Dropdown");	
}

public void ProjectReportsDetails(String ProName) {
	Util.click(driver, click_Reports, "Reports in Tab");
	Util.click(driver, click_Proreports, "Project reports in Dropdown");
	Util.sendkeys(driver, Enter_ProNsme, ProName, "Project Name");
	Util.click(driver, firstoption, "First Hint");
	Util.click(driver, btn_view, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, pro_records, "Records");
	Util.Hardwait(2);
	
}
public void ReportDetails(String Ename) {
	Util.click(driver, click_Reports, "Reports in Tab");
	Util.click(driver, click_EmpRecords, "Employee Records in Dropdown");
	Util.sendkeys(driver, Enter_Ename, Ename, "Employee name");
	Util.click(driver, firstoption, "First Hint");
	Util.click(driver, btn_view, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, pro_records, "Records");
//	Util.Hardwait(2);
	
	Util.click(driver, click_Reports, "Reports in Tab");
	Util.click(driver, click_AttSummary, "Attendence summary in Dropdown");
	Util.sendkeys(driver, Enter_Ename, Ename, "Employee name");
	Util.click(driver, firstoption, "First Hint");
	Util.click(driver, btn_view, "View button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, pro_records, "Records");
	Util.Hardwait(2);
}

}




