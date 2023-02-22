package com.Demo.POMPackage;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomepagePomclass 
{
	private WebDriver driver;
	private Select s;
	private Actions act ;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	public void menubuttonclick()
	{
		menubutton.click();	
	}
	
	

	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbutton ;
	
	public void logoutbuttonclick()
	{
		logoutbutton.click();	
	}

	//AddToCart 
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private WebElement AddToCart;
	
	
	public void AddtocartMethod()
	{
		System.out.println("Size is"+AddToCart.getSize());
		
		for(int i=0; i<=5; i++)
		{
			AddToCart.click();
			
		}
	}
	
  //@FindBy(xpath="//select[@class='product_sort_container']");
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	  public void dropdownbutton() throws InterruptedException
	  {
		  dropdown.click();
		  s.selectByIndex(0);
		 
		 //or 
		  
	//  act.sendKeys(Keys.ENTER).perform();;
	  
	  String expectedmassage="true";
	  System.out.println(expectedmassage);
	  boolean actualresult=dropdown.isDisplayed();
	 
	 System.out.println(actualresult);
	  
	  Assert.assertEquals(actualresult, expectedmassage);
	   
	  
	  }
	//constructor
	public HomepagePomclass(WebDriver driver )
	{
	this.driver=driver;
	
	PageFactory.initElements(driver ,this);
	 act =new Actions(driver);
	s=new Select(dropdown);
	}
	
}
