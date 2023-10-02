package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class ClaimPage {
	WebDriver driver;
	String Exp_title="Claim";
	
	 By select_Claim=By.xpath("//span[text()='Claim']");
	 
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
	 By btn_SubClaim=By.xpath("//button[text()=' Submit Claim ']");
	 By records=By.xpath("//div[@role='table']");
	 
     By click_config=By.xpath("//span[text()='Configuration ']");
     By click_event=By.linkText("Events");
     By Enter_EventName=By.xpath("//label[text()='Event Name']/following::div[1]/input");
     By Enter_EventName1=By.xpath("//div[@class='oxd-autocomplete-wrapper']//input");
     By Enter_Desc=By.xpath("//form//textarea");
     By Switch_active=By.xpath("//div[@class='oxd-switch-wrapper']//span");
     By click_ExpType=By.linkText("Expense Types");
     By Enter_ExpName=By.xpath("//label[text()='Name']/following::div[1]/input");
     By Enter_ExpName1=By.xpath("//div[@class='oxd-autocomplete-wrapper']//input");
     By click_AccAndDine=By.xpath("//div[@role='listbox']//div/span[text()='Accomedation and Dining']");
     By click_AccAndTrans=By.xpath("//div[@role='listbox']//div/span[text()='Accomodation and Transportation']");
     By click_PlanSurgery=By.xpath("//div[@role='listbox']//div/span[text()='Planned Surgery']");
     
     By click_SubClaim=By.linkText("Submit Claim");
     By click_EventName=By.xpath("//label[text()='Event']/following::div[1]");
     By click_ClientMeet=By.xpath("//div[@role='listbox']//div/span[text()='ClientMeet']");
     By click_OnsiteTrip=By.xpath("//div[@role='listbox']//div/span[text()='Onsite Trips']");
     By click_MedReim=By.xpath("//div[@role='listbox']//div/span[text()='Medical Reimbursement']");

     By click_Currency=By.xpath("//label[text()='Currency']/following::div[1]");
     By click_INR=By.xpath("//div[@role='listbox']//div/span[text()='Indian Rupee']");
     By click_USD=By.xpath("//div[@role='listbox']//div/span[text()='United States Dollar']");
     By btn_AddExpense=By.xpath("//h6[text()='Expenses']//parent::div//button[text()=' Add ']");
     By click_ExpenseType=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Expense Type']/following::div[1]");
     By Enter_Date=By.xpath("//label[text()='Date']//ancestor::div[@class='oxd-form-row']/div/div[1]//input");
     By Enter_Amount=By.xpath("//label[text()='Date']//ancestor::div[@class='oxd-form-row']/div/div[2]//input");
	 By click_SaveDoc=By.xpath("//div[@role='document']//button[text()=' Save ']");

     
     By click_MyClaim=By.linkText("My Claims");
     By click_EveName=By.xpath("//label[text()='Event Name']/following::div[1]");
     
     By click_EmpClaims=By.linkText("Employee Claims");
     
     By click_AssnClaims=By.linkText("Assign Claim");
     By Enter_Ename=By.xpath("//label[text()='Employee Name']/following::div[3]/input");
     
	public ClaimPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectClaim() {
		Util.click(driver, select_Claim,"Claim option");
		
	}
	public void ValidateClaimPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Claim']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Claim page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Claim page is not opened");
		
	}
	public void ConfigAddEvent(String Event,String Desc) {
		Util.click(driver, click_config, "Configuration in Tab");
		Util.click(driver, click_event, "Events in Dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_EventName, Event, "Event Name");
		Util.sendkeys(driver, Enter_Desc, Desc, "Description");
		Util.click(driver, Switch_active, "Active switch");
		Util.click(driver, Switch_active, "Active switch");
		Util.click(driver, btn_save,"save button");	
		Util.Hardwait(5);
		
		Util.sendkeys(driver, Enter_EventName1, Event, "Event Name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}
	public void ConfigAddExpenseType(String Expense,String Desc) {
		Util.click(driver, click_config, "Configuration in Tab");
		Util.click(driver, click_ExpType, "Expense in Dropdown");
		Util.click(driver, btn_add,"add button");
		Util.sendkeys(driver, Enter_ExpName, Expense, "Expense Name");
		Util.sendkeys(driver, Enter_Desc, Desc, "Description");
		Util.click(driver, Switch_active, "Active switch");
		Util.click(driver, Switch_active, "Active switch");
		Util.click(driver, btn_save,"save button");	
		Util.Hardwait(5);
		
		Util.sendkeys(driver, Enter_ExpName1, Expense, "Expense Name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}

   public void SubmitClaim(String remark,String date,String amount) {
	Util.click(driver, click_SubClaim, "Submit Claim");
	Util.click(driver, click_EventName, "Event Name");
	Util.click(driver, click_ClientMeet, "Client Meet Option");
	Util.click(driver, click_Currency, "Currency");
	Util.click(driver, click_INR, "Indian Rupee");
	Util.sendkeys(driver, Enter_Desc, remark, "Remarks");
	Util.click(driver, btn_Create, "Create Button");
	Util.Hardwait(2);
	
	Util.click(driver, btn_AddExpense, "Add Expense Button");
	Util.click(driver, click_ExpenseType, "Expense Type");
	Util.click(driver, click_AccAndDine, "Accomidation and Dining option");
	Util.sendkeys(driver, Enter_Date, date , "Date");
	Util.sendkeys(driver, Enter_Amount, amount, "Amount");
	Util.click(driver, click_SaveDoc, "Save Button");
	Util.Hardwait(2);
	Util.click(driver, btn_submit, "Submit Button");
	Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);

   }
   
   public void MyClaims(String remark,String date,String amount) {
	   Util.click(driver, click_MyClaim, "My Claims in Tab");
	   Util.click(driver, btn_SubClaim, "Submit Claim Button");
		Util.click(driver, click_EventName, "Event Name");
		Util.click(driver, click_OnsiteTrip, "Onsite Trip Option");
		Util.click(driver, click_Currency, "Currency");
		Util.click(driver, click_USD, "US Dollar");
		Util.sendkeys(driver, Enter_Desc, remark, "Remarks");
		Util.click(driver, btn_Create, "Create Button");
		Util.Hardwait(2);
		
		Util.click(driver, btn_AddExpense, "Add Expense Button");
		Util.click(driver, click_ExpenseType, "Expense Type");
		Util.click(driver, click_AccAndTrans, "Accomidation and Transport option");
		Util.sendkeys(driver, Enter_Date, date , "Date");
		Util.sendkeys(driver, Enter_Amount, amount, "Amount");
		Util.click(driver, click_SaveDoc, "Save Button");
		Util.Hardwait(2);
		Util.click(driver, btn_submit, "Submit Button");
		Util.Hardwait(5);
		
		Util.click(driver, click_MyClaim, "My Claims in Tab");
		Util.click(driver, click_EveName, "Event Name");
		Util.click(driver, click_ClientMeet, "Client Meet Option");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(4);
		Util.click(driver, click_MyClaim, "My Claims in Tab");
		Util.click(driver, click_EveName, "Event Name");
		Util.click(driver, click_OnsiteTrip, "Onsite Trip Option");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
   }
   public void AssignClaim(String remark,String date,String amount,String Ename) {
	   Util.click(driver,click_AssnClaims, "Assign Claims in Tab");
	   Util.sendkeys(driver, Enter_Ename, Ename, "Employee Name");
	   Util.click(driver, firstoption, "First Hint");
		Util.click(driver, click_EventName, "Event Name");
		Util.click(driver, click_MedReim, "Medical Reimbersment Option");
		Util.click(driver, click_Currency, "Currency");
		Util.click(driver, click_INR, "Indian Rupee");
		Util.sendkeys(driver, Enter_Desc, remark, "Remarks");
		Util.click(driver, btn_Create, "Create Button");
		Util.Hardwait(2);
		
		Util.click(driver, btn_AddExpense, "Add Expense Button");
		Util.click(driver, click_ExpenseType, "Expense Type");
		Util.click(driver, click_PlanSurgery, "Planned Surgery");
		Util.sendkeys(driver, Enter_Date, date , "Date");
		Util.sendkeys(driver, Enter_Amount, amount, "Amount");
		Util.click(driver, click_SaveDoc, "Save Button");
		Util.Hardwait(2);
		Util.click(driver, btn_submit, "Submit Button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records"); 
		Util.Hardwait(2);
}
   public void EmployeeClaims(String Ename) {
	  Util.click(driver, click_EmpClaims, "Employee Claims"); 
	  Util.sendkeys(driver, Enter_Ename, Ename, "Employee Name");
	  Util.click(driver, firstoption, "First Hint");  
	  Util.click(driver, btn_search, "Search button");
	  Util.ScrollDown(driver);
	  Util.Hardwait(5);
	Util.CheckRecords(driver, records, "Records");
	Util.Hardwait(2);
   }
}