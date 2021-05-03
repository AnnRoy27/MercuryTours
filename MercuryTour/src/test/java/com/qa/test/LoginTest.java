package com.qa.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.constants.Constant;
import com.qa.page.LoginPage;
import com.qa.utility.ExcelRead;



public class LoginTest extends BaseTest {
	 @Test(dataProvider = "loginData")
	public void verifyLogin(String username ,String password) {
			driver.get(Constant.appUrl);
		LoginPage lp=new LoginPage(driver);
		lp.doLogin(username,password);
	    Assert.assertEquals(driver.getTitle(), Constant.homeTitle);


	}
	
	@DataProvider
	  public Object[][]loginData() throws InvalidFormatException, IOException {
		  
		  Object[][] data =ExcelRead.getDataFromExcel("D:\\Data\\MercuryLoginData.xlsx", "Logindata");
	    return  data ;
	  }
	
	
}
