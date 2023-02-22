package com.Demo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Demo.POMPackage.HomepagePomclass;
import com.Demo.POMPackage.LogInPom;

public class tc03AddToCart extends TestBaceClass
{
        //Addto cart
	@Test
	public void AddToCartMethod()
	{
       HomepagePomclass atcp= new HomepagePomclass(driver);
		 atcp.AddtocartMethod();
				 
		  log.info("adding elemnt to cart ");
//validatio		 
		 String expectedresult="6";
		 String actualresult=driver.getTitle();
		
		// Assert.assertEquals(actualresult, expectedresult);
		 
		  if(expectedresult.equals(actualresult))
		 {
			 log.info("test case is pass");
		 } 
		 else
		 {
			 log.info("test case is fail");
		 }
		 
		
		
	}


	
}
