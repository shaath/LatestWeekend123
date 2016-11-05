package day4;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_KeywordEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		

		Actions act=new Actions(driver);
		//Focusing on Gmail
		act.moveToElement(gmail).build().perform();
		//Right click on the Gmail
		Sleeper.sleepTightInSeconds(5);
		act.contextClick().build().perform();
		Sleeper.sleepTightInSeconds(5);
		//  Method 1 
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		Sleeper.sleepTightInSeconds(5);
//		act.sendKeys(Keys.ENTER).build().perform();
//		Method 2
		act.sendKeys(Keys.chord("P")).build().perform();
	}

}
