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
	logger6=extent.createTest("By Pathway Test");
	logger7=extent.createTest("Screenshot for failed testcase");
}
}
