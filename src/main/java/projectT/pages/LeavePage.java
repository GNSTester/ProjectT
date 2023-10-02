package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class LeavePage {
	WebDriver driver;
	String Exp_title="Leave";
	
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By btn_add=By.xpath("//button[text()=' Add ']");
	 By btn_save=By.xpath( "//button[text()=' Save ']");
	 By btn_search=By.xpath("//button[text()=' Search ']");
	 By btn_confirm=By.xpath("//button[text()=' Confirm ']");
	 By firstoption=By.xpath("//div[@role='option'][1]/span");
	 By btn_apply=By.xpath("//button[text()=' Apply ']");
	 By btn_assign=By.xpath("//button[text()=' Assign ']");
	 By records=By.xpath("//div[@role='table']");
	 
	 By select_Leave=By.xpath("//span[text()='Leave']");
	 
	 By click_apply=By.linkText("Apply");
	 By FR_date=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='From Date']/following::div[3]/input");
	 By To_date=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='To Date']/following::div[3]/input");
	 By com_box=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Comments']/following::div[1]/textarea");
	 By Part_days1=By.xpath("//label[text()='Partial Days']/following::div[1]");
	 By Part_days=By.cssSelector("form.oxd-form>div:nth-child(3)>div>div>div>div:nth-child(2)>div");
	 By AsnPart_days=By.cssSelector("form.oxd-form>div:nth-child(4)>div>div>div>div:nth-child(2)>div");
	 
	 By sel_AllDays=By.xpath("//div[@role='listbox']//div/span[text()='All Days']");
	 By sel_StartDay=By.xpath("//div[@role='listbox']//div/span[text()='Start Day Only']");
	 By sel_EndDay=By.xpath("//div[@role='listbox']//div/span[text()='End Day Only']");
	 By Start_EndDay=By.xpath("//div[@role='listbox']//div/span[text()='Start and End Day']");
	 By Duration=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Duration']/following::div[1]");
	 By Start_day=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Start Day']/following::div[1]");
	 By HD_morning=By.xpath("//div[@role='listbox']//div/span[text()='Half Day - Morning']");
	 By HD_Noon=By.xpath("//div[@role='listbox']//div/span[text()='Half Day - Afternoon']");
	 By sel_SpecTime=By.xpath("//div[@role='listbox']//div/span[text()='Specify Time']");
	 By Enter_Htime=By.xpath("//div[@role='alert']//input[@class='oxd-input oxd-input--active oxd-time-hour-input-text']");
	 By Enter_MinTime=By.xpath("//div[@role='alert']//input[@class=\"oxd-input oxd-input--active oxd-time-minute-input-text\"]");
	 By btn_AM=By.xpath("//div[@role='alert']//label[text()='AM']");
	 By btn_PM=By.xpath("//div[@role='alert']//label[text()='PM']");
	 By btn_close=By.xpath("//div[text()='Close']");
	 
	 By click_configure=By.xpath("//span[text()='Configure ']");
	 By leave_period=By.linkText("Leave Period"); 
	 By klk_StartMonth=By.xpath("//label[text()='Start Month']/following::div[1]");
	 By sel_may=By.xpath("//div[@role='listbox']//div/span[text()='May']");
	 By sel_jan=By.xpath("//div[@role='listbox']//div/span[text()='January']");
	 By klk_Startdate=By.xpath("//label[text()='Start Date']/following::div[1]");
	 By sel_day01=By.xpath("//div[@role='listbox']//div/span[text()='01']");
	 By sel_day04=By.xpath("//div[@role='listbox']//div/span[text()='04']");
	 By leave_type=By.linkText("Leave Types");
	 By Enter_Name=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Name']/following::div[1]/input");
	 By switch_no=By.xpath("//label[text()='No']");
	 By switch_Yes=By.xpath("//label[text()='Yes']");
	 By work_week=By.linkText("Work Week");
	 By klk_Satday=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Saturday']/following::div[1]");
	 By sel_FullDay=By.xpath("//div[@role='listbox']//div/span[text()='Full Day']");
	 By sel_HalfDay=By.xpath("//div[@role='listbox']//div/span[text()='Half Day']");
	 By holidays=By.linkText("Holidays");
	 By Enter_Date=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Date']/following::div[3]/input");
	// By Full_Half01=By.cssSelector("form.oxd-form>div:nth-child(1)>div:nth-child(1)>div:nth-child(3)>div>div:nth-child(2)>div");
	 By Full_Half=By.xpath("//label[text()='Full Day/ Half Day']/following::div[1]");
	// By Full_Half=By.xpath("//form//div[3]");
	 By Enter_Fdate=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='From']/following::div[3]/input");
	 By Enter_TOdate=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='To']/following::div[3]/input");
	 
	 
	 By click_Myleave=By.linkText("My Leave");
	 By txt_PSBR=By.xpath("//div[text()='Post Surgery Bed Rest']/parent::div/preceding::div[1]"); 
	 By txt_F_Emergency=By.xpath("//div[text()='Family Emergency']/parent::div/preceding::div[1]");
	 By txt_P_Leaves=By.xpath("//div[text()='Paid leaves']/parent::div/preceding::div[1]");
	 By txt_DigDet=By.xpath("//div[text()='Digital Detox']/parent::div/preceding::div[1]");
	 
	 By click_Entitle=By.xpath("//span[text()='Entitlements ']");
	 By add_entitle=By.linkText("Add Entitlements");
     By clk_LevPeriod=By.xpath("//label[text()='Leave Period']/following::div[1]//i");
     By select=By.xpath("//div[@role='listbox']//div[text()='-- Select --']");
     By select_2022=By.xpath("//div[@role='listbox']//div/span[text()='2022-01-01 - 2022-12-31']");
     By select_2023=By.xpath("//div[@role='listbox']//div/span[text()='2023-01-01 - 2023-12-31']");
     By Enter_Entitlements=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Entitlement']/following::div[1]/input");
     By emp_entitle=By.linkText("Employee Entitlements");
	 By My_entitle=By.linkText("My Entitlements");
	 
	 By click_Reports=By.xpath("//span[text()='Reports ']");
	 By LEU_report=By.linkText("Leave Entitlements and Usage Report");
	 By switch_Employee= By.xpath("//label[text()='Employee']");
	 By MyLeu_report=By.linkText("My Leave Entitlements and Usage Report");
	 By btn_generate=By.xpath("//button[text()=' Generate ']");
	 
	
	 
	 By Leavelist=By.linkText("Leave List");
	 By btN_appPSBR=By.xpath("//div[text()='Post Surgery Bed Rest']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button[text()=' Approve ']");
	 By btN_rejPSBR=By.xpath("//div[text()='Post Surgery Bed Rest']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button[text()=' Reject  ']");
	 By icon_PBSR=By.xpath("//div[text()='Post Surgery Bed Rest']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button/i");
	 By cancel_PBSR=By.xpath("//div[text()='Post Surgery Bed Rest']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//p[text()='Cancel Leave']");
	 By btn_appF_emer=By.xpath("//div[text()='Family Emergency']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button[text()=' Approve ']");
	 By btn_rejF_emer=By.xpath("//div[text()='Family Emergency']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button[text()=' Reject  ']");
	 By icon_F_emer=By.xpath("//div[text()='Family Emergency']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button/i");
	 By cancel_F_emer=By.xpath("//div[text()='Family Emergency']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//p[text()='Cancel Leave']");
	 By btn_DigDet=By.xpath("//div[text()='Digital Detox']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button[text()=' Approve ']");
	 By btn_rejDigDet=By.xpath("//div[text()='Digital Detox']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button[text()=' Reject ']");
	 By icon_DigDit=By.xpath("//div[text()='Digital Detox']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//button/i");
	 By cancel_DigDit=By.xpath("//div[text()='Digital Detox']/ancestor::div[@class=\"oxd-table-row oxd-table-row--with-border\"]//p[text()='Cancel Leave']");
	
	 
	 
	 By asn_leave=By.linkText("Assign Leave");
	 By Enter_Ename=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Employee Name']/following::div[3]/input");
	 By click_LeaveType=By.xpath("//div[@class='oxd-input-group__label-wrapper']/label[text()='Leave Type']/following::div[1]");
	 By click_vac=By.xpath("//div[@role='listbox']//div/span[text()='CAN - Vacation']");
	 By click_emergency=By.xpath("//div[@role='listbox']//div/span[text()='Emergency']");
	 By click_medical=By.xpath("//div[@role='listbox']//div/span[text()='Medical']");
	 
	 
	 public LeavePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectLeave() {
		Util.click(driver, select_Leave,"Leave option");
		
	}
	public void ValidateLeavePage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Leave']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Leave page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Leave page is not opened");
		
	}
	
	public void ConfigureDetails(String L_Emergency,String L_medical,String Holiday1,String H_Date,String F_Date,String T_Date) {
		Util.click(driver, click_configure, "Configuration in Tab");
		Util.click(driver, leave_period, "Leave period in Dropdown");
		Util.click(driver, klk_StartMonth, "Start month");
		Util.click(driver, sel_may, "May month");
		Util.click(driver, klk_StartMonth, "Start month");
		Util.click(driver, sel_jan, "january month");
		Util.click(driver, klk_Startdate, "Start date");
		Util.click(driver, sel_day04, "Day 04");
		Util.click(driver, klk_Startdate, "Start date");
		Util.click(driver, sel_day01, "Day 01");
		Util.click(driver, btn_save, "Save button");
		
		Util.click(driver, click_configure, "Configuration in Tab");
		Util.click(driver, leave_type, "Leave types in Dropdown");
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_Name, L_Emergency, "Leave type name");
		Util.click(driver, switch_no, "No switch");
		Util.click(driver, btn_save, "Save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
		Util.ScrollTo(driver, click_configure);
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_Name, L_medical, "Leave type name");
		Util.click(driver, switch_no, "No switch");
		Util.click(driver, btn_save, "Save button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
		Util.click(driver, click_configure, "Configuration in Tab");
		Util.click(driver, work_week, "Work week in Dropdown");
		Util.click(driver, klk_Satday, "Saturday");
		Util.click(driver, sel_FullDay, "Full day in option");
		Util.Hardwait(5);
		Util.CheckRecords(driver, btn_save, "Records");
		Util.Hardwait(2);
		Util.click(driver, btn_save, "Save button");
		
		
		Util.click(driver, click_configure, "Configuration in Tab");
		Util.click(driver, holidays, "Holidays in Dropdown");
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_Name, Holiday1, "Holiday name");
		Util.ScrollUP(driver);
		Util.sendkeys(driver, Enter_Date, H_Date, "Holiday Date");
		//Util.click(driver, Full_Half01, "Full or Half Day");
		Util.click(driver, Full_Half, "Full or Half Day");
		Util.click(driver, sel_HalfDay, "Half Day in option");
		//Util.click(driver, Full_Half01, "Full or Half Day");
		Util.click(driver, Full_Half, "Full or Half Day");
		Util.click(driver, sel_FullDay, "Full day in option");
		Util.click(driver, switch_Yes, "Yes switch");
		Util.click(driver, btn_save, "Save button");
		
		Util.sendkeys(driver, Enter_Fdate, F_Date, "From Date");
		Util.sendkeys(driver, Enter_TOdate, T_Date, "TO Date");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}
	

	public void Leave_Entitlements(String EmpName, String ent_CANvalue,String EMGvalue,String Medvalue) {
		Util.click(driver, click_Entitle, "Entitlements in Tab");
		Util.click(driver, add_entitle, "Add Entitlements in dropdown");
		Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2022, "Jan 2022-Dec 2022");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2023, "Jan 2023-Dec 2023");
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_vac, "Vacation leave option");
		Util.sendkeys(driver, Enter_Entitlements, ent_CANvalue, "Entitlement value");
		Util.click(driver, btn_save, "Save button");
		Util.click(driver, btn_confirm,"Confirm button");
		
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2022, "Jan 2022-Dec 2022");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2023, "Jan 2023-Dec 2023");
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_emergency, "Emergency leave option");
		Util.sendkeys(driver, Enter_Entitlements, EMGvalue, "Entitlement value");
		Util.click(driver, btn_save, "Save button");
		Util.click(driver, btn_confirm,"Confirm button");
		
		Util.click(driver, btn_add, "add button");
		Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2022, "Jan 2022-Dec 2022");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2023, "Jan 2023-Dec 2023");
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_medical, "Medical leave option");
		Util.sendkeys(driver, Enter_Entitlements, Medvalue, "Entitlement value");
		Util.click(driver, btn_save, "Save button");
		Util.click(driver, btn_confirm,"Confirm button");
		
		Util.click(driver, click_Entitle, "Entitlements in Tab");
		Util.click(driver, My_entitle, "My entitlements in Dropdown ");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
		
		
		Util.click(driver, click_Entitle, "Entitlements in Tab");
		Util.click(driver, emp_entitle, "Employee Entitlements in Dropdown");
		Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2022, "Jan 2022-Dec 2022");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2023, "Jan 2023-Dec 2023");
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_vac, "Vacation leave option");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		
		Util.click(driver, click_Entitle, "Entitlements in Tab");
		Util.click(driver, emp_entitle, "Employee Entitlements in Dropdown");
		Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2022, "Jan 2022-Dec 2022");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2023, "Jan 2023-Dec 2023");
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_emergency, "Emergency leave option");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		
		Util.click(driver, click_Entitle, "Entitlements in Tab");
		Util.click(driver, emp_entitle, "Employee Entitlements in Dropdown");
		Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2022, "Jan 2022-Dec 2022");
		Util.click(driver, clk_LevPeriod, "Leave period Dropdown ");
		Util.click(driver, select_2023, "Jan 2023-Dec 2023");
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_medical, "Medical leave option");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
	}
	
		
	public void ApplyVacLeave(String Vac_fdate,String Vac_Tdate,String Htime,String MIn_Time,String Htime1,String MIn_Time1,String comment) {
		Util.click(driver, click_apply,"Apply in Tab");	
		Util.click(driver, click_LeaveType, "Leave Type");
		
		Util.click(driver, click_vac, "Vacation");
		Util.sendkeys(driver, FR_date, Vac_fdate, "Vacation From Date");
		Util.sendkeys(driver, To_date, Vac_Tdate, "Vacation TO Date");
		Util.click(driver, btn_close, "Close button");
		Util.click(driver, Part_days, "Partial Days Dropdown");
		Util.click(driver, Part_days1, "Partial Days Dropdown");
		Util.click(driver, sel_AllDays, "All days Option");
		Util.click(driver, Duration, "Duration Dropdown");
        Util.click(driver, sel_SpecTime,"Specific time option");
        Util.click(driver, Enter_Fdate,"From time");
        Util.sendkeys(driver, Enter_Htime, Htime, "Hour value");
        Util.sendkeys(driver, Enter_MinTime, MIn_Time, "Minutes Value");
       // Util.click(driver, btn_AM, "AM option");
        Util.click(driver, Enter_TOdate, "To Time");
        Util.sendkeys(driver, Enter_Htime, Htime1, "Hour value");
        Util.sendkeys(driver, Enter_MinTime, MIn_Time1, "Minutes Value");
       // Util.click(driver, btn_PM, "PM option");
        Util.sendkeys(driver, com_box, comment, "Comments");
        Util.click(driver, btn_apply, "Apply Button");
        Util.Hardwait(2);
		
		
	}
	public void ApplyEmergencyLeave(String Vac_fdate,String Vac_Tdate,String Htime,String MIn_Time,String Htime1,String MIn_Time1,String comment) {
		Util.click(driver, click_apply,"Apply in Tab");	
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_emergency, "Emergency");
		Util.sendkeys(driver, FR_date, Vac_fdate, "Emergency Leave From Date");
		Util.sendkeys(driver, To_date, Vac_Tdate, "Emergency Leave TO Date");
		Util.click(driver, btn_close, "Close button");
		Util.click(driver, Part_days, "Partial Days Dropdown");
		Util.click(driver, Part_days1, "Partial Days Dropdown");
		Util.click(driver, sel_AllDays, "All days Option");
		Util.click(driver, Duration, "Duration Dropdown");
        Util.click(driver, sel_SpecTime,"Specific time option");
        Util.click(driver, Enter_Fdate,"From time");
        Util.sendkeys(driver, Enter_Htime, Htime, "Hour value");
        Util.sendkeys(driver, Enter_MinTime, MIn_Time, "Minutes Value");
        Util.click(driver, Enter_TOdate, "To Time");
        Util.sendkeys(driver, Enter_Htime, Htime1, "Hour value");
        Util.sendkeys(driver, Enter_MinTime, MIn_Time1, "Minutes Value");
        Util.sendkeys(driver, com_box, comment, "Comments");
        Util.click(driver, btn_apply, "Apply Button");
        Util.Hardwait(2);

		
		
	}
	public void ApplyMedicalLeave(String Vac_fdate,String Vac_Tdate,String comment) {
		Util.click(driver, click_apply,"Apply in Tab");	
		Util.click(driver, click_LeaveType, "Leave Type");
		
		Util.click(driver, click_medical, "Medical");
		Util.sendkeys(driver, FR_date, Vac_fdate, "Medical leave From Date");
		Util.sendkeys(driver, To_date, Vac_Tdate, "Medical leave TO Date");
		Util.click(driver, btn_close, "Close button");
	    Util.click(driver, Part_days, "Partial Days Dropdown");
		Util.click(driver, Part_days1, "Partial Days Dropdown");
		Util.click(driver, sel_AllDays, "All days Option");
		Util.click(driver, Duration, "Duration Dropdown");
        Util.click(driver, HD_Noon,"Halfday afternoon option");
        Util.sendkeys(driver, com_box, comment, "Comments");
        Util.click(driver, btn_apply, "Apply Button");
        Util.Hardwait(2);	
	}

	
	public void AssignLeave(String EmpName,String fdate,String Tdate,String comment) {
		Util.click(driver, asn_leave, "Assign leave in Tab");
		Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, click_LeaveType, "Leave Type");
		Util.click(driver, click_emergency, "Emergency");
		Util.sendkeys(driver, FR_date, fdate, " Leave From Date");
		Util.click(driver, btn_close, "Close button");
		Util.sendkeys(driver, To_date, Tdate, " Leave TO Date");
		Util.click(driver, btn_close, "Close button");
		Util.click(driver, AsnPart_days, "Partial Days Dropdown");
		Util.click(driver, Part_days1, "Partial Days Dropdown");
		Util.click(driver, sel_StartDay, "Start day only Option");
		Util.click(driver, Start_day, "Duration Dropdown");
        Util.click(driver, HD_morning,"Halfday Morning option");
		  Util.sendkeys(driver, com_box, comment, "Comments");
		  Util.click(driver, btn_assign, "Assign Button");
	        Util.Hardwait(2);		
	}
   
	
	
	public void MyLeaves(String pbstatus,String fstatus,String pstatus,String dstatus) {
		ReportFile.infoTest("**************** Leave Status Starts ***************");
    	Util.click(driver, click_Myleave, "Myleaves in Tab");
    	Util.GetText(driver, txt_PSBR, pbstatus, "Medical leave status");
    	Util.click(driver, click_Myleave, "Myleaves in Tab");
    	Util.GetText(driver, txt_F_Emergency, fstatus, "Emergency leave status");
    	Util.click(driver, click_Myleave, "Myleaves in Tab");
    	Util.GetText(driver, txt_P_Leaves, pstatus, "Assigned leave status");
    	Util.click(driver, click_Myleave, "Myleaves in Tab");
    	Util.GetText(driver, txt_DigDet, dstatus, "Vacation leave status");
    	Util.Hardwait(3);
    	Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
    	ReportFile.infoTest("**************** Leave Status Ends ******************");
    	
    }
   
	public void LeaveList(String EmpName) {
    	Util.click(driver, Leavelist, "Leave list in Tab");
    	Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search, "Search button");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
    }
	
	public void Leavemanage(String EmpName) {
    	Util.click(driver, Leavelist, "Leave list in Tab");
    	Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
		Util.click(driver, btn_search, "Search button");
		
		Util.click(driver, btN_appPSBR, "Medical leave approval");
		Util.click(driver, icon_F_emer, "Family Emergency leave icon");
		Util.click(driver, cancel_F_emer, "Family Emergency Leave Cancel");
		Util.click(driver, btn_rejDigDet, "Vacation leave Rejection");
		Util.Hardwait(5);
		Util.CheckRecords(driver, records, "Records");
		Util.Hardwait(2);
    }

	public void CheckReports(String EmpName) {
	  Util.click(driver, click_Reports, "Reports in Tab");
	  Util.click(driver, MyLeu_report, "MY Reports");
	  
	  Util.click(driver, click_Reports, "Reports in Tab");
	  Util.click(driver, LEU_report, "Employees Leave Report");
	  Util.click(driver, switch_Employee, "Employee Switch");
	  Util.sendkeys(driver, Enter_Ename, EmpName,"Employee name");
		Util.click(driver, firstoption, "First Hint");
	Util.click(driver, btn_generate, "Generate button");
	  
 }
	
	 
	 
	 
	 
	 
}

