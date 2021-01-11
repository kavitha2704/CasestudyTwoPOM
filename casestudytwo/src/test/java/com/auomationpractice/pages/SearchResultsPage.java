package com.auomationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.implementation.seleniumimplementation;

public class SearchResultsPage extends seleniumimplementation
{
 
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-container']//div[@class='left-block']//div[@class='product-image-container']/child::a[@title='Printed Summer Dress']")
	WebElement imge1;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocarts1;
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']//div[@class='product-container']//div[@class='left-block']//div[@class='product-image-container']//a[@title='Printed Dress']")
	WebElement imge2;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocarts2;
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line']")
	WebElement imge3;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocarts3;
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line last-item-of-tablet-line first-item-of-mobile-line last-mobile-line']")
	WebElement imge4;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocarts4;
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line first-item-of-tablet-line last-mobile-line']")
	WebElement imge5;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocarts5;
	
	@FindBy(xpath="//*[@id=\"columns\"]/div[1]/a/i")
	WebElement homemenu;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement checkouts;
	
	
	seleniumimplementation simp=new seleniumimplementation();
	
	
	public SearchResultsPage(WebDriver driver)
	{
		seleniumimplementation.driver=driver;
	 PageFactory.initElements(driver, this);
	}
	 
	public boolean searchandaddtocart(WebDriver driver)
	{
		SearchPage spn=new SearchPage(driver);
		spn.setsearch();
		simp.mousehover(imge1, driver);
		simp.click(addtocarts1);
		
		simp.clickoncheckout(checkouts, driver);
		
		spn.setsearch();
		simp.mousehover(imge2, driver);
		simp.click(addtocarts2);
		
		simp.clickoncheckout(checkouts, driver);
		
		spn.setsearch();
		simp.mousehover(imge3, driver);
		
       simp.click(addtocarts3);
		
		simp.clickoncheckout(checkouts, driver);
		
		spn.setsearch();
		simp.mousehover(imge4, driver);
		
        simp.click(addtocarts4);
		
		simp.clickoncheckout(checkouts, driver);
		
		spn.setsearch();
		simp.mousehover(imge5, driver);
		
        simp.click(addtocarts5);
		
		simp.clickoncheckout(checkouts, driver);
		
		
		
		return true;
		
		
	
	}
}
