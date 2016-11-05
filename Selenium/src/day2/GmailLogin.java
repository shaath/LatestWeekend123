package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
//		FirefoxDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		//MAximizing the window
		driver.manage().window().maximize();
		//Sending the text into email textbox
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("gandesharath");
		//Clear the text in email textbox
//		driver.findElement(By.id("Email")).clear();
		//clicking on the Next button
		driver.findElement(By.name("signIn")).click();
		//wait for 5 sec
		Sleeper.sleepTightInSeconds(5);
		
		//Entering data into password textbox
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		//clicking on the signin button
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
