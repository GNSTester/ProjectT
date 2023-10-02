package projecT.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import projectT.reports.ReportFile;

public class Util {
	public static String readconfig(String key) throws IOException {
		String value="";	
	File file=new File(System.getProperty("user.dir") + "\\src\\main\\java\\projectT\\config\\config.properties");
	FileInputStream f1=new FileInputStream(file);
	Properties prop=new Properties();
	prop.load(f1);
	 value=prop.getProperty(key);
	return value;
}
	
	public static void sendkeys(WebDriver driver,By locator,String value,String desc) {
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			Actions act=new Actions(driver);
			WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			act.moveToElement(ele).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			ele.sendKeys(value);
			
		} catch (StaleElementReferenceException e) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			//Actions act=new Actions(driver);
			WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			//act.moveToElement(ele).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			ele.sendKeys(value);
			
		}
//		catch (Exception e) {
//			String Actual=driver.findElement(By.xpath("//span[text()='Already exists']")).getText();
//			String Expect="Already exists";
//			if(Actual.equalsIgnoreCase(Expect)) {
//			}
//			continue;	
//		}
		ReportFile.infoTest("user enters "+desc+" as : "+value);
			
	}
	
	public static void GetText(WebDriver driver,By locator,String value,String desc) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		value = ele.getText();
		ReportFile.infoTest("user gets "+desc+" as : "+value);
			
	}
	
	public static void click(WebDriver driver,By locator,String desc) {
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
			    ele.click();
		} catch (StaleElementReferenceException e) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
			    ele.click();
		}
		catch (ElementClickInterceptedException e) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ele);		}
		ReportFile.infoTest("user clicks  "+desc);	
	}
	
	
	
	public static void Hardwait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void ScrollDown(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);");
	}
	
	public static void ScrollUP(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(150,0);");
	}
	
	public static String captureScreenShot(WebDriver driver)  {
		String dest="";
		
		try {
			TakesScreenshot screen =  (TakesScreenshot) driver;
			File src = screen.getScreenshotAs(OutputType.FILE);
			dest = System.getProperty("user.dir") + "\\Reports\\ScreenShots\\"+getRandomNumWithCurrentDate()+".png";
			File target = new File(dest);
			FileUtils.copyFile(src, target);
		}catch (Exception e) {
			ReportFile.failTest(driver,"Test failed");
			ReportFile.failTest("Failed to take screenshot");
			TakesScreenshot screen =  (TakesScreenshot) driver;
			File src1 = screen.getScreenshotAs(OutputType.FILE);
			String dest1="";
			dest1 = System.getProperty("user.dir") + "\\Reports\\failedScreenShots\\"+getRandomNumWithCurrentDate()+".png";
			File target1 = new File(dest1);
			try {
				FileUtils.copyFile(src1, target1);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return dest;
	}
	public void method_name(String Mname,Method m) {
		Mname=m.getName();
		System.out.println(Mname);
	}
	
	public static String getRandomNumWithCurrentDate() {
		Date date=new Date();
		return date.toString().replace(':', '_').replace(' ', '_');
	}
	
	public static String ScreenshotFolder() {
		int MyDay = LocalDateTime.now().getDayOfMonth(); // dd
		int MyYear = LocalDateTime.now().getYear(); // yyyy
		int MyMonth = LocalDateTime.now().getMonthValue(); // yyyy
		final String CureentDtTm = (String.valueOf(MyMonth) + "_" + String.valueOf(MyDay) + "_"
				+ String.valueOf(MyYear));
		return CureentDtTm;
	}
	
	public static void CheckRecords(WebDriver driver,By locator,String desc) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		ReportFile.passTest(driver, desc+" Results");
	}
	
	
	public static void ScrollTo(WebDriver driver,By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	
	public static void SelectOption(WebDriver driver,By locator,String expect) {
			try {
				List<WebElement> list=driver.findElements(locator);
//				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				for(WebElement each:list) {
					String actual=each.getText();
					if(actual.equalsIgnoreCase(expect))
				driver.findElement(By.xpath("//div[@role='listbox']/div/span[text()='"+actual+"']")).click();
				}	}
			 catch (StaleElementReferenceException e) {
				 List<WebElement> list=driver.findElements(locator);
//				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//					wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
					for(WebElement each:list) {
						String actual=each.getText();
						if(actual.equalsIgnoreCase(expect))
			    driver.findElement(By.xpath("//div[@role='listbox']/div/span[text()='"+actual+"']")).click();	
				}
			}
		
	}
	public static void uploadFile(WebDriver driver,By locator,String folder) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			Actions act=new Actions(driver);
			WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			act.moveToElement(ele).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			String path=System.getProperty("user.dir")+folder;
			ele.sendKeys(path);
	}
	
	}
