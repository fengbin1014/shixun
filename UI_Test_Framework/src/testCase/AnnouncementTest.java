package testCase;

import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
//9275
public class AnnouncementTest extends BaseTest{
	public AnnouncementTest(String type) throws Exception {
		super("firefox");
	}
	@Test
	public void AouncementDelete() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		//点击日常办公
		webtest.click("id=s-menu-2");
		Thread.sleep(3000);
		webtest.enterFrame("iframe-2");
		Thread.sleep(4000);
		//点击公告
		webtest.click("xpath=/html/body/nav[1]/ul/li[3]/a");
		Thread.sleep(2000);
		//点击搜索
		webtest.click("xpath=//a[contains(.,'搜索')]");
		Thread.sleep(2000);
		//搜索框中输入搜索内容
		webtest.type("xpath=//input[@name='value1']", "aaa");
		webtest.type("xpath=//input[@name='value4']", "aaa");
		//点击搜索
		webtest.click("xpath=//button[contains(.,'搜索')]");
		
	}
}
