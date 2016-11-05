package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lText=links.get(i).getText();
			
			if (lText.equalsIgnoreCase("Gmail")) 
			{
				flag=true;
				links.get(i).click();
				break;
			}
			
		}
		if (flag==true) 
		{
			System.out.println("Expected link availsbl in Bing page");
			
		}
		else
		{
			System.out.println("Expected link not available in Bing page");
		}

	}

}
