package baseclass11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass11 {
	static WebDriver driver;
	public static WebDriver getWebdriver(String browser) 
	{
	if (driver==null)
	
		
	
	{ 
		 if(browser.equals("chrome"))
			 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
		
		 driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
		 
	}
	
	
	return driver;
}
}