package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createacc =driver.findElement(By.xpath("//a[@rel='async']"));
		createacc.click();
		Thread.sleep(3000);
		WebElement Terms =driver.findElement(By.xpath("//a[@id='terms-link']"));
		
		WebElement Datapolicy =driver.findElement(By.xpath("//a[@id='privacy-link']"));
		
		WebElement Cookies =driver.findElement(By.xpath("//a[@id='cookie-use-link']"));
		
		Terms.click();
		Datapolicy.click();
		Cookies.click();
		 
		String main =driver.getWindowHandle();
		System.out.println(main);
		
		ArrayList<String> a= new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(main);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));

		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(a.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(a.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(a.get(2));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(a.get(3));
		System.out.println(driver.getCurrentUrl());

	}

}
