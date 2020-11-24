package pra_child_classes;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import pra_package.PRA_Home;

public class Home extends PRA_Home{
	

	@FindBy(xpath="//a[@class='showTeamModal']")
	WebElement create;
	
	@FindBy(id="TeamName")
	WebElement teamname;
	
	@FindBy(id="txtInviteUsers")
	WebElement invite_user_1;
	
	@FindBy(xpath="//button[@class='btn btn-pra-red']")
	WebElement add_user_1;
	
	@FindBy(id="txtInviteUsers")
	WebElement invite_user_2;
	
	@FindBy(xpath="//button[@class='btn btn-pra-red']")
	WebElement add_user_2;
	
	
	@FindBy(id="txtInviteUsers")
	WebElement invite_user_3;
	
	@FindBy(xpath="//button[@class='btn btn-pra-red']")
	WebElement add_user_3;
	
	
	@FindBy(xpath="//button[@type='submit' ][@class='btn btn-pra-red']")
	WebElement create_team;
	
	@FindBy(xpath="//button[@class='close']")
	WebElement close;
	
	/*
	 * @FindBy(xpath="//input[@type='email']") WebElement emailid;
	 * 
	 * @FindBy(
	 * xpath="//button[@type='button'][@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']"
	 * ) WebElement next_button;
	 * 
	 * @FindBy(name="password") WebElement pass;
	 * 
	 * @FindBy(
	 * xpath="//button[@type='button'][@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']"
	 * ) WebElement next;
	 */
	

	
	
	public void Teamcreation_for_PRA() throws Throwable 
	{
			
		
		create.click();
		logger4.log(Status.PASS, "Create Team button got clicked successfully");
		Thread.sleep(2000);
		teamname.sendKeys("team_for_automation");
		logger4.log(Status.PASS, "Team Name Entered Successfully");
		
		
		invite_user_1.sendKeys("nikita.hiwse@neosoftmail.com");
		logger4.log(Status.PASS, "Nikita invited");
		add_user_1.click();
		logger4.log(Status.PASS, "Nikita Added successfully");
		
		
		invite_user_2.sendKeys("shubhambhandarineosoft@gmail.com");
		logger4.log(Status.PASS, " Shubham invited");
		add_user_2.click();
		logger4.log(Status.PASS, "Shubham Added successfully");
		
		invite_user_3.sendKeys("ombhandari9090@gmail.com");
		logger4.log(Status.PASS, "Om invited");
		add_user_3.click();
		logger4.log(Status.PASS, "Om Added successfully");
		
		
		
		Thread.sleep(3000);
		create_team.click();
		logger4.log(Status.PASS, "Team Created successfully");
		Thread.sleep(2000);
		close.click();
	
	}
	
	
	
	
		/*public void email_verification() throws Throwable
		{
			  String parent=wd.getWindowHandle();
			  System.out.println("parent window id is:"+parent);
			  System.out.println(wd.getTitle());
			  
			  wd.get("https://mail.google.com/");
			//  wd.get("https://mail.google.com/mail/?ui=html");
			  Thread.sleep(3000);
			  
			  Set<String> allwindows = wd.getWindowHandles();
			  int count = allwindows.size();
			  
			  System.out.println("Total no of windows:"+count);
			  
			  for(String child : allwindows)
			  {
				 
				  if(parent.equalsIgnoreCase(child))
				  {
					  wd.switchTo().window(child);
					  Thread.sleep(3000);
					  System.out.println("child window title is"+wd.getTitle());
					  System.out.println("Child window id is:"+wd.getWindowHandles());
					  
					  emailid.sendKeys("shubhambhandari003@gmail.com");
					  Thread.sleep(2000);
					  next_button.click();
					  
					  pass.sendKeys("shivshakti123");
					  Thread.sleep(2000);
					  next.click();
					 
					  Thread.sleep(3000);
					  //wd.close();
				  }
			  }
			wd.switchTo().window(parent);
			System.out.println("parent window title is:"+wd.getTitle());
			
			
			 
			  }*/
			  
			 
				}
			