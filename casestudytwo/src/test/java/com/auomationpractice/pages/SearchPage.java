package com.auomationpractice.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.selenium.implementation.seleniumimplementation;

public class SearchPage extends seleniumimplementation
{
	@FindBy(xpath="//input[@class='search_query form-control ac_input']")
	WebElement schfield;
	
	@FindBy(name="submit_search")
	WebElement subtn;
	
	
	
	
	
	seleniumimplementation si=new seleniumimplementation();
	
	
	public SearchPage(WebDriver driver)
	{
		seleniumimplementation.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 
	}
	
	/*public void schbytxt(String productname)
	{
	  
	se.sechtxt(productname);
	}*/
	
	
	
	
	public SearchResultsPage setsearch()
	{
		schfield.sendKeys("Printed");
        subtn.click();
        return new SearchResultsPage(driver);
	}
	
}
