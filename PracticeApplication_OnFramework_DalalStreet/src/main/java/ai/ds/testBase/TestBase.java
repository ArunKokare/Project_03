package ai.ds.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.pageLayer.LoginPage;
import ai.ds.pageLayer.TransactionPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static  Logger logger;
	public LoginPage login; 
	public DashboardPage dash;
	public ExchangePage exchange ;
	public TransactionPage trans;
	
	
	
	@BeforeClass
	public void start()
	{
		logger=logger.getLogger("Practice App Auto Framework" );
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Framework execution Started");
	}
	
	@AfterClass
	public void end()
	{
		logger.info("Framework execution Completed");
	}
	@Parameters("browser")
	
	@BeforeMethod
	public void setup(String br)
	{
		
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
	
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		
		else
		{
			System.out.println("provide correct browser");
	    }
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//--Object Repository--------
		login = new LoginPage();
		dash  = new DashboardPage();
		exchange= new ExchangePage();
		trans=new TransactionPage();
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		//	driver.quit();
	}
		
}
