package package2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
		WebElement alertok =driver.findElement(By.xpath("//button[text()='OK']"));
		alertok.click();
		
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement TRAINS =driver.findElement(By.xpath("//strong[text()='TRAINS']"));
		//a.moveToElement(TRAINS).perform();
		a.doubleClick(TRAINS).build().perform();
		
		Thread.sleep(3000);
		/*WebElement IRCTCTRAINS =driver.findElement(By.xpath("//span[text()='IRCTC TRAINS']"));
		a.moveToElement(IRCTCTRAINS).perform();
		Thread.sleep(3000);
		WebElement booking =driver.findElement(By.xpath("//span[text()='Group Booking']"));
		a.moveToElement(booking).click().build().perform();
		
		WebElement hotel =driver.findElement(By.xpath("//a[text()=' HOTELS ']"));
		hotel.click();
		ArrayList<String> add =new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(add.get(1));
		WebDriverWait w=new WebDriverWait(driver,15);
		
		WebElement ok =w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Ok']")));
		ok.click();
		*/
	}

}
