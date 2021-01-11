 package com.auomationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.implementation.seleniumimplementation;

public class AddtoCartPage extends seleniumimplementation
{
 @FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-container']/child::div[@class='left-block']/child::div[@class='product-image-container']/child::a[@title='Faded Short Sleeve T-shirts']")
 WebElement img1;
 
 @FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
 WebElement addtocartbutton1;
 
 @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
 WebElement checkout;
 

 
 @FindBy(xpath="//div[@class='breadcrumb clearfix']//a[@class='home']//i[@class='icon-home']")
 WebElement homepage;
 
 @FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//div[@class='product-image-container']/child::a[@title='Blouse']")
 WebElement img2;
 
 @FindBy(xpath="//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span")
 WebElement addtocartbutton2;
 
 
@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-container']//div[@class='left-block']//div[@class='product-image-container']/child::a[@title='Printed Dress']")
WebElement img3;

@FindBy(xpath="//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span")
WebElement addtocart3;

@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-in-line first-item-of-tablet-line last-item-of-mobile-line']//div[@class='product-container']//div[@class='left-block']//div[@class='product-image-container']/child::a[@title='Printed Dress']")
WebElement img4;

@FindBy(xpath="//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]/span")
WebElement addtocart4;

@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line last-line first-item-of-mobile-line']//div[@class='product-container']//div[@class='left-block']//div[@class='product-image-container']//a[@title='Printed Summer Dress']")
WebElement img5;

@FindBy(xpath="//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]/span")
WebElement addtocart5;

@FindBy(xpath="//*[@id=\"homefeatured\"]/li[6]/div/div[1]/div/a[1]/img")
WebElement img6;

@FindBy(xpath="//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[2]/a[1]/span")
WebElement addtocart6;


 seleniumimplementation imple;

 
seleniumimplementation se=new seleniumimplementation();
 public AddtoCartPage(WebDriver driver)
 {
	 seleniumimplementation.driver=driver;
	 PageFactory.initElements(driver, this);
	 
 }
 public boolean addtocartitem(WebDriver driver)
 {
	 se.mousehover(img1, driver);
	 
	 se.click(addtocartbutton1);
	 se.clickoncheckout(checkout,driver);
	 se.click(homepage);
	 //se.continueshop(contshop);
	 
	 se.mousehover(img2, driver);
	 se.click(addtocartbutton2);
	 se.clickoncheckout(checkout,driver);
	 se.click(homepage);
	 
	 se.mousehover(img3, driver);
	 se.click(addtocart3);
	 se.clickoncheckout(checkout,driver);
	 se.click(homepage);
	 
	 se.mousehover(img4, driver);
	 se.click(addtocart4);
	 se.clickoncheckout(checkout,driver);
	 se.click(homepage);
	 
	 se.mousehover(img5, driver);
	 se.click(addtocart5);
	 se.clickoncheckout(checkout,driver);
	 se.click(homepage);
	 
	 se.mousehover(img6, driver);
	 se.click(addtocart6);
	 se.clickoncheckout(checkout,driver);
	 se.click(homepage);
	  
	 //se.continueshop(contshop);
	 
	 return true;
	 
	 
 }
 

}

