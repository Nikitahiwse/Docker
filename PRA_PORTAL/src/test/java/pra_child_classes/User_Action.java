package pra_child_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import pra_package.PRA_Home;

public class User_Action extends PRA_Home {
	
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div[4]/div/div/div[1]/div/div[5]/div[4]/div/table/thead/tr/th[1]/a/div/a")
	WebElement Risk_Assessment_Filter;
	
	@FindBy(xpath="//label[@class='k-label']//input[@value='4']")
	WebElement select_filter;
	
	@FindBy(xpath="//button[@class='k-button k-primary']")
	WebElement Filter_Button;
	

	@FindBy(xpath="//*[@id=\"PestListGridIncluded\"]/div/a[3]/span")
	WebElement next_page;
	
	@FindBy(xpath="//*[@id=\"PestListGridIncluded\"]/div/a[2]")
	WebElement previous_page;
	
	
	
	
	//Export_Import Pest dodder
	
	@FindBy(xpath="//*[@id=\"PestListGridIncluded\"]/table/tbody/tr[5]/td[12]/a")
	WebElement useraction_menu;
	
	
	@FindBy(xpath="//*[@id=\"divpopup\"]/ul/li[7]/a")  
	WebElement export_dodder;
	
	@FindBy(xpath="//a[@class='btn btn-pra-red btn-block docx margin-bottom-10']")
	WebElement download_template_dodder;
	
	@FindBy(xpath="//button[@class='btn-pra-gray']")
	WebElement close_dodder;
	
	@FindBy(xpath="//*[@id=\"PestListGridIncluded\"]/table/tbody/tr[6]/td[12]/a")   //wrong
	WebElement apple_leaf_usermenu;
	
	@FindBy(xpath="//*[@id=\"divpopup\"]/ul/li[8]/a")
	WebElement import_assessment;
	
	@FindBy(name="ImportFile")
	WebElement choose_file;
	
	@FindBy(xpath="//a[@class='btn btn-pra-red k-float-right']")
	WebElement import_on_leaf_upload;

	@FindBy(xpath="//*[@id=\"modalimportwarning\"]/div/div/div/div/div[2]/p[2]/input[2]")
	WebElement continue_warning;
	
	@FindBy(xpath="//input[@class='btn btn-default' and @value='OK']")
	WebElement ok;
	
	@FindBy(xpath="//a[@class='k-button k-bare k-button-icon k-window-action']")
	WebElement close;
	
	@FindBy(xpath="//*[@id=\"PestListGridIncluded\"]/table/tbody/tr[5]/td[12]/a")     //correct file
	WebElement dodder_menu;
	
	@FindBy(xpath="//*[@id=\"divpopup\"]/ul/li[8]/a")
	WebElement import_correct_file;
	
	@FindBy(name="ImportFile")
	WebElement choose_correctfile_import;
	
	@FindBy(xpath="//a[@class='btn btn-pra-red k-float-right' and text()='Upload']")
	WebElement correctfile_upload;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div/div/div/div[2]/p[2]/input[2]")
	WebElement continue_upload;
	
	@FindBy(xpath="//*[@id=\"modalimporterror\"]/div/div/div[1]/button")
	WebElement close1;
	
	@FindBy(xpath="//a[@role='button' and @class='k-button k-bare k-button-icon k-window-action']")
	WebElement close2;
	
	
	
	
	
	

	public void perform_action() throws Throwable 
	{
		Thread.sleep(3000);
		Risk_Assessment_Filter.click();
		Logger8.log(Status.PASS, "Risk Assessment Tab Filter Clicked Successfilly");
		
		Thread.sleep(2000);
		select_filter.click();
		Logger8.log(Status.PASS, "Risk Assessment Tab Filter should be Clicked and Option Should be got Selected");
		
		Thread.sleep(3000);
		Filter_Button.click();
		Logger8.log(Status.PASS, "Risk Assessment Tab Filter Button Clicked Successfilly");	
		
		Thread.sleep(5000);
		next_page.click();
		Logger8.log(Status.PASS, "It should moved to next page");
		
		Thread.sleep(3000);
		previous_page.click();
		Logger8.log(Status.PASS, "It should moved to Previous page");
		
	
	}
	
	public void export_import_pest() throws Throwable
	{
		Thread.sleep(3000);
		useraction_menu.click();
		Logger8.log(Status.PASS, "User Action Menu Should Get Clicked");
		Thread.sleep(3000);
		export_dodder.click();
		Logger8.log(Status.PASS, "Export Assessment Option should be clicked");
		Thread.sleep(3000);
		download_template_dodder.click();
		Logger8.log(Status.PASS, "Export Assessment Option should be clicked And Template Should be Downloaded");
		Thread.sleep(2000);
		close_dodder.click();
		Thread.sleep(3000);
		apple_leaf_usermenu.click();
		Logger8.log(Status.PASS, "User Action Menu Should Get Clicked");
		Thread.sleep(3000);
		import_assessment.click();
		Logger8.log(Status.PASS, "Import Assessment Option should be clicked");
		Thread.sleep(3000);
		choose_file.sendKeys("C:\\Users\\hp\\Downloads\\Wordform template for Cuscuta reflexa (dodder) (4).docx");
		Logger8.log(Status.PASS, "File Path Passed");
		Thread.sleep(5000);
		import_on_leaf_upload.click();        // wrong file upload
		Logger8.log(Status.PASS, "Upload Button should be clicked");
		Thread.sleep(5000);
		continue_warning.click();
		Logger8.log(Status.PASS, "Before Clicking On Continue Warning Should Be Displayed");
		Thread.sleep(5000);
		ok.click();
		Logger8.log(Status.PASS, "Once Uploaded Ok Button Should be clicked");
		Thread.sleep(2000);
		close.click();
		Thread.sleep(4000);
		dodder_menu.click();
		Logger8.log(Status.PASS, "User Action Menu Should Get Clicked");
		Thread.sleep(3000);
		import_correct_file.click();
		Logger8.log(Status.PASS, "Import Assessment Option should be clicked");
		Thread.sleep(3000);
		choose_correctfile_import.sendKeys("C:\\Users\\hp\\Downloads\\Wordform template for Cuscuta reflexa (dodder) (4).docx");
		Logger8.log(Status.PASS, "File path Should Be Passed Which we Want to Upload");
		Thread.sleep(5000);
		correctfile_upload.click();
		Logger8.log(Status.PASS, "Upload Button Should Get Clicked");
		Thread.sleep(5000);
		continue_upload.click();
		Logger8.log(Status.PASS, "Before Clicking On Continue Warning Should Be Displayed");
		Thread.sleep(5000);
		close1.click();
		Thread.sleep(5000);
		close2.click();
		Thread.sleep(5000);
		
	}
		
		
		
	

}
