package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe");
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		
		WebElement ZoomIn= driver.findElement(By.xpath("//a[@aria-label='Zoom in']"));
		ZoomIn.click();
		WebElement ZoomOut= driver.findElement(By.xpath("//a[@aria-label='Zoom out']"));
		ZoomOut.click();
		
		
		
		//a[@aria-label='Zoom out']
		
		
		
		
		
		
		
		
		
		
		
		

		/*driver.get("https://demoqa.com/nestedframes");
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(f1);
		WebElement text1=driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(text1.getText());
		
		
		WebElement f2=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(f2);
		WebElement text2=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(text2.getText());
		
		driver.switchTo().parentFrame();
		System.out.println(text1.getText());*/
		
		
		/*WebElement f1=driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(f1);
		WebElement text1=driver.findElement(By.xpath("//h1[text()='This is a sample page'][1]"));
		System.out.println(text1.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement f2=driver.findElement(By.xpath("//iframe[@id=\"frame2\"]"));
		driver.switchTo().frame(f2);
		WebElement text2=driver.findElement(By.xpath("//h1[text()='This is a sample page'][1]"));
		System.out.println(text2.getText());*/}

}
