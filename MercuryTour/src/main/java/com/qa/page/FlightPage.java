package com.qa.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utility.Elementutil;

public class FlightPage {

	
	WebDriver driver;
	Elementutil eleutil;
	public FlightPage(WebDriver driver)
	{
		this.driver=driver;
		eleutil=new Elementutil(driver);
	}
	
	
	public void doBookFlight()
	
	{   
		WebElement flightlink=driver.findElement(By.partialLinkText("Flights"));
	    eleutil.doClick(flightlink);
		//handle radio button
		List<WebElement> triptyperadio=driver.findElements(By.name("tripType"));
		triptyperadio.get(1).click();
		WebElement fromportdropdown=driver.findElement(By.xpath("//select[@name='fromPort']"));
		eleutil.selectDropdownByValue(fromportdropdown, "Sydney");
		WebElement fromMonth=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		eleutil.selectDropdownByValue(fromMonth, "3");
	}
	
	
}
