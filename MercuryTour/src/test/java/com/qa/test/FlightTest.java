package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constants.Constant;
import com.qa.page.FlightPage;
import com.qa.page.LoginPage;

public class FlightTest extends BaseTest {
	
	
	@Test(priority=1)
	public void login()
	
	{
		LoginPage lp=new LoginPage(driver);
		lp.doLogin("tutorial","tutorial");
	    Assert.assertEquals(driver.getTitle(), Constant.homeTitle);
	}
  @Test(priority=2)
  public void verifyFlightBook() {
	  
	  
	  FlightPage fp=new FlightPage(driver);
	  fp.doBookFlight();
  }
}
