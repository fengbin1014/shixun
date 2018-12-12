package testCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.Login_Action;
import core.BaseTest;
//9062
public class ThemeTest extends BaseTest{
	public ThemeTest(String type) throws Exception {
		super("firefox");
	}
	@Test
	public void SwitchThemeTest() throws Exception {
		String url="http://localhost:8032/ranzhi/www/";
		webtest.open(url);
		Login_Action.login(getDriver(), "admin", "admin");
		Thread.sleep(3000);
		webtest.click("id=start");
		Thread.sleep(2000);
		//点击右下角个人头像
		webtest.mouseoverElement("xpath=/html/body/div[1]/div[1]/ul/li[4]/a/i");
		Thread.sleep(1000);
		//选择主题清晰
		webtest.click("xpath=/html/body/div[1]/div[1]/ul/li[4]/ul/li[2]/a");
	}

}
