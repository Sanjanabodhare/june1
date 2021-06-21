package main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pomclass.Homepage;
import Pomclass.Homepage2;

public class Test2 {

WebDriver driver;
Homepage home;
Homepage2 home2;

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
	public void Verifymisccell() throws InterruptedException
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,2800)");
		home2=new Homepage2(driver);
		home2.misscellnous();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.icicibank.com/blogs/miscellaneous.page?");		
	}
	@Test
	public void Timeinvestment() throws InterruptedException
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,2800)");
		home2=new Homepage2(driver);
		home2.Timeinvestment();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		Assert.assertNotEquals(url, "https://www.icicibank.com/blogs/miscellaneous.page?");		
	}
	
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
