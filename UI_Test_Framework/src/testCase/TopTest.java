package testCase;

import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
//8435
public class TopTest extends BaseTest{
	public TopTest(String type) throws Exception {
		super("firefox");
	}
	@Test
	public void Top() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		webtest.click("id=s-menu-6");
		Thread.sleep(6000);
		webtest.enterFrame("iframe-6");
		webtest.click("xpath=/html/body/nav/ul/li[2]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'员工')]");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div/div/div[2]/div/table/tbody/tr/td[2]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//i[@class='icon-flag-alt']");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div/div/div[2]/div[1]/div[3]/div/span/ul/li[2]/a");
	}
}

