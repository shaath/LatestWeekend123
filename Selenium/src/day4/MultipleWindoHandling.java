package day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindoHandling {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
//		String windowId=driver.getWindowHandle();
		
//		System.out.println(windowId);
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String windowId=it.next();
			System.out.println(windowId);
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
			
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			} 
			catch (Exception e) 
			{
				System.out.println("The Expected link not available in "+ driver.getTitle()+" Not available");
			}
			
		}
		
		driver.close();
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
