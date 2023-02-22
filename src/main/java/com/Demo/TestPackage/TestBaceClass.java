package com.Demo.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Demo.POMPackage.LogInPom;

public class TestBaceClass 
{
	WebDriver driver;
	
	//import perfectly from org.apache.log4j
	
	Logger log =Logger.getLogger("SauceDemo1Project");
	
	// @Parameters("browserName")
		@BeforeMethod 
		   public void setup()
		//   open thise line only when performimg cross broser testing
//		  public void setup(String browserName)
		   {
			 System.setProperty("webdriver.chrome.driver","./driverBrowserFolder/chromedriver.exe");
		     	driver=new ChromeDriver();
			
//			open only when performimg cross broser testing
		/*	if(browserName.equals("chrome"))
			{
				 System.setProperty("webdriver.chrome.driver","./driverBrowserFolder/chromedriver.exe");
			
				driver=new ChromeDriver();

			}
			else
			{	
				  System.setProperty("webdriver.edge.driver","C:\\Users\\MY PC\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				 driver=new EdgeDriver();
			}	
		*/			
//		        
			

		 ///import perfectly from org.apache.log4j
			PropertyConfigurator.configure("log4j.properties");
//			
			//driver.manage().window().maximize();
			
		     driver.get("https://saucedemo.com/");
			 log.info("open browser and saucedemo website"); 
		     
			 
			  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			  LogInPom lp=new LogInPom(driver);
			 lp.usernamebox();
			 log.info("enter username");
			 
			 lp.password();
			 log.info("enter password");
			 
			 lp.clickloginbutton1();
			 log.info("click on login button");
			 log.info("open sauce home page ");
			
		}		 

	   @AfterMethod
	   public void tearDown()
		 {
	//		  driver.quit();
			  log.info("The End");
		 }		
		



}
