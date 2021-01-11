package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.auomationpractice.pages.AddtoCartPage;
import com.auomationpractice.pages.SearchPage;
import com.auomationpractice.pages.SearchResultsPage;

public class SearchPageTest 
{
	
	WebDriver driver;
	
	SearchPage sp;
	
	@BeforeTest
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "D://Kavitha Selenium Automation//Selenium Automation//casestudytwo//Drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	sp=new SearchPage(driver);
	

	}
	
	@Test
	public void searchbytxtin()
	{
		
		sp.setsearch();
		
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
