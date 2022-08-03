package TestNg.TestNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

public class AutomobileParameters 
{
	
	
	@Parameters({"AutoMobileCompany"})
	@Test
	public void testcase1(String name)
	{
		System.out.println(name);
	}

}
