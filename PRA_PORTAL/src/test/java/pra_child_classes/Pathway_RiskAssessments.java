package pra_child_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import pra_package.PRA_Home;

public class Pathway_RiskAssessments extends PRA_Home{

	@FindBy(linkText = "Select assessment")
	WebElement select_assessment;
	
	@FindBy(xpath="//input[@class='btn btn-pra-red btn-submit-form margin-top-20' and @value='Rapid assessment']")
	WebElement rapid_assessment;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[0].PotentialEstablishmentSpread")
	WebElement potential_for_establishment_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_0__PotentialEstablishmentSpread")
	WebElement option_1;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[1].PotentialEconomicEtcConsequences")
	WebElement potential_for_economic_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_1__PotentialEconomicEtcConsequences")
	WebElement option_2;
	
	@FindBy(xpath="//button[@class='btn btn-pra-red']")
	WebElement save;
	
	@FindBy(xpath="//button[@class='btn btn-pra-gray valid margin-top-20']")
	WebElement not_required;
	
	
	//Assessment with YES Option
	
	@FindBy(linkText = "Select assessment")
	WebElement select_black_borer;
	
	@FindBy(xpath="//input[@class='btn btn-pra-red btn-submit-form margin-top-20' and @value='Rapid assessment']")
	WebElement rapid_assessment_button;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[0].PotentialEstablishmentSpread")
	WebElement potential_for_establishment_spread_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_0__PotentialEstablishmentSpread")
	WebElement select_option_1;
	
	@FindBy(name="RapidAssessmentSections.RapidAssessmentQuestions[1].PotentialEconomicEtcConsequences")
	WebElement potential_for_environmental_option;
	
	@FindBy(id="RapidAssessmentSections_RapidAssessmentQuestions_1__PotentialEconomicEtcConsequences")
	WebElement select_option_2;
	
	@FindBy(xpath="//button[@class='btn btn-pra-red']")
	WebElement save_button;
	
	@FindBy(xpath="//button[@class='btn btn-pra-gray valid margin-top-20']")
	WebElement No;
	
	
	
	
	
	
	public void assessments() throws Throwable {
		Thread.sleep(3000);
		select_assessment.click();
		Logger7.log(Status.PASS, "Assessment selected(Peach twig borer)");
		Thread.sleep(3000);
		rapid_assessment.click();
		Logger7.log(Status.PASS, "Rapid Assessment button clicked successfully");
		Thread.sleep(2000);
		potential_for_establishment_option.click();
		Logger7.log(Status.PASS, "Clicked On First Option");
		Select s1= new Select(option_1);
		s1.selectByValue("2");
		Logger7.log(Status.PASS, "No Option Selected");
		Thread.sleep(3000);
		potential_for_economic_option.click();
		Logger7.log(Status.PASS, "Clicked on Second Option");
		Select s2= new Select(option_2);
		s2.selectByValue("2");
		Logger7.log(Status.PASS, "No Option Selected");
		Thread.sleep(3000);
		save.click();
		Logger7.log(Status.PASS, "Save Button Clicked successfully");
		Thread.sleep(3000);
		not_required.click();
		Logger7.log(Status.PASS, "Full risk assessment is not required");
		
		
		
		Thread.sleep(3000);
		select_black_borer.click();
		Logger7.log(Status.PASS, " Apate monachus Assessment selected(black borer)");
		Thread.sleep(2000);
		rapid_assessment_button.click();
		Logger7.log(Status.PASS, "Rapid Assessment button clicked successfully");
		Thread.sleep(2000);
		potential_for_establishment_spread_option.click();
		Select potential = new Select(select_option_1);
		potential.selectByValue("1");
		Logger7.log(Status.PASS, "Yes Option Selected");
		Thread.sleep(3000);
		potential_for_environmental_option.click();
		Select environmental = new Select(select_option_2);
		environmental.selectByValue("1");
		Logger7.log(Status.PASS, "Yes Option Selected");
		Thread.sleep(3000);
		save_button.click();
		Logger7.log(Status.PASS, "Save Button Clicked successfully");
		Thread.sleep(3000);
		No.click();
		Logger7.log(Status.PASS, "Full PRA not required");
		Thread.sleep(5000);
		
		
		
		
	}
	
	

}
