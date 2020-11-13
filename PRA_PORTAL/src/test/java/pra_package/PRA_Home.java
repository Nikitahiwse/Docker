package pra_package;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import config.PRA_Base;
import library.Utility;
import pra_child_classes.Login;
import pra_child_classes.Testcases_for_report;
import pra_child_classes.Title_verification;

public class PRA_Home extends PRA_Base{

	public static ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./PRA_Report/extent.html");
	public static ExtentReports extent = new ExtentReports();
	public static ExtentTest logger1,logger2,logger3,logger4,logger5,logger6;
	
	@BeforeSuite
	void initialization_browser_opening() throws InterruptedException, IOException
	{
		initialzation(getobject("url"));
		Testcases_for_report testcase=new Testcases_for_report();
		testcase.testcase_creation();
	}
	@Test
	void title_verification() throws InterruptedException
	{
		Title_verification title=new Title_verification();
		title.website_title_verification("Pest Risk Analysis Tool");
	}
	@Test
	void login_Test() throws InterruptedException, IOException
	{
        Login log=PageFactory.initElements(wd, Login.class);
        log.login_to_cpc(getobject("cpc_username"),getobject("cpc_password"));
	    log.login_to_mycabi(getobject("mycabi_username"),getobject("mycabi_password"));
	}
	@AfterMethod
	void fail_testcase(ITestResult result)
	{
		try {
			if(ITestResult.FAILURE==result.getStatus())
			{
			String temp=Utility.attachscreenshotreport(wd, result.getName());
		
			logger6.fail("Testcase name"+ result.getName());
			logger6.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		    }}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
		
	}
	@AfterSuite
	void teardown_browerclosing()
	{
		teardown();
		extent.flush();
	}
}
