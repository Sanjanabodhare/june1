package package1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
	List<WebElement> listElement=driver.findElements(By.xpath("//a[text()='Try it Yourself »']"));
			
		/*JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-900)");
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true);",listElement.get(2));
		Thread.sleep(4000);*/
	
		listElement.get(0).click();
		listElement.get(1).click();
		listElement.get(2).click();
		listElement.get(3).click();
		
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		System.out.println(a.get(4));
		
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(a.get(1));
		WebElement alertframe1 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(alertframe1);
		WebElement tryit =driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		Alert p1=driver.switchTo().alert();
		p1.accept();
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(a.get(2));
		WebElement alertframe2 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(alertframe2);
		WebElement tryit1 =driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit1.click();
		Alert p2=driver.switchTo().alert();
		p2.accept();
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(a.get(3));
		System.out.println(driver.getCurrentUrl());
		
		
		driver.switchTo().window(a.get(4));
		System.out.println(driver.getCurrentUrl());
		
		WebElement alertframe4 =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(alertframe4);
		WebElement tryit4 =driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit4.click();
		Alert p4=driver.switchTo().alert();
		p4.accept();
		driver.switchTo().defaultContent();
		driver.switchTo().window(a.get(3));
		driver.close();
		
		Thread.sleep(5000);
		driver.quit();
		/*List<WebElement> linklist=driver.findElements(By.tagName("a"));
		linklist.get(0).click();
		linklist.get(1).click();
		linklist.get(2).click();
		System.out.println(linklist.get(3));
		System.out.println(linklist.get(4));*/
	
	}

}
