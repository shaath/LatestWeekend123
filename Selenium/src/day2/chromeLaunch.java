package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://yahoo.com");
	}

}
