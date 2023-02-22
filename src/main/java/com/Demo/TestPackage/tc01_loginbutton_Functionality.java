package com.Demo.TestPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Demo.POMPackage.LogInPom;
import com.Demo.UtilityPackage.UtilityClass;

public class tc01_loginbutton_Functionality extends TestBaceClass
{

	
	            //aplying validation      //give Space for thise Swag Labs
   @Test
   public void Verifylogin()
    {
	        String expectedtitle="Swag Labs";   
			 String actualtitle=driver.getTitle();
			 Assert.assertEquals(actualtitle, expectedtitle);
	} 
  
   
   

		
}