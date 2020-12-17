package pra_child_classes;

import pra_package.PRA_Home;

public class Testcases_for_Home_report extends PRA_Home{
public void testcase_creation()
{
	extent.attachReporter(htmlReporter); 
	logger1=extent.createTest("Login Test");
	logger2=extent.createTest("Title Verification Test");
	logger3=extent.createTest("Banner Test");
	logger4=extent.createTest("Footer Test");
	logger5=extent.createTest("Team creation Test");
	Logger9=extent.createTest("By Pathway Test");           
	Logger10=extent.createTest("Pathway Risk Assessments");  
	Logger11=extent.createTest("User Action");               
	Logger12=extent.createTest("Pest Risk Management"); 
	Logger13=extent.createTest("Summary Analysis"); 
	Logger14=extent.createTest("Report Generation"); 
	Logger15=extent.createTest("Delete PRA ByPathway Test"); 
	Logger25=extent.createTest("Screenshot for failed testcase");
	
}
}
