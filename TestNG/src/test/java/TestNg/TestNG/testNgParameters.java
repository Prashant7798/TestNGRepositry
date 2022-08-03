package TestNg.TestNG;
import org.testng.annotations.*;
public class testNgParameters 

{
	//@Parameters({"i" , "j"})
	@Test
	@Parameters({"i","j"})
	
	//@Parameters({"i" , "j"})
	public void addmethod(int a , int b)
	{
		System.out.println(a+b);
	}
	
	@Test
	@Parameters({"i","j"})
	public void subtractmethod(int a , int b)
	{
		System.out.println(a-b);
	}
	
	@Test
	@Parameters({"i" ,"j"})
	public void multificationmethod(int a , int b)
	{
		System.out.println(a*b);
	}
}