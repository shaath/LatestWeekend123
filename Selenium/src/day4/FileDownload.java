package day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("3.0.1")).click();
		
		Thread.sleep(5000);
		
		
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileDownload.exe");

		
		
		
		
		
	}

}
