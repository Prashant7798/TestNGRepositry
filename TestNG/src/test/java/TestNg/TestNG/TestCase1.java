package TestNg.TestNG;
import org.bouncycastle.est.ESTSourceConnectionListener;
import org.testng.annotations.*;


public class TestCase1 {
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("before suit method");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("after suit method");
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("After test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class method");
		
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}

	
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test 2");
	}
	

}
