package com.selenium.implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumimplementation 
{
Actions action;
public static WebDriver driver;
public void mousehover(WebElement element,WebDriver driver)
{
	action=new Actions(driver);
	action.moveToElement(element).build().perform();
	
}

public void click(WebElement element)
{
	element.click();
}

/*public void closebutton(WebElement element)
{
	element.click();
	
}*/

public void clickusingjava(WebElement element,WebDriver driver) 
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
}

public void continueshop(WebElement element) 
{
	element.click();
}

public void clickoncheckout(WebElement element,WebDriver driver)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
}

public void refresh(WebDriver driver)
{
	driver.navigate().refresh();
}

public void sechtxt(String productname)
{
WebElement element=driver.findElement(By.id("search_query_top"));
element.sendKeys(productname);
}

public void selectfromdropdown(WebElement statetext,String text)
{
	Select sel=new Select(statetext);
	sel.selectByVisibleText(text);
	
	
}

public void entertextusingjava(WebElement element,WebDriver driver,String text) 
{
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='text'", element,text);
}

public void entertext(WebDriver driver,WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('element').value='Pinky'");
}

}
