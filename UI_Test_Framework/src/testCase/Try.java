package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
import core.WebDriverEngine;
//9062
public class Try extends BaseTest{
	public Try(String type) throws Exception {
		super("firefox");
	}
	@BeforeSuite
	public void LoginSuccess() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(2000);
		webtest.click("id=s-menu-dashboard");
	}
//	@BeforeTest
//	public void traf() throws Exception {
//		Thread.sleep(1000);
//		webtest.click("id=s-menu-dashboard");
//	}
	@Test
	public void SwitchThemeTest() throws Exception {
		webtest.click("id=s-menu-dashboard");
		webtest.click("id=start");
		Thread.sleep(2000);
		webtest.mouseoverElement("xpath=/html/body/div[1]/div[1]/ul/li[4]/a/i");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[1]/div[1]/ul/li[4]/ul/li[2]/a");
	}
	@Test(dependsOnMethods="SwitchThemeTest")
	public void ReturnCard() throws Exception {
		webtest.click("id=s-menu-dashboard");
//		webtest.click("id=s-menu-6");
//		Thread.sleep(6000);
//		webtest.enterFrame("iframe-6");
//		webtest.click("xpath=/html/body/nav/ul/li[2]/a");
//		Thread.sleep(2000);
//		webtest.click("xpath=//a[contains(.,'员工')]");
//		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div/div/div[2]/div/table/tbody/tr/td[2]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//iframe[contains(@class,'ke-edit-iframe')]");
		Thread.sleep(2000);
		webtest.tapType("做好自己11");
		Thread.sleep(2000);
		webtest.click("xpath=//button[contains(.,'保存')]");
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods="ReturnCard")
	public void Top() throws Exception {
		webtest.click("id=s-menu-dashboard");
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
	@Test(dependsOnMethods="Top")
	public void AouncementDelete() throws Exception {
		webtest.click("id=s-menu-dashboard");
		webtest.click("id=s-menu-2");
		Thread.sleep(3000);
		webtest.enterFrame("iframe-2");
		Thread.sleep(4000);
		webtest.click("xpath=/html/body/nav[1]/ul/li[3]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//a[contains(.,'搜索')]");
		Thread.sleep(2000);
		webtest.type("xpath=//input[@name='value1']", "aaa");
		webtest.type("xpath=//input[@name='value4']", "aaa");
		webtest.click("xpath=//button[contains(.,'搜索')]");
		
	}
}

