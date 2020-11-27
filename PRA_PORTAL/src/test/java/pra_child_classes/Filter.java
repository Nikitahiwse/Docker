package pra_child_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import pra_package.PRA_Home;

public class Filter extends PRA_Home{
	
	public static void filte_previoustab(WebElement Sessionfilter,String input_text1,String input_text2,String k) throws InterruptedException
	{
		  Sessionfilter.click();
		  Thread.sleep(1000);
		  int i=1;
		  List<WebElement>dropdown=wd.findElements(By.xpath("//span[@class='k-icon k-i-arrow-60-down']"));
		  for(WebElement dr :dropdown)
			{
				//if(i==1||i==3)
				//{
				 dr.click();
				 Thread.sleep(1000);
				 List<WebElement>drdw=wd.findElements(By.xpath("//div[@class='k-list-scroller']//ul//li["+k+"]"));
				
				 int j=1;
				 for(WebElement dr1:drdw)
			     {
					 if(i==1 & j==1)
					 {
					 dr1.click(); 
					 }
					 else if(i==3 & j==3)
					 {
						 
						 dr1.click();
					
					 }
					 else if(i==2 &j==2)
					 {
						 if(k=="1" || k=="2")
						 {
							 dr1.click();
						 }
					
					 }
					
					 else if(i<=3 & j<=2)
					 {
						 System.out.println("");
					 }
					 
					j++;
					
			     }	
				 
				//}
				if(i==1)
				{
				WebElement input1=wd.findElement(By.xpath("//input[@title='Value']"));
				input1.sendKeys(input_text1);
				}
				else if(i==2)
				{
					
					System.out.println("And is selected");
				}
				else if (i==3)
				{
					WebElement input2=wd.findElement(By.xpath("//input[@title='Additional value']"));
					input2.sendKeys(input_text2);
				}
				
			 
				i++;
			
			}
			Thread.sleep(1000);
			WebElement filter_submit_button=wd.findElement(By.xpath("//button[text()='Filter']"));
			filter_submit_button.click();
			Thread.sleep(3000);
			
			Filter.filter_result();
			
			wd.navigate().refresh();
		    Thread.sleep(3000);
		    JavascriptExecutor jse=(JavascriptExecutor)wd;
		    jse.executeScript("window.scrollBy(0,600)", "");
		    Thread.sleep(2000);
		    WebElement previous_PRA=wd.findElement(By.linkText("My Team's Previous PRAs"));
		    previous_PRA.click();
		    Thread.sleep(1000);
	      
		}
	public static String attribute_name,coloumn_value;
	public static void filter_result()
	{
		
		logger8.log(Status.PASS, "Attributes present after applying filter");
		List<WebElement> results=wd.findElements(By.xpath("//div[@id='PRADatagrid']//td"));
		int count=results.size();
	     	if(count==0)
		     {
			logger8.log(Status.PASS, "No Previous Teams PRA");
		      }
		     for(WebElement result1 :results)
			
				{
			       attribute_name=result1.getText();
			        logger8.log(Status.PASS,attribute_name);
				}
	
		 
		
		
		
		 
	}
	 public static String  compare_single_result(String c,String value1,String value2,String value3)
	 {
		
		 int i=1;
		 List<WebElement>result_coloumn_values=wd.findElements(By.xpath("//div[@id='PRADatagrid']//td["+c+"]"));
		 
		 for(WebElement coloumn_val : result_coloumn_values)
		 {
			 if(i==1)
			 {
			if (!value1.equalsIgnoreCase(""))
			{
			 coloumn_value=coloumn_val.getText();
			 
			 if(coloumn_value.equalsIgnoreCase(value1))
				{
					System.out.println("Filter Result is correct"+ coloumn_value);
					
					
				}
			}
			 }
			if(i==2)
			{
			if(!value2.equalsIgnoreCase(""))
			{
				 coloumn_value=coloumn_val.getText();
				 
				 if(coloumn_value.equalsIgnoreCase(value2))
					{
					    System.out.println("Filter Result is correct"+ coloumn_value);
						
						
						
					}
			}
			}
			if(i==3)
			{
			if(!value3.equalsIgnoreCase(""))
			{
				 coloumn_value=coloumn_val.getText();
				 
				 if(coloumn_value.equalsIgnoreCase(value2))
					{
					    System.out.println("Filter Result is correct"+ coloumn_value);
						
						
					}
			}
			}
			
			i++;
		 }
		return coloumn_value;	
			
	 }
		
	

}
