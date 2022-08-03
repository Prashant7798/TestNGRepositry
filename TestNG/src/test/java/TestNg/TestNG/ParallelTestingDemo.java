package TestNg.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestingDemo 
{
	WebDriver driver;
	
	@Test
	public void verifyTitle()
	{
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	@Test
	public void verifyLogo()
	{
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Assert.assertEquals(driver.getTitle(), "Swag Labs");
		WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
