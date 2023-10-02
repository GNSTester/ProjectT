package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class RecruitmentPage {
	WebDriver driver;
	String Exp_title="Recruitment";
	 
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
	 By applic_rec=By.xpath("//div[@class='oxd-layout-context']/div[1]");

	
	 By select_Recuitment=By.xpath("//span[text()='Recruitment']");
	 
	 By click_candidate=By.linkText("Candidates");
	 By Enter_FirstName=By.name("firstName");
     By Enter_MiddleName=By.name("middleName");
     By Enter_LastName=By.name("lastName");
     By click_vacancy=By.xpath("//label[text()='Vacancy']/following::div[1]");
     By Enter_Email=By.xpath("//label[text()='Email']/following::div[1]/input");
     By Enter_ContNumber=By.xpath("//label[text()='Contact Number']/following::div[1]/input");
     By Enter_Keywords=By.xpath("//label[text()='Keywords']/following::div[1]/input");
     By Enter_DOA=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Date of Application']/following::div[3]/input");
     By tick_consent=By.xpath("//div[@class=\"oxd-form-row\"]//span");
	 
	 By click_vacancies=By.linkText("Vacancies");
	 By Enter_VacName=By.xpath("//label[text()='Vacancy Name']/following::div[1]/input");
	 By click_JobTitle=By.xpath("//label[text()='Job Title']/following::div[1]");
	 By sel_TestLead=By.xpath("//div[@role='listbox']//div/span[text()='Testlead']");
	 By sel_TestLead1=By.xpath("//div[@role='listbox']//div/span[text()='TestLead']");
	 By Enter_Desc=By.xpath("//form//textarea");
	 By Enter_HireMang=By.xpath("//label[text()='Hiring Manager']/following::div[3]/input");
	 By Enter_NoOfPos=By.xpath("//label[text()='Number of Positions']/following::div[1]/input");
	 By Switch_active=By.xpath("//p[text()='Active']/parent::div//label");
	 By Switch_Publish=By.xpath("//p[text()='Publish in RSS Feed and Web Page']/parent::div//label");
	 By link_JobSite=By.linkText("https://opensource-demo.orangehrmlive.com/web/index.php/recruitmentApply/jobs.html");
	 By click_HireMang=By.xpath("//label[text()='Hiring Manager']/following::div[1]");
	 By sel_kalki=By.xpath("//div[@role='listbox']//div/span[text()='Kalki Tester']");
	 By btn_SADrec=By.xpath("//div[text()='Sir Aurther Doyle']/ancestor::div[@role='row']//button[1]");
	 By btn_AKDrec=By.xpath("//div[text()='Ajay Kumar Deshmukh']/ancestor::div[@role='row']//button[1]");
	 By btn_reject=By.xpath("//button[text()=' Reject ']");
	 By btn_shortlist=By.xpath("//button[text()=' Shortlist ']");
	 By btn_SchedInterv=By.xpath("//button[text()=' Schedule Interview ']");
	 By Enter_IntvewName=By.xpath("//label[text()='Interview Title']/following::div[1]/input");
	 By Enter_IntrviwrName=By.xpath("//label[text()='Interviewer']/following::div[3]/input");
	 By Enter_IntrVewDate=By.xpath("//label[text()='Date']/following::div[3]/input");
	 By Enter_CandName=By.xpath("//label[text()='Candidate Name']/following::div[3]/input");
	 

	public RecruitmentPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectRecuitment() {
		Util.click(driver, select_Recuitment,"Recuitment option");
		
	}
	public void ValidateRecruitmentPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Recruitment']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Recruitment page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Recruitment page is not opened");
		
	}
	
     public void TestleadVacancyDetails(String Vacancy,String Desc,String Manager,String positions) {
    	 Util.click(driver, click_vacancies, "Vacancy in Tab");
    	 Util.click(driver, btn_add, "add button");
    	 Util.sendkeys(driver, Enter_VacName, Vacancy, "Vacancy name");
    	 Util.click(driver, click_JobTitle, "Job Title");
    	 Util.click(driver, sel_TestLead, "TestLead option");
    	 Util.sendkeys(driver, Enter_Desc, Desc, "Description");
    	 Util.sendkeys(driver, Enter_HireMang, Manager, "Hiring manager");
    	 Util.click(driver, firstoption, "First Hint");
    	 Util.sendkeys(driver, Enter_NoOfPos, positions, "Number of Positions");
    	 Util.click(driver, Switch_active, "Active switch");
    	 Util.Hardwait(1);
    	 Util.click(driver, Switch_active, "Active switch");
    	 Util.click(driver, Switch_Publish, "Publish in RSS and Webpage");
    	 Util.Hardwait(1);
    	 Util.click(driver, Switch_Publish, "Publish in RSS and Webpage");
    	// Util.click(driver, link_JobSite, "Website URL");
    	 Util.click(driver, btn_save, "Save button");
    	 Util.Hardwait(5);
    	 Util.click(driver, click_vacancies, "Vacancy in Tab");
    	 Util.click(driver, click_vacancy, "Vacancy");
 		Util.click(driver, sel_TestLead1, "TestLead");
 		Util.click(driver, click_HireMang, "Hire Manager");
 		Util.click(driver, sel_kalki, "kalki option");
 		Util.click(driver, btn_search, "Search button");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}


	public void CandidateDetails(String firstname,String middlename,String lastname,String email,String Contact,String keywords,String Applydate,String desc) {
		Util.click(driver, click_candidate, "candidates in tab");
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_FirstName, firstname, "Employee Firstname");
		Util.sendkeys(driver, Enter_MiddleName, middlename,"Employee Middlename");
		Util.sendkeys(driver, Enter_LastName, lastname,"Employee Lastname");
		Util.click(driver, click_vacancy, "Vacancy");
		Util.click(driver, sel_TestLead1, "TestLead");
		Util.sendkeys(driver, Enter_Email, email, "Email");
		Util.sendkeys(driver, Enter_ContNumber, Contact, "Contact number");
		Util.sendkeys(driver, Enter_Keywords, keywords, "Keywords");
		Util.sendkeys(driver, Enter_DOA, Applydate, "Date of Application");
		Util.sendkeys(driver, Enter_Desc, desc, "Notes");
		Util.click(driver, tick_consent, "Consent to keep Data");
		 Util.click(driver, btn_save, "Save button");
		 Util.Hardwait(5);
		 Util.click(driver, click_candidate, "candidates in tab");
    	 Util.click(driver, click_vacancy, "Vacancy");
 		Util.click(driver, sel_TestLead1, "TestLead");
 		Util.click(driver, click_HireMang, "Hire Manager");
 		Util.click(driver, sel_kalki, "kalki option");
 		Util.click(driver, btn_search, "Search button");	
 		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");;
		Util.Hardwait(2);
	}
	public void reject_Candidate(String Ename) {
		Util.click(driver, click_candidate, "candidates in tab");
		Util.click(driver, click_vacancy, "Vacancy");
 		Util.click(driver, sel_TestLead1, "TestLead");
 		Util.click(driver, btn_search, "Search button");
 		
 		Util.click(driver, btn_SADrec, "Sir Aurther Doyle Record");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, click_candidate, "Records");
 		Util.click(driver, btn_reject, "Reject Button");
 		Util.click(driver, btn_save, "Save button");
 		 
 		Util.click(driver, click_candidate, "candidates in tab");
 		Util.sendkeys(driver, Enter_CandName, Ename, "Candidate Name");
 		 Util.click(driver, firstoption, "First Hint");
 		Util.click(driver, btn_search, "Search button");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
	
}
	public void Shortlist_candidate(String Ename,String iTitle,String iName,String iDate) {
		Util.click(driver, click_candidate, "candidates in tab");
		Util.click(driver, click_vacancy, "Vacancy");
 		Util.click(driver, sel_TestLead1, "TestLead");
 		Util.click(driver, btn_search, "Search button");
 		
 		Util.click(driver, btn_AKDrec, "Ajay Kumar Deshmukh Record");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, click_candidate, "Records");
		Util.Hardwait(2);
 		Util.click(driver, btn_shortlist, "Shortlist Button");
 		Util.click(driver, btn_save, "Save button");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, click_candidate, "Records");
		Util.Hardwait(2);
 		Util.click(driver, btn_SchedInterv, "Schedule Interview Button");
 		Util.sendkeys(driver, Enter_IntvewName, iTitle, "Interview Title");
 		Util.sendkeys(driver, Enter_IntrviwrName, iName, "Interviwer Name");
 		 Util.click(driver, firstoption, "First Hint");
 		Util.sendkeys(driver, Enter_IntrVewDate, iDate, "Interview Date"); 		
		Util.click(driver, btn_save, "Save button");
		
		Util.click(driver, click_candidate, "candidates in tab");
 		Util.sendkeys(driver, Enter_CandName, Ename, "Candidate Name");
 		 Util.click(driver, firstoption, "First Hint");
 		Util.click(driver, btn_search, "Search button");
 		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records"); 
		Util.Hardwait(2);
		
	}
}
