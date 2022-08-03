package TestNg.TestNG;
import org.testng.Assert;
import org.testng.annotations.*;
public class AnnotationAttributes

{
	//@Test(description="this is test case 1")
	//@Test(priority=1)
	//@Test(dependsOnMethods={"testcase2"})
	@Test(enabled=false)
	public void testcase1()
	{
		System.out.println("Mobile login test case");
	}

	//@Test(description="this is test case 2")
	//@Test(timeOut=200)
	//@Test(priority=2)
	@Test
	public void testcase2() 
	{
		//Thread.sleep(400);
		System.out.println("Web login test case");
		Assert.assertTrue(false);
	}
	
	//@Test(description="this is test case 3")
	//@Test(priority=3)
	@Test
	public void testcase3()
	{
		System.out.println("API login test case");
	}
}
