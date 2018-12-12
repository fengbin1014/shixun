package testCase;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
import core.MailUtil;
import sendMail.*;
//团队 8425添加博客
public class bk_ranzhiTest extends BaseTest{
	public bk_ranzhiTest(String type) throws Exception {
		super("firefox");
	}

	@Test(priority=1)
	public void LoginRanZhi() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
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
}
