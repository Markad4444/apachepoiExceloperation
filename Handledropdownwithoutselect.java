package baseclass11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdownwithoutselect {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com");
WebElement ele= driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]//*"));
Actions act =new Actions(driver);
 act.moveToElement(ele);
 ele.click();
 
 WebElement list = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));

// JavascriptExecutor js =(JavascriptExecutor)driver;
// js.executeScript("arguments[0].scrollIntoView(true);", list);
// WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
// WebElement ele1=wait.until(ExpectedConditions.visibilityOf(list));
 act.moveToElement(list).perform();
 list.click();  
 
 
 driver.close();
 
 
	}

}
