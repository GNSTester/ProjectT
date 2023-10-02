package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class MaintenancePage {
	WebDriver driver;
	String Exp_title="Maintenance";
	
	By select_Maintanace=By.xpath("//span[text()='Maintenance']");
	
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By btn_add=By.xpath("//button[text()=' Add ']");
	 By btn_save=By.xpath( "//button[text()=' Save ']");
	 By btn_search=By.xpath("//button[text()=' Search ']");
	 By btn_confirm=By.xpath("//button[text()=' Confirm ']");
	 By firstoption=By.xpath("//div[@role='option'][1]/span");
	 By btn_apply=By.xpath("//button[text()=' Apply ']");
	 By btn_assign=By.xpath("//button[text()=' Assign ']");
	 By btn_Create=By.xpath("//button[text()=' Create ']");
	 By btn_submit=By.xpath("//button[text()=' Submit ']");
	 By btn_cancel=By.xpath("//button[text()=' Cancel ']");
	 By btn_Download=By.xpath("//button[text()=' Download ']");
	 By btn_purge=By.xpath("//button[text()=' Purge ']");
	 By btn_EmpActive=By.xpath("//button[text()=' Activate Employment ']");

	 
	 By Enter_password=By.xpath("//label[text()='Password']/following::div[1]/input");
	 
     By click_AccessRec=By.linkText("Access Records");
     By Enter_Ename=By.xpath("//label[text()='Employee Name']/following::div[3]/input");
     
     By Click_PurgRec=By.xpath("//span[text()='Purge Records ']");
    
     By click_EmpRec=By.linkText("Employee Records");
     By select_PIM=By.xpath("//span[text()='PIM']");
	 By btn_Edit=By.xpath("//div[@role='table']/div[2]//i[@class='oxd-icon bi-pencil-fill']");
	 By klk_job=By.linkText("Job");
	 By btn_EmpTerm=By.xpath("//button[text()=' Terminate Employment ']");
     By Enter_TermDate=By.xpath("//label[text()='Termination Date']//ancestor::div[@class='oxd-form-row']//div[2]//input");
     By click_TermReason=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Termination Reason']/following::div[1]");
     By sel_poorperfm=By.xpath("//div[@role='listbox']//div/span[text()='Poor performance']");
	 By btn_close=By.xpath("//div[text()='Close']");
     By Enter_note=By.xpath("//form//textarea");
	 By click_SaveDoc=By.xpath("//div[@role='document']//button[text()=' Save ']");
	 By employee_list=By.linkText("Employee List");
     By Enter_PastEname=By.xpath("//label[text()='Past Employee']/following::div[3]/input");
     By btn_ConfirmPurge=By.xpath("//button[text()=' Yes, Purge ']");
     
     By click_CandRec=By.linkText("Candidate Records");
     By Enter_Candat=By.xpath("//label[text()='Vacancy']/following::div[3]/input");
	
	public MaintenancePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectMaintenance() {
		Util.click(driver, select_Maintanace,"Maintanance option");
		
	}
	public void ValidateMaintenancePage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Maintenance']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Maintenance page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Maintenance page is not opened");
		
	}

	public void PastEmpRecords(String Ename) {
		Util.click(driver, Click_PurgRec, "Purge Records in Menu");
		Util.click(driver, click_EmpRec, "Employee Records");
		Util.sendkeys(driver, Enter_PastEname,Ename, "Past Employee Name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, btn_purge, "Records");
		Util.Hardwait(2);
		Util.click(driver, btn_purge, "Purge Button");
		Util.click(driver, btn_ConfirmPurge, "Yes,Purge Button");
		Util.Hardwait(2);
	}
	public void TerminateEmployee(String Ename,String Tdate,String Note) {
		Util.click(driver, select_PIM, "PIM Page");
		Util.click(driver, employee_list,"Employee list in Tab");
		Util.sendkeys(driver,Enter_Ename, Ename,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search,"Search button");	
		
		Util.click(driver, btn_Edit, "Edit button");
		
		Util.click(driver, klk_job, "Job in Menu");
		Util.click(driver, btn_EmpTerm, "Terminate Employement button");
		Util.sendkeys(driver, Enter_TermDate, Tdate, "Termination Date");
		Util.click(driver, btn_close, "Close button");
		Util.click(driver, click_TermReason, "Termination Reason");
        Util.click(driver, sel_poorperfm, "Poor Performance");
        Util.sendkeys(driver, Enter_note, Note, "Note");
        Util.click(driver, click_SaveDoc, "Save button");
        Util.Hardwait(5);
		Util.CheckRecords(driver, btn_EmpActive, "Records");
		Util.Hardwait(2);
	}
	
	public void AccessRecords(String Ename) {
		Util.click(driver, click_AccessRec, "Access Records in Menu");
		Util.sendkeys(driver, Enter_Ename, Ename, "Employee Name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, btn_Download, "Records");
		Util.Hardwait(2);
		Util.click(driver, btn_Download, "Download Button");
		
	}
	public void AuthenticateAdmin(String password) {
		Util.click(driver, select_Maintanace,"Maintanance option");
		Util.sendkeys(driver, Enter_password, password, "Password");
		Util.click(driver, btn_confirm, "Confirm Button");
	}
	public void CandidateRecords(String Cname) {
		Util.click(driver, Click_PurgRec, "Purge records in Menu");
		Util.click(driver, click_CandRec, "Candidate Records");
		Util.sendkeys(driver, Enter_Candat, Cname, "Vacancy");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search,"Search button");	
		Util.Hardwait(2);
		
	}
}
