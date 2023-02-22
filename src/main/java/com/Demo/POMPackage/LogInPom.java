package com.Demo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPom 
{
	WebDriver driver;
	
				
	@FindBy(xpath ="//input[@id='user-name']")
     WebElement username;
	
	public void usernamebox()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	 WebElement password ;
	
	public void password()
	{
	    password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	
	WebElement loginbutton1;
	
	public void clickloginbutton1()
	{
		loginbutton1.click();
	}
	
	public LogInPom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this );
		
	}
	
	

}
