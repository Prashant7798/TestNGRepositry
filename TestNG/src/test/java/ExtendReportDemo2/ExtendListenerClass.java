package ExtendReportDemo2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendListenerClass implements ITestListener
{
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	public void ConfigureReport()
	{
		htmlReporter = new ExtentSparkReporter("ExtentListenerReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add system report and enviorment imformation
		reports.setSystemInfo("Machine", "TestPC 1");
		reports.setSystemInfo("os", "windows 11");
		reports.setSystemInfo("password", "prk");
		reports.setSystemInfo("username", "prashant");
		
		//configuration to change look and feel of report
		htmlReporter.config().setDocumentTitle("Extent Listener Demo");
		htmlReporter.config().setReportName("thisn is my frist report ");
		htmlReporter.config().setTheme(Theme.DARK);
		
	}

	 //on enter ctrl+space
	
		public void onStart(ITestContext Result)
		{
			ConfigureReport();
			System.out.println("On Start method invoked.....");
		}
		
		public void onFinish(ITestContext Result)
		{
			System.out.println("On Finsh Method invoked");
			reports.flush();
		}
		
		public void onTestFailure(ITestResult result) {
			System.out.println("on success method invoked:");
			//reports.createTest();
		}
		
		
		public void onTestSkipped(ITestResult Result)
		{
			System.out.println("On skipped method invoked");
		}
		
		public void onTestStart(ITestResult result) {
			System.out.println("On Test Start method invoked:"  );
		}
		
		public void onTestSuccess(ITestResult Result)
		{
			System.out.println("on success method invoked:" + Result.getName());
		}
		
		public void onTestFailedButWithSuccessPercentage(ITestResult Result)
		{
			
		}


}
