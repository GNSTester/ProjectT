package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class PIM_page {
	WebDriver driver;
	String Exp_title="PIM";
	
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By select_PIM=By.xpath("//span[text()='PIM']");
     By add_employee=By.linkText("Add Employee ");
     By btn_add=By.xpath("//button[text()=' Add ']");
     By Enter_FirstName=By.name("firstName");
     By Enter_MiddleName=By.name("middleName");
     By Enter_LastName=By.name("lastName");
     By emp_id=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Employee Id']/following::div[1]/input");
     By btn_LoginCreate=By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]");
     By create_username=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Username']/following::div[1]/input");
	 By create_password=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Password']/following::div[1]/input");
	 By confirm_password=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Confirm Password']/following::div[1]/input");
	 By btn_save=By.xpath( "//button[text()=' Save ']");
	 By btn_Edit=By.xpath("//div[@role='table']/div[2]//i[@class='oxd-icon bi-pencil-fill']");
	 By records=By.xpath("//div[@role='table']");
	 By comp_records=By.xpath("//div[@role='table']//div[text()='Company']");
	 By level_records=By.xpath("//div[@role='table']//div[text()='Level']");
	 By skill_records=By.xpath("//div[@role='table']//div[text()='Skill']");
	 By Lang_records=By.xpath("//div[@role='table']//div[text()='Language']");
	 By liscense_records=By.xpath("//div[@role='table']//div[text()='License Type']");
	 By memship_records=By.xpath("//div[@role='table']//div[text()='Membership']");
	 By sal_records=By.xpath("//div[@role='table']//div[text()='Salary Component']");
	 By sal_header=By.xpath("//h6[text()='Assigned Salary Components']");
	 By sup_header=By.xpath("//h6[text()='Assigned Supervisors']");
	 By sub_header=By.xpath("//h6[text()='Assigned Subordinates']");
	 By job_header=By.xpath("//h6[text()='Job Details']");
	 By sup_records=By.xpath("//h6[text()='Assigned Supervisors']/parent::div/parent::div/following::div[3]");
	 By sub_records=By.xpath("//h6[text()='Assigned Subordinates']/parent::div/parent::div/following::div[3]");
	 By job_records=By.xpath("//form");
	 By Error_msg=By.xpath("//span[text()='Already exists']");
	 
     By klk_job=By.linkText("Job");
	 By click_JobTitle=By.xpath("//div[@class='oxd-form-row']//label[text()='Job Title']/following::div[1]");
	 By sel_TestLead1=By.xpath("//div[@role='listbox']//div/span[text()='Testlead']");
	 By click_JobCat=By.xpath("//label[text()='Job Category']/following::div[1]");
	 By sel_HOD=By.xpath("//div[@role='listbox']//div/span[text()='Head Of The Department']");
	 By click_SubUnit=By.xpath("//label[text()='Sub Unit']/following::div[1]");
	 By sel_Prom=By.xpath("//div[@role='listbox']//div/span[text()='Promotions']");
	 By click_Loc=By.xpath("//label[text()='Location']/following::div[1]");
	 By sel_Hogwarts=By.xpath("//div[@role='listbox']//div/span[text()='HOGWARTS HQ']");
	 By click_EmpStatus=By.xpath("//label[text()='Employment Status']/following::div[1]");
	 By sel_Pending=By.xpath("//div[@role='listbox']//div/span[text()='Pending']");
	 
     By btn_EmpTerm=By.xpath("//button[text()=' Terminate Employment ']");
     By Enter_TermDate=By.xpath("//label[text()='Termination Date']//ancestor::div[@class='oxd-form-row']//div[2]//input");
     By click_TermReason=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Termination Reason']/following::div[1]");
     By sel_poorperfm=By.xpath("//div[@role='listbox']//div/span[text()='Poor performance']");
	 By btn_close=By.xpath("//div[text()='Close']");
     By Enter_note=By.xpath("//form//textarea");
	 By click_SaveDoc=By.xpath("//div[@role='document']//button[text()=' Save ']");
	 By btn_EmpActive=By.xpath("//button[text()=' Activate Employment ']");
	 
	 By klk_Salary=By.linkText("Salary");
	 By btn_AddSalDetails=By.xpath("//h6[text()='Assigned Salary Components']//parent::div//button[text()=' Add ']");
	 By Enter_SalComp=By.xpath("//label[text()='Salary Component']/following::div[1]/input");
	 By Click_PayGrade=By.xpath("//label[text()='Pay Grade']/following::div[1]");
     By sel_GradXL=By.xpath("//div[@role='listbox']//div/span[text()='GradeXL']");
	 By click_PayFreq=By.xpath("//label[text()='Pay Frequency']/following::div[1]");
     By sel_month=By.xpath("//div[@role='listbox']//div/span[text()='Monthly']");
	 By click_Currency=By.xpath("//label[text()='Currency']/following::div[1]");
     By sel_Rupee=By.xpath("//div[@role='listbox']//div/span[text()='Indian Rupee']");
	 By Enter_PAmount=By.xpath("//label[text()='pim.amount']/following::div[1]/input"); 
	 
	 
	 
	 By klk_reportTo=By.linkText("Report-to");
	 By btn_AddSupervisor=By.xpath("//h6[text()='Assigned Supervisors']//parent::div//button[text()=' Add ']");
	 By Enter_Name=By.xpath("//label[text()='Name']/following::div[3]/input");
	 By firstoption=By.xpath("//div[@role='option'][1]/span");
	 By click_RepMethod=By.xpath("//label[text()='Reporting Method']/following::div[1]");
	 By sel_Emergency=By.xpath("//div[@role='listbox']//div/span[text()='Emergency']");
	 By btn_SaveSuperv=By.xpath("//h6[text()='Add Supervisor']//parent::div//button[text()=' Save ']");
	 
	 By btn_AddSubOrd=By.xpath("//h6[text()='Assigned Subordinates']//parent::div//button[text()=' Add ']");
	 By Enter_Name1=By.xpath("//h6[text()='Add Subordinate']/parent::div//label[text()='Name']/following::div[3]/input");
	 By sel_Direct=By.xpath("//div[@role='listbox']//div/span[text()='Direct']");
	 By sel_Indirect=By.xpath("//div[@role='listbox']//div/span[text()='Indirect']");
	 By btn_SaveSubord=By.xpath("//h6[text()='Add Subordinate']//parent::div//button[text()=' Save ']");
	 
	 By employee_list=By.linkText("Employee List");
	 By Enter_Ename=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Employee Name']/following::div[3]/input");
	 By btn_search=By.xpath("//button[text()=' Search ']");
	
	 By reports=By.linkText("Reports");
	 By rep_name=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Report Name']/following::div[1]/input");
	 By click_selcrit=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Selection Criteria']/following::div[1]");
	 By click_EmpName=By.xpath("//div[@role='listbox']//div/span[text()='Employee Name']");
	 By click_Disgroup=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Select Display Field Group']/following::div[1]");
	 By click_per=By.xpath("//div[@role='listbox']//div/span[text()='Personal']");
	 By click_Disfield=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Select Display Field']/following::div[1]");
	 By click_FName=By.xpath("//div[@role='listbox']//div/span[text()='Employee First Name']");
	 By plus_icon=By.xpath("//h6[text()='Display Fields']/following::div[10]//button");
	 By click_Lname=By.xpath("//div[@role='listbox']//div/span[text()='Employee Last Name']");
	 
	 
	 By click_config=By.xpath("//span[text()='Configuration ']");
	 By OptField=By.linkText("Optional Fields");
	 By switch_PDetails=By.xpath("//form/div[1]//label/span");
	 By Custfield=By.linkText("Custom Fields");
	 By Enter_CField=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Field Name']/following::div[1]/input");
	 By click_screen=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Screen']/following::div[1]");
	 By click_contacts=By.xpath("//div[@role='listbox']//div/span[text()='Emergency Contacts']");
	 By click_scrType=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Type']/following::div[1]");
	 By click_TxtorNum =By.xpath("//div[@role='listbox']//div/span[text()='Text or Number']");
	 By D_import=By.linkText("Data Import");
	 By btn_browse=By.xpath("//div[@class='oxd-file-button']");
	 String file_path="C:\\Users\\naren_000.NARENDRASAI.001\\Downloads\\importData.csv";
	 By btn_upload=By.xpath("//button[text()=' Upload ']");
	 
	 By RepMethods=By.linkText("Reporting Methods");
	 By Enter_RepName=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Name']/following::div[1]/input");
	 By TermReasons=By.linkText("Termination Reasons");
	 
	 
	 
	public PIM_page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectPIM() {
		Util.click(driver, select_PIM,"PIM option");
		
	}
	public void ValidatePIMPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='PIM']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"PIM page is opened");	
		}
		else
			ReportFile.failTest(driver,"PIM page is not opened");
	}
	
	public void AddEmployee(String firstname,String middlename,String lastname,String username,String password,String EMPid) {
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_FirstName, firstname, "Employee Firstname");
		Util.sendkeys(driver, Enter_MiddleName, middlename,"Employee Middlename");
		Util.sendkeys(driver, Enter_LastName, lastname,"Employee Lastname");
		Util.Hardwait(1);
		Util.sendkeys(driver, emp_id, EMPid, "Employee id");
		Util.click(driver, btn_LoginCreate,"Login create Switch");
		Util.sendkeys(driver, create_username, username, "New Username");
		Util.sendkeys(driver, create_password,password,"New Password");
		Util.sendkeys(driver, confirm_password,password,"Confirm New Password");
		Util.click(driver, btn_save, "save button");
		Util.Hardwait(5);
		Util.click(driver, employee_list,"Employee list in Tab");
		String Ename=firstname+" "+middlename+" "+lastname;
		Util.sendkeys(driver,Enter_Ename, Ename,"Search name");
		Util.click(driver, btn_search,"Search button");
		Util.Hardwait(1);
		Util.CheckRecords(driver, records, "Records");
		
	}
	
	public void EditEmployee1(String Ename,String Tdate,String Note,String amount,String comment) {
		Util.click(driver, employee_list,"Employee list in Tab");
		Util.sendkeys(driver,Enter_Ename, Ename,"Search name");
		Util.click(driver, btn_search,"Search button");	
		
		Util.click(driver, btn_Edit, "Edit button");
		
		Util.click(driver, klk_job, "Job in Menu");
		Util.click(driver, click_JobTitle, "Job Title");
    	Util.click(driver, sel_TestLead1, "TestLead option");
    	Util.click(driver, click_JobCat, "Job category");
    	Util.click(driver, sel_HOD, "Head Of The Department option");
    	Util.click(driver, click_SubUnit, "SubUnit");
    	Util.click(driver, sel_Prom, "Promotions in options");
    	Util.click(driver, click_Loc, "Location");
		Util.click(driver, sel_Hogwarts,"Hogwarts");
		Util.click(driver, click_EmpStatus, "Employee status");
		Util.click(driver, sel_Pending, "Pending");
		Util.click(driver, btn_save, "save button");
		Util.Hardwait(5);
	    Util.CheckRecords(driver, job_header, "Records");
	    Util.Hardwait(2);
		 
		Util.click(driver, btn_EmpTerm, "Terminate Employement button");
		Util.sendkeys(driver, Enter_TermDate, Tdate, "Termination Date");
		Util.click(driver, btn_close, "Close button");
		Util.click(driver, click_TermReason, "Termination Reason");
        Util.click(driver, sel_poorperfm, "Poor Performance");
        Util.sendkeys(driver, Enter_note, Note, "Note");
        Util.click(driver, click_SaveDoc, "Save button");
        Util.Hardwait(10);
        
        Util.CheckRecords(driver, btn_EmpActive, "Records");
        Util.Hardwait(2);
        Util.click(driver, btn_EmpActive, "Activate/Terminate Employement button");
        Util.Hardwait(5);
        
        
		Util.click(driver, klk_Salary, "Salary in Menu");
        Util.click(driver, btn_AddSalDetails, "ADD Assigned Salary Components");
        Util.sendkeys(driver, Enter_SalComp, Tdate, "Salary Component");
        Util.click(driver, Click_PayGrade, "PayGrade");
        Util.click(driver, sel_GradXL, "Grade XL Option");
        Util.click(driver, click_PayFreq, "Pay Frequency");
        Util.click(driver, sel_month, "Monthly Option");
        Util.click(driver, click_Currency, "Currency");
        Util.click(driver, sel_Rupee, "Indian Rupee Option");
        Util.sendkeys(driver, Enter_PAmount, amount, "PIM amount");
        Util.sendkeys(driver, Enter_note, comment , "Comments");
		Util.click(driver, btn_save, "save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, sal_header, "Records");
		Util.Hardwait(2);  
	}
	
	public void AddSupervisor(String SupName) {
		Util.click(driver, klk_reportTo, "ReportTo In Menu");
        Util.click(driver, btn_AddSupervisor, "Add Assigned Supervisor Button");
        Util.sendkeys(driver, Enter_Name, SupName, "Supervisor Name");
        Util.click(driver, firstoption, "First Hint");
        Util.click(driver, click_RepMethod, "Reporting Method");
        Util.click(driver, sel_Emergency, "Emergency option");
        Util.click(driver, btn_SaveSuperv, "save button");
        Util.Hardwait(5);
		Util.CheckRecords(driver, sup_header, "Records");
		Util.Hardwait(2);
        
		
	}
	public void AddSubordinateDirect(String SubName) {
		Util.click(driver, klk_reportTo, "ReportTo In Menu");
        Util.click(driver, btn_AddSubOrd, "Add Assigned Subordinate Button");
        Util.sendkeys(driver, Enter_Name1, SubName, "Subordinate Name");
        Util.click(driver, firstoption, "First Hint");
        Util.click(driver, click_RepMethod, "Reporting Method");
        Util.click(driver, sel_Direct, "Direct option");
        Util.click(driver, btn_SaveSubord, "save button");  
        Util.Hardwait(5);
		Util.CheckRecords(driver, sub_records, "Records");
	    Util.Hardwait(2);
		 
	}
	public void AddSubordinateInDirect(String SubName) {
	    Util.click(driver, klk_reportTo, "ReportTo In Menu");
        Util.click(driver, btn_AddSubOrd, "Add Assigned Subordinate Button");
        Util.sendkeys(driver, Enter_Name1, SubName, "Subordinate Name");
        Util.click(driver, firstoption, "First Hint");
        Util.click(driver, click_RepMethod, "Reporting Method");
        Util.click(driver, sel_Indirect, "InDirect option");
        Util.click(driver, btn_SaveSubord, "save button");  
        Util.Hardwait(5);
		Util.CheckRecords(driver, sub_records, "Records");
		Util.Hardwait(2);
		
	}
		
		
		public void reports(String Repname) {
				
		Util.click(driver, reports, "Reports in Tab");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, rep_name, Repname, "Report Name");
		Util.click(driver, click_selcrit, "Selection Criteria dropdown");
		Util.click(driver, click_EmpName, "Employee Name");
		Util.click(driver, click_Disgroup, "Display Field Group");
		Util.click(driver, click_per, "Personal");
		Util.click(driver, click_Disfield, "Display Field");
		Util.click(driver, click_FName, "First Name");
		Util.click(driver, plus_icon, "Plus icon");
		Util.click(driver, click_Disfield, "Display Field");
		Util.click(driver, click_Lname, "Last Name");
		Util.click(driver, btn_save, "save button");
		Util.Hardwait(5);
		Util.click(driver, reports, "Reports in Tab");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
		}
		
		public void configurationdetails(String CFname,String Repname,String reason) {
		Util.click(driver, click_config, "Configuration in tab");
		Util.click(driver, OptField, "Optional fields in dropdown");
		Util.click(driver, switch_PDetails, "Personal details switch");
		Util.click(driver, btn_save, "save button");
		Util.click(driver, switch_PDetails, "Personal details switch");
		Util.click(driver, btn_save, "save button");
		
		Util.click(driver, click_config, "Configuration in tab");
		Util.click(driver, Custfield, "Custom fields in dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_CField, CFname, "Field Name");
		Util.click(driver, click_screen, "Screen");
		Util.click(driver, click_contacts, "Emergency Contacts in dropdown");
		Util.click(driver, click_scrType, "Type");
		Util.click(driver, click_TxtorNum, "Text or Number");
		Util.click(driver, btn_save, "save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
		/*Util.click(driver, click_config, "Configuration in tab");
		Util.click(driver, D_import, "Data imports");
		Util.click(driver, btn_browse, "Browse button");
		Util.sendkeys(driver, Custfield, CFname, CFname);*/
		
		Util.click(driver, click_config, "Configuration in tab");
		Util.click(driver, RepMethods, "Report Methods in Dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver,Enter_RepName , Repname,"Report Name");
		Util.click(driver, btn_save, "save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, click_config, "Configuration in tab");
		Util.click(driver, TermReasons, "Termination reasons");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver,Enter_RepName , reason,"Reason");
		Util.click(driver, btn_save, "save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");	
		Util.Hardwait(2);
		}
		
		
		
	}
	


