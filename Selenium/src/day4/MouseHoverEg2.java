package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoverEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement men=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(men).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[2]/a")).click();
		

	}

}