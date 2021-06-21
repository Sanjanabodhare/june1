package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class Mosueaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		WebElement Accept=driver.findElement(By.xpath("//a[text()='Accept']"));
		Accept.click();

		WebElement s=driver.findElement(By.xpath("//div[text()='Acceptable']"));
		
		WebElement d =driver.findElement(By.xpath("//p[text()='Drop here'][1]"));
		Actions a=new Actions(driver);
		a.moveToElement(s).click().build().perform();
		a.dragAndDrop(s,d).perform();	
		
		WebElement N=driver.findElement(By.xpath("//div[text()='Not  Acceptable']"));
		a.moveToElement(N).click().build().perform();
		a.dragAndDrop(N,d).perform();		
		
	}

}
