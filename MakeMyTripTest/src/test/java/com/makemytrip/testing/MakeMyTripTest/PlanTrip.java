package com.makemytrip.testing.MakeMyTripTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlanTrip {
	
  WebDriver driver;	
  
  @BeforeMethod
  void startDriver() {
  
	  driver = DriverFactory.startDriver("https://www.makemytrip.com");
  
  }
  
  @Test
  void planTrip() throws InterruptedException {

	  BasePage page = PageFactory.initElements(driver, BasePage.class);
	  page.popupClose();
	  page.selectSource("jabalpur");
	  page.selectDestination("pune");
	  page.selectDate();
	  page.search();
	  
	  
  }
	
  
  @AfterMethod
  void closeDriver() {
	  
	  driver.close();
  }

}
