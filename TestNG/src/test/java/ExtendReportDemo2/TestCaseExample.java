package ExtendReportDemo2;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCaseExample 
{
	@Test
	public void test1()
	{
		System.out.println("This test method 1........");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		System.out.println("This test method 2......");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("This test method 3.....");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4()
	{
		System.out.println("This test method 4...");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test5()
	{
		System.out.println("This test method 5");
		throw new SkipException("This is case is skip");
	}



}
