package ai.ds.testLayer;

import org.testng.Reporter;
import org.testng.annotations.Test;
import ai.ds.testBase.TestBase;

public class BuyPageTest extends TestBase {
	//------In this class We Use Reporter log for printing massage
	@Test
	 public void verifyBuyFunctionalityWipro() throws InterruptedException
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
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(3000);
		System.out.println(exchange.getStatus());
		
	}
	
	
	
	@Test
	 public void verifyBuyFunctionalityAxis() throws InterruptedException
	{
		
		//-------login -----------
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickLoginButton();
		Thread.sleep(4000);
		
		//----select company-----------
		
		dash.enterCompanyName("Axis");
		dash.clickOption();
		Thread.sleep(2000);
		
		//----buy share----------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(3000);
		System.out.println(exchange.getStatus());
		Reporter.log("Shinde case Pass");
		
	}
	

}
