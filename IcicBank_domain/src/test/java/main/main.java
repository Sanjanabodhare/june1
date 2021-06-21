package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pomclass.Homepage;

public class main {
WebDriver driver;
Homepage home;
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		
	}
	@BeforeMethod()
	public void launchapp()
	{	driver =new ChromeDriver();	
		driver.get("https://www.icicibank.com");
		driver.manage().window().maximize();
		 home=new Homepage(driver);
		 home.clicklater();
	}
	@Test
	public void verifysavingaccount()
	{
		 home=new Homepage(driver);
		 home.accounts();
		 home.Savingaccounts();
		 home.Savinginfo();
		 String a=driver.getCurrentUrl();
		Assert.assertEquals(a, "https://www.icicibank.com/Personal-Banking/account-deposit/savings-account/index.page?ITM=nli_cms_SA_saving_account_navigation");
	}
	
	@Test
	public void verifyLoan() 
	{
		home=new Homepage(driver);
		home.Loan();
		home.PersonalLoan();
		home.instaLoan();
		String a=driver.getCurrentUrl();
		Assert.assertNotEquals(a, "avyguhdih");
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
