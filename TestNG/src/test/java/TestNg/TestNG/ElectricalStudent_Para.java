package TestNg.TestNG;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ElectricalStudent_Para 
{
	@Parameters({"omkar"})
	@Test
	public void testcase2(String name) 
	{
		System.out.println(name);
	}
	

}
