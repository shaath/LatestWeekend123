package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants 
{
	public static String url="http://opensource.demo.orangehrmlive.com";
	public static String u="Admin",p="admin";
	WebDriver driver=new FirefoxDriver();
	
	LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	AdminPage ap=PageFactory.initElements(driver, AdminPage.class);
}
