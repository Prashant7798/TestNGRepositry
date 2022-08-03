package TestNg.TestNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MchanicalStudent_Para 

{
	@Parameters({"prashant"})
	@Test
	public void testcase1(String name)
	{
		System.out.println(name);
	}

}
