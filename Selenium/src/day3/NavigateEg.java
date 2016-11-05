package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class NavigateEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		//Redirecting to gmail page
		driver.navigate().to("http://gmail.com");
		Sleeper.sleepTightInSeconds(3);
		//going back to the google page
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(3);
		//
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(3);
		//refresh the page
		driver.navigate().refresh();

	}

}
