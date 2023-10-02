package projectT.TestCases;

import org.testng.annotations.Test;

import projectT.config.BaseClass;
import projectT.reports.LinksValidation;

public class TestCaseLinkValidation extends BaseClass {
	
	@Test
	public void OrangeHRMLinksCheck() {
		LinksValidation lv=new LinksValidation(driver);
		lv.check_links();
	}

}
