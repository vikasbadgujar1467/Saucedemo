package com.Demo.UtilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	public static void getScreenshot(WebDriver driver ,String name)  throws IOException
	
	{
	   TakesScreenshot ts = (TakesScreenshot)driver;
	  File SourceFile =ts.getScreenshotAs(OutputType.FILE);
	                                                            //concatination here
	  File destinationFile= new File("E:\\Vikas\\eclipse ScrenShot\\"+name+".jpg"); 
		
	  //throws exception
	 FileHandler.copy(SourceFile, destinationFile); 
	}

	
	

}
