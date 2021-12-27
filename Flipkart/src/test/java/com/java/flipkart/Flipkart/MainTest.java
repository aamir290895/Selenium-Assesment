package com.java.flipkart.Flipkart;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {
	WebDriver driver; 
	
	@BeforeClass
	void startDriver() {
	driver =DriverFactory.startDriver("https://www.flipkart.com");	
	}
	
	
	@Test
	void searchProduct() {
	Base flipkart = PageFactory.initElements(driver, Base.class);
	flipkart.selectSearchElement("mobiles");
	flipkart.select.click();
	
		
	}
 
	@AfterClass
	void closeDriver() {
		
	driver.close();	
		
	}
}
