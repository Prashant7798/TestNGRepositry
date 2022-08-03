package TestNg.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwearParameter 
{
	
	
	@Parameters({"SoftwearCompany"})
	@Test
	public void testcase1(String name)
	{
		System.out.println(name);
	}



}
