package com.java.pom.PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.java.pom.pages.Base;
import com.java.pom.pages.DriverFactory;


public class Test1 {
	
	  
	 private static WebDriver wDriver;
	
	@Test
	void login() {
	    
		wDriver= DriverFactory.startDriver("https://www.facebook.com");
		Base login = PageFactory.initElements(wDriver, Base.class);
		login.inputEmail("aamir");
		login.inputPassword("gggg");
		login.login();
		wDriver.quit();
		
	}

}
