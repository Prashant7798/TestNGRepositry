package TestNg.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
     //on enter ctrl+space
	public void onStart(ITestContext Result)
	{
		System.out.println("On Start method invoked.....");
	}
	
	public void onFinish(ITestContext Result)
	{
		System.out.println("On Finsh Method invoked");
	}
	
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("On skipped method invoked");
	}
	
	public void onTestStart(ITestResult Result)
	{
		System.out.println("On start method invoked");
	}
	
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("on success method invoked");
	}
	
	public void onTestFailedButWithSuccessPercentage(ITestResult Result)
	{
		
	}

}
