package com.automationpractice.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.auomationpractice.pages.AddtoCartPage;

public class AddtoCartTest 
{
WebDriver driver;
AddtoCartPage page;
@BeforeTest
public void setup()
{
System.setProperty("webdriver.chrome.driver", "D://Kavitha Selenium Automation//Selenium Automation//casestudytwo//Drivers//chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
page=new AddtoCartPage(driver);

}

@Test
public void addtocartitems()
{
	Assert.assertTrue(page.addtocartitem(driver));
	
}

@AfterTest
public void closebrowser()
{
	driver.close();
}

	
}
