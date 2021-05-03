package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.utility.Elementutil;

public class LoginPage {
	
	WebDriver driver;
	Elementutil eleutil;
	
	
	@FindBy(name="userName")
	private WebElement usernamefld;
	
	@FindBy(how=How.NAME,using ="password")
	private WebElement passwordfld;
	
	@FindBy(how=How.NAME,using ="submit")
	private WebElement submitbtn;
	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		eleutil=new Elementutil(driver);
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void doLogin(String username ,String password)
	
	{   
		eleutil.doSendkey(usernamefld, username);
		eleutil.doSendkey(passwordfld, password);
		eleutil.doClick(submitbtn);
		
		
	}
	
	
	

}
