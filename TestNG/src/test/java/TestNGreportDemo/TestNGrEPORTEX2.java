package TestNGreportDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGrEPORTEX2 {
	
	@Test
   public void googelsearch()
   {
	   //lauch browser
	   WebDriverManager.chromedriver().setup();
	   
	   WebDriver driver= new ChromeDriver();
	   Reporter.log("Chrome Browser open....");
	   
	   driver.get("http://www.google.co.in/");
	   Reporter.log("url  open....");
	   
	   
	  WebElement searchbox = driver.findElement(By.name("q"));
	  
	  searchbox.sendKeys("India Gate");
	  Reporter.log("India gate keyword enter... ");
	  
	  searchbox.sendKeys(Keys.ENTER);
	  Reporter.log("Enter key pressed....");
	  
	  driver.quit();
   }

}
