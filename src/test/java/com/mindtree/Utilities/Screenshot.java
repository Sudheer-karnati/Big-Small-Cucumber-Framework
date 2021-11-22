package com.mindtree.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponents.WebDriverHelper;

public class Screenshot{
	public static WebDriver driver;
	public static void getSS(String result) throws IOException
	{WebDriverHelper w=new WebDriverHelper();
		driver=w.initializedriver();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(".\\Screenshots\\"+result+".jpg"));
	}

}
