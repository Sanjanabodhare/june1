package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		WebElement cancel=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		
		WebElement flip = driver.findElement(By.xpath(" //a[@class='_21ljIi']"));
		System.out.println(flip.getText());
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchbox.click();
		searchbox.sendKeys("mobile");
		
		WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();	
		Thread.sleep(8000);
		WebElement Brand=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
		Brand.click();
		Brand.sendKeys("Samsung");
		WebElement Samsung=driver.findElement(By.xpath("//div[text()='SAMSUNG']"));
		Samsung.click();
		Thread.sleep(8000);
		/*WebElement minprice=driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
		Select s=new Select(minprice);
		s.selectByValue("2000");
		WebElement maxprice=driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		Thread.sleep(8000);
		
		Select a=new Select(maxprice);
		a.selectByValue("10000");*/
		Actions a= new Actions(driver);
		WebElement scroll=driver.findElement(By.xpath("(//div[@class=\"_3FdLqY\"])[1]"));
		Thread.sleep(6000);
		WebElement Pricescroll=driver.findElement(By.xpath("(//div[@class='_1ftpgI'])[4]"));
		a.clickAndHold(scroll).release(Pricescroll).build().perform();
		
		
		
		
		
		
		
		
	}

}
