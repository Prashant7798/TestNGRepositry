package ExtendReportDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtendReportClass
{
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void startreport()
	{
		htmlReporter = new ExtentSparkReporter("ExtendReportdemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		//addenvrionment details
		reports.setSystemInfo("Machine name", "testpc1");
		reports.setSystemInfo("os", "ms");
		reports.setSystemInfo("windows 11", "prashant");
		reports.setSystemInfo("PRK", "chrome");

		//configuration to change look and fell
		htmlReporter.config().setDocumentTitle("Extend Report Demo");
		htmlReporter.config().setReportName("Test rEPORT");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEE,MMMM DD,YYYY, hh:mm a '('zzz')'");

	}
	@Test
	public void verifylaunchbrowser()
	{
		//create test
		test = reports.createTest("Browser launched and open url");
		Assert.assertTrue(true);
	}
	@Test
	public void verifytitel()
	{
		test = reports.createTest("Verify Titel");
		Assert.assertTrue(false);
	}
	@Test
	public void verifylogo()
	{
		test = reports.createTest("Verify Logo");
		Assert.assertTrue(true);
	}
	@Test
	public void verifyEmail()
	{
		test = reports.createTest("Verify Emial");
		throw new SkipException("skipping this test case with exception");
	}

	@Test
	public void verifyUserName()
	{
		test = reports.createTest("Verify UserName");
		//throw new SkipException("skipping this test case with exception");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAIL ", ExtentColor.RED));
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASS ", ExtentColor.PURPLE));
		}
		else if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIP ", ExtentColor.YELLOW));
		}
	}
	@AfterTest
	public void teardown()
	{
		reports.flush();
	}



}
