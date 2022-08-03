package TestNGreportDemo;
import org.testng.Reporter;
import org.testng.annotations.*;
public class TestNGreportEX 
{
	@Test
	public void testmethod1()
	{
		System.out.println("This is test method 1");
		 Reporter.log("This is test method 1");
	}
	
	@Test
	public void testmethod2()
	{
		System.out.println("This is test method 2");
		Reporter.log("This is test method 2");
	}
	
	@Test
	public void testmethod3()
	{
		System.out.println("This is test method 3");
		Reporter.log("This is test method 3");
	}
	
	@Test
	public void testmethod4()
	{
		System.out.println("This is test method 4");
		Reporter.log("This is test method 4");
	}
	
}
