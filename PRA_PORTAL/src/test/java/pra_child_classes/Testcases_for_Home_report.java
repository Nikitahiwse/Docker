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
	logger7=extent.createTest("PRA_Home_Test");
	logger8=extent.createTest("My teams Previous PRA's");
	logger9=extent.createTest("My teams reulated pest List");
	logger10=extent.createTest("By Pest initiation");
	logger18=extent.createTest("By Pest Categorization Tab Test");
	logger19=extent.createTest("By Pest Probability of entry and Add pathway Test");
	logger25=extent.createTest("Delete By Pest PRA Test");
	logger26=extent.createTest("Screenshot for failed testcase");
	
}
}
