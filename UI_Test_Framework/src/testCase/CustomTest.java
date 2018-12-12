package testCase;

import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
//9760
public class CustomTest extends BaseTest{
	public CustomTest(String type) throws Exception {
		super("firefox");
	}
	@Test
	public void CustomDo() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		//客户管理
		webtest.click("id=s-menu-1");
		Thread.sleep(3000);
		//订单
		webtest.enterFrame("iframe-1");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/nav[1]/ul/li[2]/a");
		Thread.sleep(3000);
		//创建订单
		webtest.click("xpath=//a[contains(.,' 创建订单')]");
		Thread.sleep(2000);
		//选择客户
		webtest.click("xpath=/html/body/div/div[1]/div[2]/form/table/tbody/tr[1]/td/div[2]/div/a");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div/div[1]/div[2]/form/table/tbody/tr[1]/td/div[2]/div/div/ul/li[2]");
		Thread.sleep(3000);
		webtest.click("xpath=//ul[@class='chosen-choices']");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div/div[1]/div[2]/form/table/tbody/tr[6]/td/div[2]/div/div/ul/li");
		
//		webtest.click("");
		webtest.type("xpath=//input[@name='plan']", "10000");
		
		webtest.click("xpath=//button[@id='submit']");
		Thread.sleep(2000);
		//点击沟通
		webtest.click("xpath=//a[contains(.,'沟通')]");
		Thread.sleep(5000);
		webtest.click("xpath=//*[@id=\"contact_chosen\"]");
		Thread.sleep(2000);
		webtest.tapType("yy");
		webtest.enterClick();
		//webtest.getElementFinder();
		Thread.sleep(2000);
		webtest.click("xpath=//textarea[@name='comment']");
		Thread.sleep(2000);
		webtest.tapType("符合商业利益");
		webtest.click("xpath=//button[@id='submit']");
		
	}

}
