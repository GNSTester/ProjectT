package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class MyInfoPage {
	WebDriver driver;
	String Exp_title="PIM";
	
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By btn_save=By.xpath( "//button[text()=' Save ']");
	 By employee_list=By.linkText("Employee List");
	 By Enter_Ename=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Employee Name']/following::div[3]/input");
	 By btn_search=By.xpath("//button[text()=' Search ']");
	 By select_PIM=By.xpath("//span[text()='PIM']");
	 By records=By.xpath("//div[@role='table']");
	 By comp_records=By.xpath("//div[@role='table']//div[text()='Company']");
	 By level_records=By.xpath("//div[@role='table']//div[text()='Level']");
	 By skill_records=By.xpath("//div[@role='table']//div[text()='Skill']");
	 By Lang_records=By.xpath("//div[@role='table']//div[text()='Language']");
	 By liscense_records=By.xpath("//div[@role='table']//div[text()='License Type']");
	 By memship_records=By.xpath("//div[@role='table']//div[text()='Membership']");
	 By pd_box=By.xpath("//div[@class='orangehrm-edit-employee-content']/div[1]");
	 By depend=By.xpath("//h6[text()='Assigned Dependents']/parent::div/parent::div/following::div[3]");
	
	 By select_MyInfo=By.xpath("//span[text()='My Info']");
	 
	 By klk_Personaldetails=By.linkText("Personal Details");
	 By klk_ProPic=By.xpath("//div[@class='orangehrm-edit-employee-image']//img[@alt='profile picture']");
	 By Add_Propic=By.xpath("//div[@class='oxd-form-row']//input");
	 By click_nationality=By.xpath("//label[text()='Nationality']/following::div[1]");
	 By sel_SupIndian=By.xpath("//div[@role='listbox']//div/span[text()='Super Indian']");
	 By click_MarStatus=By.xpath("//label[text()='Marital Status']/following::div[1]");
	 By sel_Single=By.xpath("//div[@role='listbox']//div/span[text()='Single']");
	 By click_BloodType=By.xpath("//label[text()='Blood Type']/following::div[1]");
	 By switch_male=By.xpath("//label[text()='Male']//span");
	 By switch_yes=By.xpath("//label[text()='Yes']//span");
	 By sel_Oplus=By.xpath("//div[@role='listbox']//div/span[text()='O+']");
	 By sel_Bplus=By.xpath("//div[@role='listbox']//div/span[text()='B+']");
	 By btn_PdSave=By.xpath("//h6[text()='Personal Details']//parent::div//button[text()=' Save ']");
	 By btn_CfSave=By.xpath("//h6[text()='Custom Fields']//parent::div//button[text()=' Save ']");
	 By btn_AddAttach=By.xpath("//h6[text()='Attachments']//parent::div//button[text()=' Add ']");
	 
	 By klk_ContactDetails=By.linkText("Contact Details");
	 By Enter_city=By.xpath("//label[text()='City']/following::div[1]/input");
     By click_country=By.xpath("//label[text()='Country']/following::div[1]");
     By sel_India=By.xpath("//div[@role='listbox']//div/span[text()='India']");
     By Enter_MobNum=By.xpath("//label[text()='Mobile']/following::div[1]/input");
     By Enter_WorkEmail=By.xpath("//label[text()='Work Email']/following::div[1]/input");
     By btn_CdSave=By.xpath("//h6[text()='Contact Details']//parent::div//button[text()=' Save ']");
     
     By klk_EmerContacts=By.linkText("Emergency Contacts");
     By btn_addEmerContacts=By.xpath("//h6[text()='Assigned Emergency Contacts']//parent::div//button[text()=' Add ']");
     By Enter_ImpContacts=By.xpath("//label[text()='Important Contacts']/following::div[1]/input");
     By btn_SaveEmerCont=By.xpath("//h6[text()='Save Emergency Contact']//parent::div//button[text()=' Save ']");
     By btn_SaveImpCont=By.xpath("//h6[text()='Custom Fields']//parent::div//button[text()=' Save ']");
    
     
     
     By klk_dependents=By.linkText("Dependents");
     By btn_AddDependents=By.xpath("//h6[text()='Assigned Dependents']//parent::div//button[text()=' Add ']");
     By Enter_RelName=By.xpath("//label[text()='Name']/following::div[1]/input");
     By Click_Relation=By.xpath("//label[text()='Relationship']/following::div[1]");
     By sel_Other=By.xpath("//div[@role='listbox']//div/span[text()='Other']");
     By Enter_specify=By.xpath("//label[text()='Please Specify']/following::div[1]/input");
     By Enter_DOB=By.xpath("//label[text()='Date of Birth']/following::div[1]//input");
     By btn_SaveDepend=By.xpath("//h6[text()='Add Dependent']//parent::div//button[text()=' Save ']");
    
     
     By klk_immigration=By.linkText("Immigration");
     
    
     
     By klk_Salary=By.linkText("Salary");
     
     By klk_TaxExem=By.linkText("Tax Exemptions");
     
     By klk_reportTo=By.linkText("Report-to");
     
     By klk_job=By.linkText("Job");
     
     By klk_Qualifications=By.linkText("Qualifications");
     By btn_AddWorkExp=By.xpath("//h6[text()='Work Experience']//parent::div//button[text()=' Add ']");
     By Enter_Compname=By.xpath("//label[text()='Company']/following::div[1]/input");
     By Enter_JobTitle=By.xpath("//label[text()='Job Title']/following::div[1]/input");
     By btn_SaveExp=By.xpath("//h6[text()='Add Work Experience']//parent::div//button[text()=' Save ']");
     By btn_AddEdu=By.xpath("//h6[text()='Education']//parent::div//button[text()=' Add ']");
     By click_level=By.xpath("//label[text()='Level']/following::div[1]");
     By sel_ITDegree=By.xpath("//div[@role='listbox']//div/span[text()='Degree of IT']");
     By btn_SaveEdu=By.xpath("//h6[text()='Add Education']//parent::div//button[text()=' Save ']");
     By btn_AddSkill=By.xpath("//h6[text()='Skills']//parent::div//button[text()=' Add ']");
     By click_Skill=By.xpath("//label[text()='Skill']/following::div[1]");
     By sel_Powerbi=By.xpath("//div[@role='listbox']//div/span[text()='PowerBi']");
     By btn_SaveSkill=By.xpath("//h6[text()='Add Skill']//parent::div//button[text()=' Save ']");
    
     By btn_AddLang=By.xpath("//h6[text()='Languages']//parent::div//button[text()=' Add ']");
     By click_Fluency=By.xpath("//div[@class='oxd-layout-context']//label[text()='Fluency']/following::div[1]");
     By click_Fluency1=By.cssSelector("form.oxd-form>div:nth-child(1)>div>div:nth-child(2)>div>div:nth-child(2)");
     By sel_speak=By.xpath("//div[@role='listbox']//div/span[text()='Speaking']");
     By click_Lang=By.xpath("//label[text()='Language']/following::div[1]");
     By click_Lang1=By.cssSelector("form.oxd-form>div:nth-child(1)>div>div:nth-child(1)>div>div:nth-child(2)");
     By sel_telugu=By.xpath("//div[@role='listbox']//div/span[text()='Telugu']");
     By click_competency=By.xpath("//label[text()='Competency']/following::div[1]");
     By click_competency1=By.cssSelector("form.oxd-form>div:nth-child(1)>div>div:nth-child(3)>div>div:nth-child(2)");
     By sel_MotherTong=By.xpath("//div[@role='listbox']//div/span[text()='Mother Tongue']");
     By btn_Savelang=By.xpath("//h6[text()='Add Language']//parent::div//button[text()=' Save ']");
     
     By btn_AddLicense=By.xpath("//h6[text()='License']//parent::div//button[text()=' Add ']");
     By click_Liscencetype=By.xpath("//label[text()='License Type']/following::div[1]");
     By sel_CertExpert=By.xpath("//div[@role='listbox']//div/span[text()='Certified Expert(CE)']");
     By btn_SaveLicense=By.xpath("//h6[text()='Add License']//parent::div//button[text()=' Save ']");
     
     By klk_Memberships=By.linkText("Memberships");
     By Add_mebership=By.xpath("//h6[text()='Assigned Memberships']//parent::div//button[text()=' Add ']");
     By click_memberShip=By.xpath("//label[text()='Membership']/following::div[1]");
     By sel_EMA=By.xpath("//div[@role='listbox']//div/span[text()='Expert Members Association(EMA)']");
     By btn_SaveMember=By.xpath("//h6[text()='Add Membership']//parent::div//button[text()=' Save ']");
     
     By Depeden_header=By.xpath("//h6[text()='Assigned Dependents']");
     By qualific_header=By.xpath("//h6[text()='Qualifications']");
     By educa_header=By.xpath("//h6[text()='Education']");
     By skill_head=By.xpath("//h6[text()='Skills']");
     By lang_head=By.xpath("//h6[text()='Languages']");
     By lisc_head=By.xpath("//h6[text()='License']");
     By memb_head=By.xpath("//h6[text()='Assigned Memberships']");
    
     
	public MyInfoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectMyInfo() {
		Util.click(driver, select_MyInfo,"MyInfo option");
		
	}
	public void ValidateMyInfotPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='PIM']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"MyInfo page is opened");
			
		}
		else
			ReportFile.failTest(driver,"MyInfo page is not opened");	
	}
	public void UpdateDetails(String DOB,String City,String Mobile,String Email,String ImpCont,String Relation,String RelType,String company,String JobTitle) {
		
		Util.click(driver, klk_ProPic, "ProfilePicButton");
		Util.uploadFile(driver, Add_Propic,"\\sherlock.jpg");
		Util.click(driver, btn_save, "Save Button");
		Util.Hardwait(3);
		Util.click(driver, klk_Personaldetails, "Personal details in Menu");
		Util.click(driver, click_nationality, "Nationality");
		Util.click(driver, sel_SupIndian, "Super Indian");
		Util.click(driver, click_MarStatus, "Marital Status");
		Util.click(driver, sel_Single, "Single");
		Util.sendkeys(driver, Enter_DOB, DOB, "Date of Birth");
		Util.click(driver, switch_male, "Male Switch");
		Util.click(driver, switch_yes, "Yes switch");
		Util.click(driver, btn_PdSave, "save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, pd_box, "Records");
		Util.Hardwait(2);
		Util.click(driver, click_BloodType, "BloodType");
		Util.click(driver, sel_Oplus, "O+VE");
		Util.click(driver, btn_CfSave, "Save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, btn_CfSave, "Records");
		Util.Hardwait(2);
        
		Util.click(driver, select_MyInfo,"MyInfo option");
		Util.click(driver, klk_ContactDetails, "Contact details Menu");
		Util.Hardwait(1);
		Util.sendkeys(driver, Enter_city, City, "City Name");
		Util.Hardwait(1);
		Util.click(driver, click_country, "Country");
		Util.click(driver, sel_India, "India");
		Util.sendkeys(driver, Enter_MobNum, Mobile, "Mobile number");
		Util.sendkeys(driver, Enter_WorkEmail, Email, "Email address");
		Util.click(driver, btn_CdSave, "Save Button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, pd_box, "Records");
		Util.Hardwait(2);
		
	
		Util.click(driver, klk_EmerContacts, "Emeregency Contacts in Menu");
		//Util.click(driver, btn_addEmerContacts, "Add contact details button");
		Util.sendkeys(driver, Enter_ImpContacts, ImpCont, "Important Contact");
		Util.click(driver, btn_SaveImpCont, "Save Button");
		
	
		Util.click(driver, klk_dependents, "Dependents in Menu");
		Util.click(driver, btn_AddDependents, "Add dependecies button");
		Util.sendkeys(driver, Enter_RelName, Relation, "Relation");
		Util.click(driver, Click_Relation, "Relationship");
		Util.click(driver, sel_Other, "Other in option");
		Util.sendkeys(driver, Enter_specify, RelType, "Relation");
		Util.sendkeys(driver, Enter_DOB, DOB, "Date of Birth");
		Util.click(driver, btn_SaveDepend, "Save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, Depeden_header, "Records");
		Util.Hardwait(2);
		
	
		Util.click(driver, klk_immigration, "Immigration In Menu");
		
		Util.click(driver, klk_Salary, "Salary in Menu");
		
		Util.click(driver, klk_TaxExem, "Tax Exemption in Menu");
		
		Util.click(driver, klk_reportTo, "ReportTo In Menu");
		
		Util.click(driver, klk_job, "Job in Menu");
		
		Util.click(driver, klk_Qualifications, "Qualification in menu");
		Util.click(driver, btn_AddWorkExp, "Add Work experience Button");
		Util.sendkeys(driver, Enter_Compname, company, "Company Name");
		Util.sendkeys(driver, Enter_JobTitle, JobTitle, "Job Title");
		Util.click(driver, btn_SaveExp, "Save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, qualific_header, "Records");
		Util.Hardwait(2);
		Util.click(driver, btn_AddEdu, "Add Education Button");
		Util.click(driver, click_level, "Level");
		Util.click(driver, sel_ITDegree, "Degree of IT option");
		Util.click(driver, btn_SaveEdu, "Save Button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, educa_header, "Records");
		Util.Hardwait(2);
		Util.click(driver, btn_AddSkill,"Add skill Button");
		Util.click(driver, click_Skill, "Skill");
		Util.click(driver, sel_Powerbi, "PowerBI option");
		Util.click(driver, btn_SaveSkill, "Save Button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, skill_head, "Records");
		Util.Hardwait(2);
		
		
		Util.click(driver, btn_AddLang,"Add Language");
		Util.ScrollUP(driver);
		Util.click(driver, click_Lang, "Language");
		Util.click(driver, sel_telugu,"Telugu Option");
		Util.click(driver, click_Fluency, "Fluency");
		Util.click(driver, sel_speak, "Speaking option");
		Util.click(driver, click_competency, "Competency");
		Util.click(driver, sel_MotherTong,"Mother Tongue");
		Util.click(driver, btn_Savelang, "Save Button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, lang_head, "Records");
		
		Util.click(driver, btn_AddLicense, "Add License Button");
		Util.click(driver, click_Liscencetype, "License ");
		Util.click(driver, sel_CertExpert, "Certified Expert option");
		Util.click(driver, btn_SaveLicense, "Save Button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, lisc_head, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, klk_Memberships, "Membership in Menu");
		Util.click(driver, Add_mebership, "Add Membership Button");
		Util.click(driver, click_memberShip, "Membership ");
		Util.click(driver, sel_EMA, "EMA option");
		Util.click(driver, btn_SaveMember, "Save Button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, memb_head, "Records");
		Util.Hardwait(2);
			
	}
 public void VerifyEmployeeRecord(String Ename) {
	 Util.click(driver, select_PIM,"PIM option");
	 Util.click(driver, employee_list,"Employee list in Tab");
		Util.sendkeys(driver,Enter_Ename, Ename,"Search name");
		Util.click(driver, btn_search,"Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
 }
}
