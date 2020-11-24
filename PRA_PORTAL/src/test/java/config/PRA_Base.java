package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRA_Base 
{
	    static Properties prop;
	    static Properties prop2;
	    public static WebDriver wd;
	    //to load data from property file
		public static void load_property_file() throws IOException
		{
	     prop=new Properties();
	     
	     try {
		InputStream input=new FileInputStream("E:\\CABI_NEW\\PRA_PORTAL\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		
		InputStream input2=new FileInputStream("E:\\CABI_NEW\\PRA_PORTAL\\src\\test\\java\\config\\mycabi.properties");
		prop.load(input2);
		
		InputStream input3=new FileInputStream("E:\\CABI_NEW\\PRA_PORTAL\\src\\test\\java\\config\\ByPathway_Generation.properties");
		prop.load(input3);
		
		
	  
	     } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	     }
		}
		
		//to get data from config property file
		public static String getobject(String Data) throws IOException
		{
			load_property_file();
			String data= prop.getProperty(Data);
			return data;
		}
		/*
		 * //to load data from mycabi property file public static String
		 * getobject_for_mycabi(String Data2) throws IOException { load_property_file();
		 * String data2=prop2.getProperty(Data2); return data2; }
		 */

        //for browser opening 
	   public void initialzation(String URL) throws InterruptedException
	   {
		System.setProperty("webdriver.chrome.driver", "E:\\CABI_NEW\\PRA_PORTAL\\Driver\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.get(URL);
		Thread.sleep(8000);
		wd.manage().window().maximize();
	    }
	    //to close browser
	   public void teardown()
	    {
		
		wd.quit();
		}
}
