package ai.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import ai.ds.testBase.TestBase;

public class LoginPageTest extends TestBase{  //-----Here we Used Assert.fail(); for failure purpose
	
	String expected_url="https://www.apps.dalalstreet.ai/dashboard";
	@Test
	public void verifyLogTest() throws InterruptedException
	{
		
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		Assert.fail();
		login.clickLoginButton();
		Thread.sleep(3000);
		String actual_url = login.getCurrURL();
		Assert.assertEquals(actual_url, expected_url);
		
		
		
		 
	}
	

}
