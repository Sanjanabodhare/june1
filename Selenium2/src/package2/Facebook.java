package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php/");
		//driver.navigate().to("http://www.facebook.com/");
		
		WebElement Create =driver.findElement(By.xpath("//div[text()='Create a new account']"));
		Create.getText();
		System.out.println(Create.getText());
		
		WebElement firstname =driver.findElement(By.xpath("//input[@name='firstname']"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='smita';", firstname);
		
		
		WebElement Surname =driver.findElement(By.xpath("//input[contains(@aria-label,'Sur')]"));
		Surname.sendKeys("Bodhare");
		//firstname.clear();
		//Surname.clear();
		WebElement mob =driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mob.sendKeys("69782406");
		//mob.clear();
		WebElement Password =driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		Password.sendKeys("Smita@123");
		
		
		WebElement Birthdate =driver.findElement(By.xpath("//div[text()='Date of birth']"));
		
		WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		Select s =new Select(day);
		s.selectByIndex(0);
		
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		Select r =new Select(month);
		r.selectByVisibleText("Jun");
	
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		
		Select p =new Select(year);
		p.selectByVisibleText("1997");
		
		WebElement custom =driver.findElement(By.xpath("//input[@value='-1']"));
		WebElement prono =driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		boolean X =prono.isDisplayed();
		
		System.out.println(X);
		if(X==true)
		{
			System.out.println("Visible");
		}
		else {
			custom.click();

		Select f =new Select(prono);
		f.selectByValue("1");
		String D=prono.getText();
		System.out.println(D);
		}
		
		//label[text()='Custom']
		//input[@value='1']
		
		//WebElement text =driver.findElement(By.xpath("//p[contains(text(),'By clicking')]"));
	
		//System.out.println(text.getText());
		
		//WebElement Signup =driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		//Signup.click();
		//
		//WebElement messenger =driver.findElement(By.xpath("//a[text()='Messenger']"));

		//messenger.click();
	}

}
