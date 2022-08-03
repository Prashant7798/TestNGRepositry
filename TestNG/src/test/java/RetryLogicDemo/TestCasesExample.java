package RetryLogicDemo;


import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCasesExample
{
	@Test
	public void test1()
	{
		Assert.assertTrue(false);  //fail test case
	}
	
	@Test
	public void test2()
	{
		Assert.assertTrue(false); //fail test case
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(true); //pass test case
	}
	
	
	
	

}
