package ai.ds.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.LoginPage;
import ai.ds.pageLayer.TransactionPage;
import ai.ds.testBase.TestBase;

public class TransactionTest extends TestBase {
	
	
	@Test
	public void getTrnsDetais() throws InterruptedException
	{	
		//-------login -----------
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickLoginButton();
		Thread.sleep(4000);
		
		//---------Transaction----------
		dash.clickTranctionLink();
		Thread.sleep(2000);
		trans.getTransactionDetails();
				
	}
	
	

	@Test
	public void getTrnsDetaisPage2() throws InterruptedException
	{
		
		LoginPage login = new LoginPage();
		DashboardPage dash = new DashboardPage();
		TransactionPage tran = new TransactionPage();
				
		//-------login -----------
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickLoginButton();
		Thread.sleep(4000);
		
		//---------Transaction----------
		dash.clickTranctionLink();
		Thread.sleep(4000);
		JavascriptExecutor js = ( JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		tran.clickPage2();
		Thread.sleep(4000);
		tran.getTransactionDetails();
				
	}
	
	@Test
	public void getTrnsDetaisPage3() throws InterruptedException
	{
		
		LoginPage login = new LoginPage();
		DashboardPage dash = new DashboardPage();
		TransactionPage tran = new TransactionPage();
				
		//-------login -----------
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickLoginButton();
		Thread.sleep(4000);
		
		//---------Transaction----------
		dash.clickTranctionLink();
		Thread.sleep(4000);
		JavascriptExecutor js = ( JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(2000);
		tran.clickPage3();
		Thread.sleep(4000);
		tran.getTransactionDetails();
				
	}
	

	

}
