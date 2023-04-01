package ai.ds.testLayer;

import org.testng.annotations.Test;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.pageLayer.LoginPage;
import ai.ds.testBase.TestBase;

public class BuyPageTest2 extends TestBase {
	
	
	@Test
	 public void verifyBuyFunctionality() throws InterruptedException
	{
		//-------login -----------
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickLoginButton();
		Thread.sleep(4000);
		
		//----select company-----------
		
		dash.enterCompanyName("Wipro");
		dash.clickOption();
		Thread.sleep(2000);
		
		//----buy share----------------
		exchange.clickOnBuyButton1();
		exchange.clickIntradayButton();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(3000);
		System.out.println(exchange.getStatus());
		
	}
	

	@Test
	 public void verifyBuyFunctionality1() throws InterruptedException
	{
		//-------login -----------
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickLoginButton();
		Thread.sleep(4000);
		
		//----select company-----------
		
		dash.enterCompanyName("Wipro");
		dash.clickOption();
		Thread.sleep(2000);
		
		//----buy share----------------
		exchange.clickOnBuyButton1();
		exchange.clickCusttomLimit();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(3000);
		System.out.println(exchange.getStatus());
		
	}
	
	@Test
	 public void verifyBuyFunctionality3() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		DashboardPage dash = new DashboardPage();
		ExchangePage exchange = new ExchangePage();
		
		//-------login -----------
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickLoginButton();
		Thread.sleep(4000);
		
		//----select company-----------
		
		dash.enterCompanyName("Wipro");
		dash.clickOption();
		Thread.sleep(2000);
		
		//----buy share----------------
		exchange.clickOnBuyButton1();
		exchange.clickIntradayButton();
		exchange.clickCusttomLimit();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(3000);
		System.out.println(exchange.getStatus());
		
		}
	
	
	

}
