package TestNg.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class GoogelPara {
	@Parameters({"keyword"})
	@Test
	public void google(String searchdata)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		WebElement ser=driver.findElement(By.name("q"));
		
		ser.sendKeys("selenium");
		
		Assert.assertEquals(searchdata, ser.getAttribute("value"));
		
		driver.quit();
	}
	
	

}
