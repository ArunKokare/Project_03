package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class ExchangePage extends TestBase {
	
	public ExchangePage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repository-------------
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantiry_btn; 
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status_massage;
	
	@FindBy(xpath="(//label[text()='Intraday'])[1]")
	private WebElement intraday_btn;
	
	@FindBy(xpath="(//label[text()='Custom Limit'])[1]")
	private WebElement customlimit_btn;
	
	//---------action method--------------
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	public void enterQuantityOfShare(String count  )
	{
		quantiry_btn.click();
		quantiry_btn.sendKeys(count);
	}
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	public String  getStatus()
	{
		String text =status_massage.getText();
		return text;
	}
	
	public void clickIntradayButton()
	{
		intraday_btn.click();
	}
	
	
	public void clickCusttomLimit()
	{
		customlimit_btn.click();
	}
	

}
