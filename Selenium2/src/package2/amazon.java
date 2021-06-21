package package2;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		

	JavascriptExecutor js=((JavascriptExecutor)driver);
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,900)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-900)");
	Thread.sleep(3000);
	WebElement starthere =driver.findElement(By.xpath("//a[text()='Start here.'][2]"));
	
	js.executeScript("arguments[0].scrollIntoView();",starthere);
	Thread.sleep(4000);
	starthere.click();
		
	WebElement categri =driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
	categri.click();
	
	WebElement signin =driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	
	signin.click();
	WebElement text =driver.findElement(By.xpath("//div[contains(text(),' you agree')]"));
	String s= text.getText();
	System.out.println(s);
	WebElement Email =driver.findElement(By.xpath("//input[@type='email']"));
	Email.sendKeys("9769782406");
	Email.submit();
	WebElement pw =driver.findElement(By.xpath("//input[@type='password']"));
	pw.sendKeys("bodhare@123");
	pw.submit();
	
	WebElement mob =driver.findElement(By.xpath("//a[text()='Mobiles']"));
	mob.click();
	WebElement redmi =driver.findElement(By.xpath("//span[text()='Redmi']"));
	
	boolean r=redmi.isSelected();
	System.out.println(r);
	redmi.click();	
	Date Currentdate= new Date(0);
	System.out.println(Currentdate);
	/*File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String timestamp =new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date(0));
	File Dest = new File("C:\\Users\\PRAVIN BODHARE\\Desktop\\Xpath\\img1"+timestamp+".jpg");
	
	FileHandler.copy(source, Dest);
	
	}
		WebElement prime =driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(prime).click().build().perform();
		
		WebElement primejoin =driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		a.moveToElement(primejoin).click().build().perform();
			*/
	}

}
