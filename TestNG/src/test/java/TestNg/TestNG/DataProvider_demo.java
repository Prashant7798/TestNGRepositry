package TestNg.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_demo {
	
	// 1.India Qutub Minar
	// 2.Agra Taj Mahal
	// 3.Heydrabad charminar
	
	@DataProvider(name= "searchDataset")
	public Object[][] searchData()
	{
		Object[][] searcgKeyword = new Object[3][2];
		searcgKeyword[0][0] = "India";
		searcgKeyword[0][1] = "Qutub Minar";
		
		searcgKeyword[1][0] = "Agra";
		searcgKeyword[1][1] = "Taj Mahal";
		
		searcgKeyword[2][0] = "Heydrabad";
		searcgKeyword[2][1] = "charminar";
		
		return searcgKeyword;
		
		
		
	}
	
	@Test(dataProvider = "searchDataset")
	public void TestcaseGoogelSearch(String country , String monument)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.co.in/");
		
		WebElement searchbox= driver.findElement(By.name("q"));
	   
		//enter key combination of country and monument
		searchbox.sendKeys(country + " " + monument);
		
		driver.findElement(By.name("btnK")).submit();
	}

}
