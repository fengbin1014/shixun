package testCase;

import org.testng.annotations.Test;

import appModules.AddMessage_Action;
import appModules.Login_Action;
import core.BaseTest;

public class AddMessageTest extends BaseTest{
	public AddMessageTest(String type) throws Exception {
		super("firefox");
	}

	@Test
	public void addMessageSuccess() throws Exception {
		String url = "http://localhost:8032/mymovie/";
		webtest.open(url);
		Login_Action.login(getDriver(), "qingdao01", "123456");
		String message="最好的时光度过了最好的青春为什么不够十个字呀明明就已经超出去了";
		AddMessage_Action.addMessage(getDriver(), message);
		
	}

}
