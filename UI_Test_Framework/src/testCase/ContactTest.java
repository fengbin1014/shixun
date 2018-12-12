package testCase;

import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
//9842
public class ContactTest extends BaseTest{
	public ContactTest(String type) throws Exception {
		super("firefox");
	}
	@Test
	public void ContactTry() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		//我的地盘
		webtest.click("id=s-menu-dashboard");
		
		Thread.sleep(2000);
		//联系人
		webtest.click("xpath=//a[contains(.,'联系人')]");
		Thread.sleep(4000);
		//点击创建分组
		webtest.enterFrame("iframe-dashboard");
		webtest.click("xpath=//a[contains(.,' 创建分组')]");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@name='name']");
		Thread.sleep(2000);
		//分组名称
		webtest.tapType("成员");
		webtest.click("xpath=//ul[@class='chosen-choices']");
		Thread.sleep(2000);
		//分组成员
		webtest.tapType("admin");
		webtest.enterClick();
		//勾选公开
		webtest.click("xpath=//input[@name='public']");
		Thread.sleep(1000);
		//保存
		webtest.click("xpath=//button[@type='submit']");
	}
}
