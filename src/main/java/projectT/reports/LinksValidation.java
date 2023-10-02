package projectT.reports;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksValidation{	
		WebDriver driver;
		
		public LinksValidation(WebDriver driver) {
			super();
			this.driver = driver;
		}

		public void check_links() {
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(WebElement element : elements) {
			
			String URL = element.getAttribute("href");
			
			ReportFile.infoTest("-------------------------");
			
			System.out.println(URL);
			
			if(URL==null || URL.isEmpty()) {
				
				System.out.println("URL is empty");
				
				continue;
				
			}
			
			HttpURLConnection huc;
			try {
				huc = (HttpURLConnection)(new URL(URL).openConnection());
				huc.connect();
				
				if(huc.getResponseCode()>=400) {
					
					System.out.println(URL+" is broken");
					
				}else {
					
					System.out.println(URL+" is a valid link");
					
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		driver.quit();
	}
}