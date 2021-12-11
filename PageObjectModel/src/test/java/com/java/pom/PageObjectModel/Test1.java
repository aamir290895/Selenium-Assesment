package com.java.pom.PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.java.pom.pages.OpenUrl;

public class Test1 {
	
	  private static OpenUrl open;
	  
	  private static WebDriver wDriver;
	
	@Test
	void planTrip() {
		wDriver=open.driver();
	    wDriver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport' ])[1]")).sendKeys("Jabalpur");
	    
		
		
	}

}
