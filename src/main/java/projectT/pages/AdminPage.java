package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class AdminPage {
	WebDriver driver;
	String Exp_title="Admin";
	 By select_admin=By.xpath("//span[text()='Admin']");
	 
	 By btn_search=By.xpath("//button[text()=' Search ']");
	 By records=By.xpath("//div[@role='table']");
	 By Gen_info=By.xpath("//div[@class='orangehrm-card-container']");
	 By struct_info=By.xpath("//div[@class='orangehrm-paper-container']");
	 By Sup_ind=By.xpath("//div[@role='table']//div[text()='Super Indian']");
	 By jobTit_records=By.xpath("//div[@role='table']//div[text()='Testlead']");
	 By HOD_Cat=By.xpath("//div[@role='table']//div[text()='Head Of The Department']");
	 By powBi_Rec=By.xpath("//div[@role='table']//div[text()='PowerBi']");
	 
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By btn_add=By.xpath("//button[text()=' Add ']");
	 By click_role=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='User Role']/following::div[1]");
	 By click_status=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Status']/following::div[1]");
	 By choose_Employeerole=By.xpath("//div[@role='listbox']//div/span[text()='ESS']");
	 By choose_adminrole=By.xpath("//div[@role='listbox']//div/span[text()='Admin']");
	 By choose_EnabledStatus=By.xpath("//div[@role='listbox']//child::div[2]");
	 By emp_name=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Employee Name']/following::div[3]/input");
	 By firstoption=By.xpath("//div[@role='option'][1]/span");
	 By create_username=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Username']/following::div[1]/input");
	 By create_password=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Password']/following::div[1]/input");
	 By confirm_password=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Confirm Password']/following::div[1]/input");
	 
	 By select_jobtab =By.xpath("//span[text()='Job ']");
	 By click_jobdetails=By.linkText("Job Titles");
	 By Chk_Testlead=By.xpath("//div[@role='cell']/div[text()='Testlead']");
	 By click_paygrades=By.linkText("Pay Grades");
	 By Chk_gradeXL=By.xpath("//div[@role='cell']/div[text()='GradeXL']");
	 By click_Employmentstatus=By.linkText("Employment Status");
	 By Chk_pending=By.xpath("//div[@role='cell']/div[text()='Pending']");
	 By click_JobCategories=By.linkText("Job Categories");
	 By Chk_Hod=By.xpath("//div[@role='cell']/div[text()='Head Of The Department']");
	 By click_WorkShifts=By.linkText("Work Shifts");
	 By Emer_days=By.xpath("//div[@role='cell']/div[text()='Emergency WeekDays']");
	 By select_JobTitle=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Job Title']/following::div[1]/input");
	 By select_notes=By.xpath("//textarea[@placeholder='Add note']");
	 By btn_save=By.xpath( "//button[text()=' Save ']");
	 By select_name=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Name']/following::div[1]/input");
     By input_ShiftName=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Shift Name']/following::div[1]/input");
     By click_currency=By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]/label[text()='Currency']/following::div[1]");
	 By choose_indianrupee=By.xpath("//div[@role='listbox']//div/span[text()='INR - Indian Rupee']");
	 By select_MinSalary=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Minimum Salary']/following::div[1]/input");    
	 By select_MaxSalary=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Maximum Salary']/following::div[1]/input");
     By btn_SaveCurrency=By.xpath("//h6[text()='Add Currency']/parent::div/form/div[3]/button[text()=' Save ']"); 
     
     By select_organisation=By.xpath("//span[text()='Organization '] ");
     By click_Generalinfo=By.linkText("General Information");
     By click_Locations=By.linkText("Locations");
     By click_structure=By.linkText("Structure");
     By click_EditSwitch=By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-left']");
     By Enter_RegNum=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Registration Number']/following::div[1]/input");
     By Enter_OrgName=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Name']/following::div[1]/input");
     By click_country=By.xpath("//label[text()='Country']/following::div[1]");
     By select_CountryLoc=By.xpath("//div[@role='listbox']//div/span[text()='India']");
     By Enter_UnitId=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Unit Id']/following::div[1]/input");
     By Chk_unit007=By.xpath("//div[text()='UNIT007: Promotions']");
     
     By select_qualifications=By.xpath("//span[text()='Qualifications ']");
     By click_skills=By.linkText("Skills");
     By Chk_powerBi=By.xpath("//div[@role='cell']/div[text()='PowerBi']");
     By click_Education=By.linkText("Education");
     By Chk_ItDegree=By.xpath("//div[@role='cell']/div[text()='Degree of IT']");
     By click_Liscences=By.linkText("Licenses");
     By Chk_CE=By.xpath("//div[@role='cell']/div[text()='Certified Expert(CE)']");
     By click_Languages=By.linkText("Languages");
     By Chk_Telugu=By.xpath("//div[@role='cell']/div[text()='Telugu']");
     By click_memberships=By.linkText("Memberships");
     By Chk_EMA=By.xpath("//div[@role='cell']/div[text()='Expert Members Association(EMA)']");
     By Enter_EduLevel=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Level']/following::div[1]/input");
     
     By click_nationalites=By.linkText("Nationalities");
     By Click_page4=By.xpath("//button[text()='4']");
     By Chk_SuperIndian=By.xpath("//div[@role='cell']/div[text()='Super Indian']");
     
     By click_CorpBrand=By.linkText("Corporate Branding");
     By click_changeprimaryGradcolor=By.xpath("//label[text()='Primary Gradient Color 1']/following::div[1]");
     By Enter_color=By.xpath("//div[@role='alert']/input[@class='oxd-input oxd-input--active']");
     By click_changeprimarycolor=By.xpath("//label[text()='Primary Color']/following::div[1]");
     By btn_publish=By.xpath("//button[text()=' Publish ']");
     
     By Select_config=By.xpath("//span[text()='Configuration ']");
     By click_EmailConfig=By.linkText("Email Configuration");
     By click_Esub=By.linkText("Email Subscriptions");
     By click_local=By.linkText("Localization");
     By click_LangPack=By.linkText("Language Packages");
     By click_Modules=By.linkText("Modules");
     By click_SocMedAuth=By.linkText("Social Media Authentication");
     By click_RegOAuth=By.linkText("Register OAuth Client");
     By click_LConfig=By.linkText("LDAP Configuration");
     By switch_Sendmail=By.xpath("//div[@class=\"oxd-input-group\"]//label[text()='Sendmail']//span");
     By Switch_TestMail=By.xpath("//p[text()='Send Test Mail']/parent::div[@class=\"orangehrm-optional-field-row\"]//span");
     By Enter_TestMail=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Test Email Address']/following::div[1]/input");
     By click_ApplyLeave=By.xpath("//div[text()='Leave Applications']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//div//button");
     By switch_ApplyLeave=By.xpath("//div[text()='Leave Applications']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//div//label/span");
     By Enter_Mail=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Email']/following::div[1]/input");
     By click_english=By.xpath("//div[@role='listbox']//div/span[text()='English (United States)']");
     By click_german=By.xpath("//div[@role='listbox']//div/span[text()='German - Deutsch']");
     By click_DateFormat=By.xpath("//div[@role='listbox']//div/span[contains(text(),'yyyy-mm-dd')]");
     By btn_Germansave=By.xpath( "//button[text()=' Speichern ']");
     By select_lang=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Sprache']/following::div[1]");
     By select_inGerman =By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Language']/following::div[1]");
     By select_Dateformat=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Date Format']/following::div[1]");
     By click_telugu=By.xpath("//div[@role='listbox']//div/span[text()='Telugu (India) - తెలుగు (భారతదేశం)']");
     By Chk_Telugupack=By.xpath("//div[@role='cell']/div[text()='Telugu (India) - తెలుగు (భారతదేశం)']");
     By lang_name=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Name']/following::div[1]");
     By Enter_RedUrl=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Redirect URI']/following::div[1]/input");
     By Chk_OrangHrmFb=By.xpath("//div[@role='cell']/div[text()='OrangeHRM_facebook']");
     
	public AdminPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectAdmin() {
		Util.click(driver, select_admin,"Admin option");
		
	}
	public void ValidateAdminPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Admin']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Admin page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Admin page is not opened");
		
	}
	
	public void add_Employee(String EmpName,String username,String password) {
		Util.click(driver, btn_add,"add button");
		Util.click(driver, click_role," select role");
		Util.click(driver, choose_Employeerole,"Employee in dropdown");
		Util.click(driver, click_status, "select status");
		Util.click(driver, choose_EnabledStatus,"Enabled in dropdown");
		Util.sendkeys(driver, emp_name, EmpName,"Employee name");
		Util.sendkeys(driver, create_username, username,"username");
		Util.sendkeys(driver, create_password,password,"password");
		Util.sendkeys(driver, confirm_password,password,"confirm password");
		Util.click(driver, btn_save,"save button");
		
	}
	
	
	public void add_admin_or_ESS(String EmpName,String username,String password,String role,String status) {
		Util.click(driver, btn_add,"add button");
		Util.click(driver, click_role," select role");
		Util.SelectOption(driver, option,role);
//		Util.click(driver, choose_adminrole,"admin in dropdown");
		Util.click(driver, click_status, "select status");
	    Util.SelectOption(driver, option,status);
//		Util.click(driver, choose_EnabledStatus,"Enabled in dropdown");
		Util.sendkeys(driver, emp_name, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.sendkeys(driver, create_username, username,"username");
		Util.sendkeys(driver, create_password,password,"password");
		Util.sendkeys(driver, confirm_password,password,"confirm password");
		Util.click(driver, btn_save,"save button");	
		
	}
	
	
	public void JobDetails(String input,String text,String name,String EmpStatus,String HOD,String shift,String minsal,String maxsal) {
	Util.click(driver, select_jobtab,"job option");	
	Util.click(driver, click_jobdetails,"job details in job dropdown");
	Util.click(driver, btn_add,"add button");
	Util.sendkeys(driver, select_JobTitle,input,"job title");
	Util.sendkeys(driver, select_notes,text,"in add notes");
	Util.click(driver, btn_save,"save button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, jobTit_records, "Records");
	Util.Hardwait(2);
	
	Util.click(driver, select_jobtab,"job option");
	Util.click(driver, click_paygrades,"Pay grades in job dropdown");
	Util.click(driver, btn_add,"add button");
    Util.sendkeys(driver, select_name,name,"Grade Name field ");
    Util.click(driver, btn_save,"save button");
	Util.click(driver, btn_add,"add button");
	Util.click(driver, click_currency, "Currency dropdown");
	Util.click(driver, choose_indianrupee,"Indian Rupee option in list");
	Util.click(driver, btn_save,"save button");
	Util.sendkeys(driver, select_MinSalary, minsal,"Minimmum Salary");
	Util.sendkeys(driver, select_MaxSalary, maxsal,"Maximmum Salary");
	Util.click(driver, btn_SaveCurrency,"add currency save button");
	Util.click(driver, select_jobtab,"job option");
	Util.click(driver, click_paygrades,"Pay grades in job dropdown");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);

	Util.click(driver, select_jobtab,"job option");	
	Util.click(driver, click_Employmentstatus,"Employee status in job dropdown");
	Util.click(driver, btn_add,"add button");
	Util.sendkeys(driver,select_name, EmpStatus, "Employment status");
	Util.click(driver, btn_save,"save button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
	
	Util.click(driver, select_jobtab,"job option");	
	Util.click(driver, click_JobCategories,"Job Category in job dropdown");
	Util.click(driver, btn_add,"add button");
	Util.sendkeys(driver,select_name, HOD, "H.O.D name ");
	Util.click(driver, btn_save,"save button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, HOD_Cat, "Records");
	Util.Hardwait(2);
	
	Util.click(driver, select_jobtab,"job option");
	Util.click(driver, click_WorkShifts,"workshift in job dropdown");
	Util.click(driver, btn_add,"add button");
	Util.sendkeys(driver, input_ShiftName, shift,"Shift name");
	Util.click(driver, btn_save,"save button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
		
	}

	
	public void OrganisationDetails(String regnum,String OrgHqName,String UnitId,String UnitName) {
    Util.click(driver, select_organisation, "Organisation in tab");
    
	Util.click(driver, click_Generalinfo,"General Information in dropdown");
	Util.click(driver, click_EditSwitch, "Edit switch button");
    Util.sendkeys(driver, Enter_RegNum, regnum, "Registration number");
    Util.ScrollDown(driver);
    Util.click(driver, btn_save,"save button");
    Util.Hardwait(5);
	Util.CheckRecords(driver, Gen_info, "Records");
	Util.Hardwait(2);
    
	Util.click(driver, select_organisation, "Organisation in tab");
    Util.click(driver, click_Locations,"Locations in dropdown");
	Util.click(driver, btn_add,"add button");
	Util.sendkeys(driver, Enter_OrgName, OrgHqName,"Organisation name");
	Util.click(driver, click_country,"Country Dropdown");
	Util.click(driver, select_CountryLoc,"Location");
	Util.click(driver, btn_save,"save button");
	Util.click(driver, select_organisation, "Organisation in tab");
    Util.click(driver, click_Locations,"Locations in dropdown");
    Util.click(driver, click_country,"Country Dropdown");
	Util.click(driver, select_CountryLoc,"Location");
	Util.click(driver, btn_search, "Search button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
	
	
	Util.click(driver, select_organisation, "Organisation in tab");
	Util.click(driver, click_structure, "Structure in dropdown");
	Util.click(driver, click_EditSwitch, "Edit switch button");
	Util.click(driver, btn_add,"add button");
	Util.sendkeys(driver, Enter_UnitId, UnitId, "Unit id");
	Util.sendkeys(driver, Enter_OrgName, UnitName,"Organisation Unit name");
	Util.click(driver, btn_save,"save button");
	Util.ScrollDown(driver);
	Util.CheckRecords(driver,Chk_unit007,"UNITOO7:Promotions");
	Util.Hardwait(5);
	Util.CheckRecords(driver, struct_info, "Records");
	Util.Hardwait(2);
	
	}

	
	public void QualificationsDetails(String skill,String level,String license,String langauge,String membership) {
		
		Util.click(driver, select_qualifications,"Qualifications in tab");
		Util.click(driver, click_skills, "skills in dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_OrgName, skill,"skill name");
		Util.click(driver, btn_save,"save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, powBi_Rec, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, select_qualifications,"Qualifications in tab");
		Util.click(driver, click_Education, "Education in dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_EduLevel, level, "Education level");
		Util.click(driver, btn_save,"save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, Chk_ItDegree, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, select_qualifications,"Qualifications in tab");
		Util.click(driver, click_Liscences, "licenses in dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_OrgName, license,"License name");
		Util.click(driver, btn_save,"save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, Chk_CE, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, select_qualifications,"Qualifications in tab");
		Util.click(driver, click_Languages, "languages in dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_OrgName, langauge,"Language name");
		Util.click(driver, btn_save,"save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, Chk_Telugu, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, select_qualifications,"Qualifications in tab");
		Util.click(driver, click_memberships, "Memberships in dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_OrgName, membership,"Membership name");
		Util.click(driver, btn_save,"save button");	
		Util.Hardwait(5);
		Util.CheckRecords(driver, Chk_EMA, "Records");	
		Util.Hardwait(2);
	}

	
	public void NationalitiesDetails(String nationality) {
		Util.click(driver, click_nationalites,"Nationalities in tab");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_OrgName, nationality,"Nationality name");
		Util.click(driver, btn_save,"save button");
		Util.Hardwait(1);
		Util.click(driver, Click_page4, "Page4");
		Util.Hardwait(5);
		Util.CheckRecords(driver,Sup_ind, "Super Indian");
		Util.Hardwait(2);
		
	}
	
	public void CorporateBranding(String PGcolour,String Pcolour1) {
		Util.click(driver, click_CorpBrand,"Corporate Branding in Tab");
		Util.click(driver, click_changeprimaryGradcolor,"Primary Grade color");
		Util.sendkeys(driver, Enter_color, PGcolour, "Primary Grade color value ");
		Util.Hardwait(1);
        Util.click(driver, click_changeprimarycolor,"Primary color");
		Util.sendkeys(driver, Enter_color,Pcolour1, "Primary color value ");
		Util.Hardwait(1);
		Util.click(driver, btn_publish,"Publish button");
			
	}

	
public void ConfigurationDetails(String mail,String Ename,String client,String C_url) {
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_EmailConfig, "Email configuaration in Dropdown");
	Util.Hardwait(3);
	Util.click(driver, switch_Sendmail, "Send mail switch");
    Util.click(driver, Switch_TestMail,"Send Test Mail switch");
	Util.sendkeys(driver, Enter_TestMail, mail, "Test Email");
	Util.click(driver, btn_save,"save button");	
	
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_Esub, "Email subscription in Dropdown");
	Util.click(driver, switch_ApplyLeave, "Apply Leave Switch");
	Util.Hardwait(2 );
	Util.click(driver, click_ApplyLeave,"Apply leave icon");
	Util.click(driver, btn_add,"add button");
	Util.sendkeys(driver, Enter_OrgName, Ename, "Employee name");
	Util.sendkeys(driver, Enter_Mail, mail, "Email address");
	Util.click(driver, btn_save,"save button");	
	Util.Hardwait(2);
	
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_local,"Localisation in Dropdown");
	Util.click(driver, select_inGerman, "Language dropdown");
	Util.click(driver, click_german,"German option");
	Util.click(driver, select_Dateformat, "Date format dropdown");
	Util.click(driver, click_DateFormat,"Date format");
	Util.click(driver, btn_save,"save button");
	Util.click(driver, select_lang, "Language dropdown");
	Util.click(driver, click_english,"English option");
	Util.click(driver, btn_Germansave,"save button");
	Util.Hardwait(2 );
	
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_LangPack,"Language pack in dropdown");
	Util.click(driver, btn_add,"add button");
	Util.click(driver, lang_name,"Language name");
	Util.click(driver, click_telugu, "Telugu language");
	Util.click(driver, btn_save,"save button");
	Util.Hardwait(2 );
	Util.ScrollDown(driver);
	Util.CheckRecords(driver, Chk_Telugupack,"Telugu Language pack");
	Util.Hardwait(2);
	
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_Modules, "Modules in DropDown");
	
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_SocMedAuth, "Social Media Autherisation in Dropdown");
	
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_RegOAuth, "Register Oauth Client in dropdown");
	Util.click(driver, btn_add,"add button");
    Util.sendkeys(driver, Enter_OrgName, client, "Client name");
    Util.sendkeys(driver, Enter_RedUrl, C_url,"Redirecting URl");
    Util.click(driver, btn_save,"save button");
	Util.Hardwait(2 );
	Util.click(driver, Select_config, "Configuaration in Tab");
	Util.click(driver, click_RegOAuth, "Register Oauth Client in dropdown");
	Util.Hardwait(5);
	Util.CheckRecords(driver, Chk_OrangHrmFb, "OrangeHRM Facebook");
	Util.Hardwait(2);
  
    Util.click(driver, Select_config, "Configuaration in Tab");
    Util.click(driver, click_LConfig, "LCAP configurations in dropdown");
	
}

}
