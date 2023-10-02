package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class DirectoryPage {
	WebDriver driver;
	String Exp_title="Directory";
	 By select_Directory=By.xpath("//span[text()='Directory']");
	 
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By btn_add=By.xpath("//button[text()=' Add ']");
	 By btn_save=By.xpath( "//button[text()=' Save ']");
	 By btn_search=By.xpath("//button[text()=' Search ']");
	 By btn_confirm=By.xpath("//button[text()=' Confirm ']");
	 By firstoption=By.xpath("//div[@role='option'][1]/span");
	 By btn_apply=By.xpath("//button[text()=' Apply ']");
	 By btn_assign=By.xpath("//button[text()=' Assign ']");
	 By prof=By.xpath("//div[@class='orangehrm-directory-card-top']");
	 
	 By click_JobTitle=By.xpath("//label[text()='Job Title']/following::div[1]");
	 By sel_TestLead1=By.xpath("//div[@role='listbox']//div/span[text()='Testlead']");
	 By Enter_EmpName=By.xpath("//label[text()='Employee Name']/following::div[1]//input");
	 By click_Loc=By.xpath("//label[text()='Location']/following::div[1]");
	 By sel_Hogwarts=By.xpath("//div[@role='listbox']//div/span[text()='HOGWARTS HQ']");
	 By klk_Kalki=By.xpath("//p[text()='Kalki Automationwala Tester ']");
	 By btn_closebox=By.xpath("//div[@class='orangehrm-corporate-directory-sidebar']/div/div/div[1]/i");

	public DirectoryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectDirectory() {
		Util.click(driver, select_Directory,"Directory option");
		
	}
	public void ValidateDirectoryPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Directory']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Directory page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Directory page is not opened");
		
	}
	
	public void SearchInDirectory(String EmpName) {
		
		Util.sendkeys(driver, Enter_EmpName, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, click_JobTitle, "Job Title");
    	Util.click(driver, sel_TestLead1, "TestLead option");
    	Util.click(driver, click_Loc, "Location");
		Util.click(driver, sel_Hogwarts,"Hogwarts");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, klk_Kalki, "Records");
		Util.Hardwait(2);
		Util.click(driver,klk_Kalki, "Kalki Automation Tester");
		Util.Hardwait(3);
		Util.click(driver, btn_closebox, "Close icon");
		
		
	}

	

}
