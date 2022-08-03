package TestNg.TestNG;
import org.testng.annotations.*;
public class GroupsAttribute 
{
	@Test(groups="softwear company")
	public void infosys()
	{
		System.out.println("Infosys");
	}
	
	@Test(groups="softwear company")
	public void wipro()
	{
		System.out.println(" wipro");
	}
	
	@Test(groups="automobile company")
	public void tata()
	{
		System.out.println("tata");
	}
	
	
	@Test(groups="automobile company")
	public void maruti()
	{
		System.out.println("maruti");
	}
	
	

}
