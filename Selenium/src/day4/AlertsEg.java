
package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("admin");
		driver.findElement(By.id("login")).click();
		
		Alert alt=driver.switchTo().alert();
		//Reading text available on alert box
		System.out.println(alt.getText());
		Sleeper.sleepTightInSeconds(5);
		// to click ok on alert box
		alt.accept();
		
		

	}

}
