package pra_package;

import java.io.IOException;
import java.util.HashMap;

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

import GmailAPiLib.GMail;
import config.PRA_Base;
import library.Utility;
import pra_child_classes.ByPathway;
import pra_child_classes.Generate_Report;
import pra_child_classes.Home;
import pra_child_classes.Login;
import pra_child_classes.Pathway_RiskAssessments;
import pra_child_classes.PestRisk_Management;
import pra_child_classes.Summary_Screen;
import pra_child_classes.Testcases_for_Home_report;
import pra_child_classes.Title_verification;
import pra_child_classes.User_Action;

public class PRA_Home extends PRA_Base{
	

	public static ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./PRA_Report/home.html");
	public static ExtentReports extent = new ExtentReports();
	public static ExtentTest logger1,logger2,logger3,logger4,logger5,logger6,Logger7,Logger8,Logger9,Logger10,Logger11,Logger12,Logger13,Logger14,Logger15,Logger25;
	
	@BeforeSuite
	void initialization_browser_opening() throws InterruptedException, IOException
	{
		initialzation(getobject("url"));
		Testcases_for_Home_report testcase=new Testcases_for_Home_report();
		testcase.testcase_creation();
	}
	@Test(priority=1)
	void title_verification() throws InterruptedException
	{
		Title_verification title=new Title_verification();
		title.website_title_verification("Pest Risk Analysis Tool");
	}
	
	
	@Test(priority=2)
	void login_Test() throws InterruptedException, IOException
	{
        Login log=PageFactory.initElements(wd, Login.class);
        log.login_to_cpc(getobject("cpc_username"),getobject("cpc_password"));
	    log.login_to_mycabi(getobject("mycabi_username"),getobject("mycabi_password"));
	}
	
	
	
	//@Test(priority=3)
	void Team_creation() throws Throwable 
	{
		Home ho=PageFactory.initElements(wd, Home.class);
		ho.Teamcreation_for_PRA();
	}
			
	
	
	@Test(priority = 4)
	void gmail_verification()
	{
		HashMap<String, String> hm = GMail.getGmailData("subject:You have been invited to join: Testing 9 in the CABI Pest Risk Analysis Tool.");
        System.out.println(hm.get("subject"));
        System.out.println("=================");
        System.out.println(hm.get("body"));
        System.out.println("=================");
        System.out.println(hm.get("link"));
        
        System.out.println("=================");
        System.out.println("Total count of emails is :"+GMail.getTotalCountOfMails());
        
        System.out.println("=================");
        boolean exist = GMail.isMailExist("You have been invited to join: Testing 9 in the CABI Pest Risk Analysis Tool.");
        System.out.println("title exist or not: " + exist);
	}
	
	
	@Test(priority = 9)
	void pathway_creation() throws Throwable
	{
		ByPathway pathway = PageFactory.initElements(wd, ByPathway.class);
		pathway.Initiation(getobject("ByPathway_Title_Group"));
		pathway.group_of_pest();
		pathway.Initiation(getobject("ByPathway_Title_List"));
		pathway.generate_full_list();
	}
	
	@Test(priority = 10)
	void By_pathway_risk_assessments() throws Throwable
	{
		Pathway_RiskAssessments path = PageFactory.initElements(wd, Pathway_RiskAssessments.class);
		path.rapid_assessments();
		path.full_risk_assessment();
	}
	
	@Test(priority = 11)
	void By_pathway_risk_assessments_actions() throws Throwable
	{
		User_Action action= PageFactory.initElements(wd, User_Action.class);
		action.perform_action();
		action.export_import_pest();
	}
	
	@Test(priority = 12)
	void By_pathway_pestrisk() throws Throwable
	{
		PestRisk_Management pest= PageFactory.initElements(wd, PestRisk_Management.class);
		pest.pest_management(getobject("cpc_username"),getobject("cpc_password"));
		pest.risk_management();
	}
	
	@Test(priority = 13)
	 void By_pathway_summaryscreen() throws Throwable
	 {
		Summary_Screen screen= PageFactory.initElements(wd, Summary_Screen.class);
		screen.summary_content();
	 }
	
	@Test(priority = 14)
	void By_pathway_report_generation() throws Throwable
	{
		Generate_Report report=PageFactory.initElements(wd, Generate_Report.class);
		report.generate_pra_report();
		report.Delete_PRA("AutomationList");
		report.Delete_PRA("AutomationGroup");
	}
	
	
	@AfterMethod
	void fail_testcase(ITestResult result)
	{
		try {
			
			if(ITestResult.FAILURE==result.getStatus())
			{
			String temp=Utility.attachscreenshotreport(wd, result.getName());
		
			Logger25.fail("Testcase name"+ result.getName());
			Logger25.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
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
