package ai.ds.pageLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class TransactionPage extends TestBase {
	
	
	public TransactionPage()
	{
		PageFactory.initElements(driver, this);
	}
	//----------------obj repository -------------------------
	
	 private By data1= By.xpath("//table/tbody/tr[1]/td[2]");
	 
	 @FindBy (xpath="//a[text()='2']")
	 private WebElement page2;
	 
	 @FindBy (xpath="//a[text()='3']")
	 private WebElement page3;
	 
	 //-------------action method----------------------------
	 
	 public void getTransactionDetails()
	 {
		 for(int i=1;i<=10;i++)
		 {
			 for(int j=1;j<=9;j++)
			 {
				String data =  driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"  "); 
			 }
			 System.out.println();
		 }
	 }
	 
	 
	 public void clickPage2()
	 {
		 page2.click();
	 }
	
	 public void clickPage3()
	 {
		 page3.click();
	 }
	

}
				










//String data =driver.findElement(data1).getText();
				//return data;
