package testCase;

import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
//团队8426,8427查找已经存在的博客并编辑
public class SearchbkTest extends BaseTest{
	public SearchbkTest(String type) throws Exception {
		super("firefox");
	}
	@Test(priority=1)
	public void SearchBk() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		//点击“团队”
		webtest.click("id=s-menu-6");
		Thread.sleep(2000);
		webtest.enterFrame("iframe-6");
		Thread.sleep(2000);
		//点击团队下的博客
		webtest.click("xpath=//a[contains(.,'博客')]");
		Thread.sleep(3000);
		//搜索博客
		webtest.type("xpath=//input[@name='searchInput']", "为人处世");
		Thread.sleep(2000);
		webtest.click("xpath=//i[@class='icon icon-search']");
		Thread.sleep(3000);
		//编辑博客
		webtest.click("xpath=/html/body/div/div/div[2]/section/div[1]/div[2]/span[4]/a[1]");
		Thread.sleep(2000);
		webtest.click("xpath=//iframe[contains(@class,'ke-edit-iframe')]");
		Thread.sleep(2000);
		webtest.tapType("对待他人的态度就代表这别人对你的态度");
		webtest.click("xpath=//button[@type='submit']");
	}
	@Test(priority=2)
	public void AouncementDelete() throws Exception {
		driver.switchTo().defaultContent();
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
	@Test(priority=3)
	public void LoginRanZhi() throws Exception {
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//点击团队
		webtest.click("id=s-menu-6");
		Thread.sleep(5000);
		//点击博客
		webtest.enterFrame("iframe-6");
		webtest.click("xpath=//a[contains(.,'博客')]");
		Thread.sleep(3000);
		
		//点击“添加博客”
		webtest.click("xpath=//a[contains(.,'添加博客')]");
		Thread.sleep(3000);
		webtest.click("class=chosen-choices");
		Thread.sleep(3000);
		//填写博客内容
		webtest.click("xpath=/html/body/div[2]/div/div[2]/form/table/tbody/tr[1]/td[1]/div[2]/div/ul/li[2]");
		webtest.type("name=title", "生活小助手");
		webtest.click("xpath=//iframe[contains(@class,'ke-edit-iframe')]");
		Thread.sleep(2000);
		webtest.tapType("你好，明天");
		webtest.click("xpath=//button[contains(.,'保存')]");
	}
	//@Test(priority=4)
	
}
