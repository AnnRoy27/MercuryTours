package com.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constants.Constant;

public class Elementutil {
	WebDriver driver;
	
	public Elementutil(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void doSendkey(WebElement element ,String value)
	{
		element.clear();
		element.sendKeys(value);
	}
	public void doClick(WebElement element)
	{
		element.click();
	}
	
	public void selectDropdownByValue(WebElement element ,String value)
	{
		Select dropdown=new Select(element);
	    dropdown.selectByValue(value);
	}
	public void selectDropdownByText(WebElement element ,String text)
	{
		Select dropdown=new Select(element);
	    dropdown.selectByVisibleText(text);
	}
	//
	
	public void waitforPageTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,Constant.timeout);
		wait.until(ExpectedConditions.titleIs(title));
		
	}
	
	

}
