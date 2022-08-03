package TestNg.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Demo2 {
	
	// 1.Iadia Dheli
	// 2.USA NewYork
	// 3.England London
	
	@DataProvider(name = "SearchDataSet")
	public Object[][] searchData()
	{
		
		Object[][] search = new Object[3][2];
		search[0][0] = "India ";
		search[0][1] = "Dheli";
		
		search[1][0] = "USA";
	    search[1][1] = "NewYork";
	    
	    search[2][0] = "Englnad";
	    search[2][1] = "London";
	    
	    return search;
	    		
	}

	@Test(dataProvider="SearchDataSet")
	public void testCaseDemo(String country, String monument)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in/");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(country + "  " + monument);
		
		driver.findElement(By.name("btnK")).submit();
	}
	
}
