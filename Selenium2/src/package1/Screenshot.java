package package1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void screenshot(WebDriver driver) throws IOException
	{
		LocalDateTime r=java.time.LocalDateTime.now();
		//double b=Math.random();
		String date=r.toString().replace(":", ".");
		File a=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\PRAVIN BODHARE\\Desktop\\Xpath\\"+"sanjana"+date+".jpg");
		
		FileHandler.copy(a, dest);
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php/");
		Screenshot.screenshot(driver);
			
		
	
		
		
		
		
		
		
		
		

		
	}

}
