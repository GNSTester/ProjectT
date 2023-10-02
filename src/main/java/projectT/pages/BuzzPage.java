package projectT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projecT.Utils.Util;
import projectT.reports.ReportFile;

public class BuzzPage {
	WebDriver driver;
	String Exp_title="Buzz";
	
	 By select_Buzz=By.xpath("//span[text()='Buzz']");
     
	 By option=By.xpath("//div[@role='listbox']//div/span");
	 By Enter_Feed=By.xpath("//form//textarea");
	 By btn_post=By.xpath("//form//button[text()=' Post ']");
	 By btn_post1=By.cssSelector("div.oxd-buzz-post-slot>button");
	 By btn_MostRecentpost=By.xpath("//button[text()=' Most Recent Posts ']");
	 By btn_MostLikePost=By.xpath("//button[text()=' Most Liked Posts ']");
	 By btn_MostCommPost=By.xpath("//button[text()=' Most Commented Posts ']");
	 By btn_LikeFirstPost=By.xpath("//div[@class='oxd-grid-1 orangehrm-buzz-newsfeed-posts']/div[1]//div[3]//div[1]/div");
	 By btn_Firstpost =By.xpath("//div[@class='oxd-grid-1 orangehrm-buzz-newsfeed-posts']/div[1]");
	public BuzzPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void SelectBuzz() {
		Util.click(driver, select_Buzz,"Buzz option");
		
	}
	public void ValidateBuzzPage() {
		WebElement title= driver.findElement(By.xpath("//h6[text()='Buzz']"));
		String act_title=title.getText();
		if(Exp_title.equalsIgnoreCase(act_title)) {
			ReportFile.passTest(driver,"Buzz page is opened");
			
		}
		else
			ReportFile.failTest(driver,"Buzz page is not opened");
		
	}
public void ReactBuzzPage(String feed) {
	Util.click(driver, btn_MostCommPost,"Most Comments Post Button");
	Util.click(driver, btn_MostLikePost, "Most liked Posts Button");
	Util.click(driver, btn_MostRecentpost, "Most Recent Posts Button");
	Util.Hardwait(3);
	Util.sendkeys(driver, Enter_Feed, feed , "Enter feed");
	Util.click(driver, btn_post1, "Post Button");
    Util.Hardwait(1);
	Util.click(driver, btn_LikeFirstPost, "Like Button of First Post");
	Util.Hardwait(4);
	Util.CheckRecords(driver, btn_Firstpost, "First post");
	Util.Hardwait(2);
}

}
