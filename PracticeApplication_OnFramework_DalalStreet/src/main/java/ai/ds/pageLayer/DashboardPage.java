package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//------------obj repository-----------
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	 private WebElement searchbox_txt;
	 
	@FindBy(xpath="(//div[contains(@class,'m-4 card')])[2]")
	 private WebElement option;
	
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement transaction_link;
	 
	
	//------------action method -----------
	
	public void enterCompanyName(String company)
	{
		searchbox_txt.sendKeys(company);
	}
	
	public void clickOption()
	{
		option.click();
	}
	
	public void clickTranctionLink()
	{
		transaction_link.click();	
	}


}
