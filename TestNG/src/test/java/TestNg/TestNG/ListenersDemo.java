package TestNg.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(TestNg.TestNG.ListenerClass.class)
public class ListenersDemo {
	
	@Test
	public void login()
	{
		//launch browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).submit();
	    
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test
	public void testfail()
	{
		System.out.println("failed test case..");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testskiped()
	{
		System.out.println("test case skipped");
		throw new SkipException("skip exception thrown...");
	}

}
