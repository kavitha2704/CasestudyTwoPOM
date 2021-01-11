package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.auomationpractice.pages.ProceedtocheckPage;
import com.selenium.implementation.seleniumimplementation;

public class ProceedtocartTest 
{
	WebDriver driver;
	ProceedtocheckPage pcpg;
	
	@BeforeTest
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver", "D://Kavitha Selenium Automation//Selenium Automation//casestudytwo//Drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	pcpg=new ProceedtocheckPage(driver);
	
	}
	
	
	@Test
	public void proceedtocheckout() throws InterruptedException
	{
		Assert.assertTrue(pcpg.proceedtocheckout(driver));
	}
	
	
	
	/*@AfterTest
	public void closebrowser()
	{
		driver.close();
	}*/
	
	
}
