package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
import core.WebDriverEngine;

//后台管理9172
public class DepartmentTest extends BaseTest{
	public DepartmentTest(String type) throws Exception {
		super("firefox");
	}

	@Test(priority=1)
	public void LoginRanZhi() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		webtest.click("id=s-menu-superadmin");
		Thread.sleep(5000);
		webtest.enterFrame("iframe-superadmin");
		webtest.click("xpath=//a[contains(.,'组织')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'维护部门')]");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.id("children[]"));
		list.get(list.size()-1).sendKeys("结构");
		Thread.sleep(3000);
		webtest.click("xpath=//button[contains(.,'保存')]");
}
}
