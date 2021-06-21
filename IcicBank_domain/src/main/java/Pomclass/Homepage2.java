package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Miscellaneous']")
	private WebElement Misscellnous;
	
	@FindBy(xpath="//a[text()='Time is ticking… Pay your Advance Tax!']")
	private WebElement Timeinvestment;
	
	public Homepage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void misscellnous()
	{
		Misscellnous.click();
	}
	
	public void Timeinvestment()
	{
		Timeinvestment.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
