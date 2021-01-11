package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.auomationpractice.pages.SearchResultsPage;

public class SearchResultsTest 
{

	WebDriver driver;
	SearchResultsPage srp;
	@BeforeTest
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "D://Kavitha Selenium Automation//Selenium Automation//casestudytwo//Drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	srp=new SearchResultsPage(driver);
	
	}
	
	@Test
	public void searchandadd()
	{
		Assert.assertTrue(srp.searchandaddtocart(driver));
		driver.close();
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
}
