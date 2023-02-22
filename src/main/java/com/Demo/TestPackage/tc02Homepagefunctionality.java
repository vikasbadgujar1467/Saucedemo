package com.Demo.TestPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Demo.POMPackage.HomepagePomclass;
import com.Demo.POMPackage.LogInPom;
import com.Demo.UtilityPackage.UtilityClass;

public class tc02Homepagefunctionality extends TestBaceClass
{ 
//HomePAge
 @Test
 public void Homepage()
 {
    		HomepagePomclass hp=new HomepagePomclass(driver);
 			hp.menubuttonclick();
			log.info("click on menu button");
			
			hp.logoutbuttonclick();
			log.info("click on logout button");
		    log.info("go on again login page");
		    log.info("aplying validation");
			 
//aplyvalidation			
			 String expectedtitle="Swag Labs";   
			 String actualtitle=driver.getTitle();
			 
			 Assert.assertEquals(actualtitle, expectedtitle);
			 /////
 }	
}
