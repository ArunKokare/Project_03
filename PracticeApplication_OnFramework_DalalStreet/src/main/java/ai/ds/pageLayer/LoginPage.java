package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------------obj repository------------
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_text;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_text; 
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_button;
	
	//-----------actions Method ----------------------------
		
	public void enterEmailId(String email)
	{
		email_text.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		password_text.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		login_button.click();
	}
	
	public String getCurrURL()
	{
		String url =driver.getCurrentUrl();
		return url;
	}
		
}
