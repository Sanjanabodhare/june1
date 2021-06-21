package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVIN BODHARE\\Downloads\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://demo.guru99.com/test/table.html");
		
	
		for(int i=1;i<=5;i++)
		{
		List <WebElement> rowcount =driver.findElements(By.xpath("//table[@border='1']//tr["+i+"]//td"));
		int c=rowcount.size();
		for(int j=0;j<c;j++)
		{
				String value= rowcount.get(j).getText();
					System.out.print(value+" ");		
		}
		System.out.println();
		}
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List <WebElement>rowcount  =driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(rowcount.size());
		for(int j=0;j<=2;j++)
		{
			String value= rowcount.get(j).getText();
			System.out.print(value+" ");			
		}
			System.out.println();
	
		for(int i=2;i<=7;i++)
		{
			List <WebElement> cellcount =driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]//td"));	
			for(int j=0;j<=2;j++)
			{
				
				String value= cellcount.get(j).getText();
						System.out.print(value+" ");			
			}
			System.out.println();
		}*/
		
		driver.get("https://www.freedomscientific.com/SurfsUp/Tables.htm");
		for(int i=0;i<=1;i++)
		{
			List <WebElement>rowcount  =driver.findElements(By.xpath("//table[@align='center'][7]//tr"));
			int y=rowcount.size();
			for(int j=1;j<y;j++)
			{
				String b=rowcount.get(j).getText();
				System.out.println(b+" ");
			}
			System.out.println();
		}/*
		for(int i=0;i<=5;i++)
		{
			List <WebElement>Cellcount  =driver.findElements(By.xpath("//table[@align='center'][3]//tr["+i+"]//td"));
			int p=Cellcount.size();
			for(int a=0;a<p;a++)
			{
				String b=Cellcount.get(a).getText();
				System.out.print(b+" ");
			
			}
			System.out.println();
		}
		*/
	}

}
