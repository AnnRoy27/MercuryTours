package com.qa.test;

import org.testng.annotations.Test;

import com.qa.constants.Constant;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
	
 WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(Constant.appUrl);
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  //driver.quit();
  }

}
