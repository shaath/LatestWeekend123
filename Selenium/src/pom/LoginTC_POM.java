package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTC_POM  extends Constants
{
	@Test
	public void login()
	{
		driver.get(url);
		
		driver.manage().window().maximize();
		lp.login(u,p);
	
		Sleeper.sleepTightInSeconds(5);
		ap.welcomeclick();
		Sleeper.sleepTightInSeconds(5);
		ap.logoutclick();
		
		driver.close();
		
		
	}

}
