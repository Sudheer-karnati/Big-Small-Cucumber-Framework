package com.mindtree.ReusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {
	public static WebDriver driver;
	public static Properties prop;
	
	public WebDriver initializedriver() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\testdata\\confg.properties");
	    prop.load(fis);
	    String browserName=prop.getProperty("browser");
	    if(browserName.equalsIgnoreCase("chrome"))
	    { 
	    	System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
			
	    	driver=new ChromeDriver();
			
	    }
	    
	    else if(browserName.equalsIgnoreCase("firefox"))
	    {
	    	System.setProperty("webdriver.gecko.driver",".\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
	    }
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}

}
