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
	Logger9=extent.createTest("By Pathway Test");           //9 se start hoga
	Logger10=extent.createTest("Pathway Risk Assessments");  //10
	Logger11=extent.createTest("User Action");               //11
	Logger12=extent.createTest("Pest Risk Management");      //12   to 16
	Logger13=extent.createTest("Screenshot for failed testcase");
	
}
}
