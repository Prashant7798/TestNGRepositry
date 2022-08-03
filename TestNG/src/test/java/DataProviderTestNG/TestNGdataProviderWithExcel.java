package DataProviderTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGdataProviderWithExcel
{

	WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		//launch borowser
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.googel.com");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "searchDataProvider")
	public void searchkeyword(String keyword)
	{
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);

	}

	@DataProvider(name = "searchDataProvider")
	public Object[][] searchDataProviderMethod()
	{
		String filename = "C:\\Users\\Shree\\Desktop\\excelfile 3.xlsx";
		Object[][] searchdata = getExcelData(filename,"Sheet2");
		//	Object[][] searchdata= new Object[2][1];
		//	searchdata[0][0] = "Taj Mahal"; //row=1 colum = 1
		//	searchdata[1][0] = "India Gate"; //row2 colum = 1
		return searchdata;

	}

	public String [][] getExcelData(String fileName , String SheetName)
	{
		String [][] data = null;

		//open file in read open
		try {
			FileInputStream inputStream = new FileInputStream(fileName);

			//creat XSSF work book object excel file manipulation
			XSSFWorkbook wrokbook = new XSSFWorkbook(inputStream);
			XSSFSheet excelsheet = wrokbook.getSheet(SheetName);

			//get total no of ro
			int ttlrow = excelsheet.getLastRowNum() + 1;

			//get total no cell
			int ttlcell = excelsheet.getRow(0).getLastCellNum();
			
			//array initilize
			data = new String[ttlrow-1][ttlcell];

			for(int currentrow=1; currentrow < ttlrow; currentrow++)
			{
				for(int currentcell = 0; currentcell < ttlcell; currentcell++)
				{
					data[currentrow-1][currentcell] = excelsheet.getRow(currentrow).getCell(currentcell).getStringCellValue();
				}
			}

			wrokbook.close();



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;


	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
