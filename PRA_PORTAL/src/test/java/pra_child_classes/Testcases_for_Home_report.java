package pra_child_classes;

import pra_package.PRA_Home;

public class Testcases_for_Home_report extends PRA_Home{
public void testcase_creation()
{
	extent.attachReporter(htmlReporter); 
	logger1=extent.createTest("Login Test");
	logger2=extent.createTest("Title Verification Test");
	logger3=extent.createTest("Cleanup Test for team");
	logger4=extent.createTest("Team creation");
	logger5=extent.createTest("a");
	logger6=extent.createTest("Screenshot for failed testcase");
}
}
