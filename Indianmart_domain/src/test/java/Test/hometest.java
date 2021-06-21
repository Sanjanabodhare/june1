package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pomclass.home;

public class hometest {
	WebDriver driver;
	home h;	
	@BeforeMethod
	public void before() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.indiamart.com/");
	}	
	@Test
	public void verifysearch() throws InterruptedException
	{
		h=new home(driver);
		h.enterProduct("men clothing");
		h.Clicktosearch1();
		h.skippopup();
		h.EnterCity("thane");
		h.selectCity();
		
	}
		
		
		
		
		
		
		
		
		
		
}
