package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		WebElement alert=driver.findElement(By.xpath("//button[text()='Click Me']"));
		alert.click();
		Alert a= driver.switchTo().alert();
		a.accept();
		
		WebElement copytxt=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions s= new Actions(driver);
		s.doubleClick(copytxt).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("http://demoqa.com/alerts/");
//		WebElement button =driver.findElement(By.xpath("//button[@id='alertButton']"));
//		
//		button.click();
//		Alert alt=driver.switchTo().alert();
//		alt.accept();
//		
//		
//
//		WebElement confrimbutton =driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		confrimbutton.click();
//		Thread.sleep(3000);
//
//		alt.accept();
//		
//		Thread.sleep(3000);
//		confrimbutton.click();
//		alt.dismiss();
//		//alt.sendKeys("Smita");
//		//alt.getText();
//		
//		WebElement promotbutton =driver.findElement(By.xpath("//button[@id='promtButton']"));
//		promotbutton.click();
//		String v=alt.getText();
//		System.out.println(v);
//		alt.sendKeys("Smita");
//		alt.accept();
		
	}

}
