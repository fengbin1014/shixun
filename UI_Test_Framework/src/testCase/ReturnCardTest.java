package testCase;

import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
//8432
public class ReturnCardTest extends BaseTest{
	public ReturnCardTest(String type) throws Exception {
		super("firefox");
	}
	@Test
	public void ReturnCard() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		//团队
		webtest.click("id=s-menu-6");
		Thread.sleep(6000);
		webtest.enterFrame("iframe-6");
		//论坛
		webtest.click("xpath=/html/body/nav/ul/li[2]/a");
		Thread.sleep(2000);
		//点击某子模块
		webtest.click("xpath=//a[contains(.,'员工')]");
		Thread.sleep(2000);
		//点击子模块内的帖子
		webtest.click("xpath=/html/body/div/div/div[2]/div/table/tbody/tr/td[2]/a");
		Thread.sleep(2000);
		//定位回帖
		webtest.click("xpath=//iframe[contains(@class,'ke-edit-iframe')]");
		Thread.sleep(2000);
		//回帖内容
		webtest.tapType("你好");
		//保存
		webtest.click("xpath=//button[contains(.,'保存')]");
	}
}
