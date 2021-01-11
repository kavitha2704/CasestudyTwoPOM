package com.auomationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.implementation.seleniumimplementation;

public class ProceedtocheckPage extends seleniumimplementation
{
	
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-container']//div[@class='left-block']//div[@class='product-image-container']//a[@title='Faded Short Sleeve T-shirts']")
	 WebElement imgage1;
	 
	 @FindBy(xpath="//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span")
	 WebElement cart1;
	 
	 @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	 WebElement checkoutnew1;
	 
    @FindBy(xpath="//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
    WebElement lastproceed;
	 
	 @FindBy(xpath="//div[@class='breadcrumb clearfix']//a[@class='home']//i[@class='icon-home']")
	 WebElement homepagenew;
	 
 
      @FindBy(xpath="//input[@id='email_create']")
      WebElement email;
 
     @FindBy(xpath="//button[@id='SubmitCreate']")
     WebElement createaccount;
 
    @FindBy(xpath="//input[@type='radio' and @id='id_gender1']")
    WebElement radio;
    
    @FindBy(xpath="//input[@class='is_required validate form-control' and @id='customer_firstname']")
    WebElement firstname;
    
    @FindBy(xpath="//input[@id='customer_lastname']")
    WebElement lastname;
    
    @FindBy(xpath="//input[@id='passwd']")
    WebElement passowrd;
    
    @FindBy(xpath="//input[@id='firstname']")
    WebElement firstname1;
    
    @FindBy(xpath="//input[@id='lastname']")
    WebElement lastname1;
    
    @FindBy(xpath="//input[@id='address1']")
    WebElement address1;
    
    @FindBy(xpath="//input[@id='city']")
    WebElement city;
    
    @FindBy(xpath="//select[@id='id_state']")
    WebElement stateselect;
    
    @FindBy(xpath="//input[@id='postcode']")
    WebElement pincode;
    
    @FindBy(xpath="//select[@id='id_country']")
    WebElement countryselect;
    
    @FindBy(xpath="//input[@id='phone_mobile']")
    WebElement mobile;
    
    @FindBy(xpath="//input[@id='alias']")
    WebElement addressn;
    
    @FindBy(xpath="//button[@id='submitAccount']")
    WebElement register;
    
    
    
    
    AddtoCartPage acp=new AddtoCartPage(driver);

   seleniumimplementation seimp=new seleniumimplementation();


   public ProceedtocheckPage(WebDriver driver)
   {
	seleniumimplementation.driver=driver;
	 PageFactory.initElements(driver, this);
   }
 
   public boolean proceedtocheckout(WebDriver driver) throws InterruptedException
     {
	
	seimp.mousehover(imgage1, driver);
	seimp.click(cart1);
	Thread.sleep(2000);
	seimp.clickoncheckout(checkoutnew1, driver);
	
	seimp.clickoncheckout(lastproceed, driver);
	email.sendKeys("testabcnew123@gmail.com");
	seimp.click(createaccount);
	//seimp.click(radio);
	//seimp.entertextusingjava(firstname, driver, "pinky");
	//seimp.entertextusingjava(lastname, driver, "ponky");
	
	
	seimp.entertextusingjava(f, driver, "pinky");
	
	passowrd.sendKeys("pinky@1234Q");
	firstname1.sendKeys("pinky");
	lastname1.sendKeys("ponky");
	
	address1.sendKeys("TEstnew");
	
	city.sendKeys("maine");
	
	seimp.selectfromdropdown(stateselect, "Maine");
	pincode.sendKeys("000045");
	seimp.selectfromdropdown(countryselect, "United States");
	mobile.sendKeys("8050760746");
	addressn.sendKeys("testnew");
	seimp.click(register);
	
	
	return true;
	
  }
}
