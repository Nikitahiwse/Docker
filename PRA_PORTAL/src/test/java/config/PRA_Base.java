package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PRA_Base 
{
	    static Properties prop;
	    static Properties prop2;
	    public static WebDriver wd;
	    public static File folder;
	    //to load data from property file
		public static void load_property_file() throws IOException
		{
	     prop=new Properties();
	     
	     try {
		InputStream input=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		
		InputStream input2=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\mycabi.properties");
		prop.load(input2);
		
		InputStream input4=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\By_pest.properties");
		prop.load(input4);
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
		   
		folder=new File(UUID.randomUUID().toString());
		folder.mkdir();
		 
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		//for chrome
		ChromeOptions option=new ChromeOptions();
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		option.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, option);
		
		
		wd=new ChromeDriver(cap);
		wd.get(URL);
		Thread.sleep(8000);
		wd.manage().window().maximize();
	    }
	    //to close browser
	   public void teardown()
	    {
		
		wd.close();
		for(File file:folder.listFiles())
		{
			file.delete();
		}
		folder.delete();
		}
}
