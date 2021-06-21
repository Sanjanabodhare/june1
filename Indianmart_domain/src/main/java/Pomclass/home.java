package Pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='search-input']")
	private WebElement enterProduct;
	
	@FindBy(xpath="//button[@id='searchBtn']")
	private WebElement search1button;
	
	@FindBy(xpath="//input[@id='txt-city']")
	private WebElement EnterCity;
	
	@FindBy(xpath="//a[@tabindex='-1']")
	private WebElement selectCity;
	
	@FindBy(xpath="//a[@tabindex='-1']")
	private WebElement skip;
	
	public home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterProduct(String a)
	{
		enterProduct.sendKeys(a);
	}
	public void Clicktosearch1()
	{
		search1button.click();
	}
	public void EnterCity(String a)
	{
		EnterCity.sendKeys(a);
	}
	public void selectCity()
	{
		Actions s= new Actions(driver);
		s.moveToElement(selectCity).click().build().perform();
	}
	
	public void skippopup()
	{
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement skip =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@tabindex='-1']")));
		skip.click();
	}
	
	
	
	
	
}
