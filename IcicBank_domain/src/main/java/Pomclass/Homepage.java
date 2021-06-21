package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	
	@FindBy(xpath="(//div[text()='Later'])[1]")
	private WebElement later;
	
	@FindBy(xpath="//span[text()='Accounts']")
	private WebElement Accounts;
	
	@FindBy(xpath="//label[text()='Savings Account']")
	private WebElement Savingaccount;
	
	@FindBy(xpath="//a[text()=' Savings Account']")
	private WebElement Savinginfo;
	
	@FindBy(xpath="//span[text()='Loans']")
	private WebElement Loan;
	
	@FindBy(xpath="//label[text()='Popular Loans']")
	private WebElement PersonalLoan;
	
	@FindBy(xpath="	//a[text()=' Insta Loans']")
	private WebElement instalLoan;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clicklater() {
		later.click();
	}
	
	public void accounts() {
		Actions s= new Actions(driver);
		s.moveToElement(Accounts).perform();
	}
	
	public void Savingaccounts() {
		Actions s= new Actions(driver);
		s.moveToElement(Savingaccount).perform();
	}
	
	public void Savinginfo() {
		Actions s= new Actions(driver);
		s.moveToElement(Savinginfo).click().build().perform();
		
	}
	
	public void Loan() {
		Actions s= new Actions(driver);
		s.moveToElement(Loan).perform();
	}
	
	public void PersonalLoan() {
		Actions s= new Actions(driver);
		s.moveToElement(PersonalLoan).perform();
	}
	
	public void instaLoan() {
		Actions s= new Actions(driver);
		s.moveToElement(instalLoan).click().build().perform();
	}

	
	
	
	
}
