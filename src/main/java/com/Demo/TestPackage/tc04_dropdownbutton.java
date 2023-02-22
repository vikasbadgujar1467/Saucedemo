package com.Demo.TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Demo.POMPackage.HomepagePomclass;
import com.Demo.POMPackage.LogInPom;

public class tc04_dropdownbutton extends TestBaceClass
{
	
	   @Test
	   public void DropDown() throws InterruptedException
	   {
		 HomepagePomclass hpc=new HomepagePomclass(driver);
		 hpc.dropdownbutton();
		 log.info("select any dropdown element");

	   } 

	

		 

}
