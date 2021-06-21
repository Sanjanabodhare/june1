package package2;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class IcicBank {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.icicibank.com/");
		
		WebElement later= driver.findElement(By.xpath("//div[text()='Later'][1]"));
		later.click();
		WebElement Accounts= driver.findElement(By.xpath("//span[text()='Accounts']//span[text()='Accounts']"));
		Actions a= new Actions(driver);
		a.moveToElement(Accounts).perform();
		WebElement SavingsAccount= driver.findElement(By.xpath("//label[text()='Savings Account']"));
		a.moveToElement(SavingsAccount).perform();
		
		WebElement f1= driver.findElement(By.xpath("//iframe[@scrolling='no'][1]"));
		driver.switchTo().frame(f1);
		WebElement text= driver.findElement(By.xpath("//li[text()='Joining fee 500 + GST']"));
		System.out.println(text.getText());
		WebElement apply= driver.findElement(By.xpath("//a[contains(@href,'nli_cms_CC_lifestyle_coral_hp_find_right_product_applynow_btn')]"));
		Thread.sleep(6000);
		a.moveToElement(apply).doubleClick().build().perform();
		Thread.sleep(6000);
		driver.navigate().back();
		
		LocalDateTime s=java.time.LocalDateTime.now();
		for(int i=0;i<2;i++)
		{
			String u=s.toString().replace(":", ".");
			File p=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			double x=Math.random();
			File path =new File("C:\\Users\\PRAVIN BODHARE\\Desktop\\Xpath\\"+x+""+u+".jpg");
			FileHandler.copy(p, path);	
		}
		/*WebElement mobile= driver.findElement(By.xpath("//a[text()='Mobile']"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();", mobile);
		WebElement nearby= driver.findElement(By.xpath("//a[text()='Nearby offers']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", nearby);*/
		
		
		

		
	}

}
