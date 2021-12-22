package com.java.pom.PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Test1 {
	
	  
	  private static WebDriver wDriver;
	
	@Test
	void planTrip() {
	    wDriver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport' ])[1]")).sendKeys("Jabalpur");
	    
		
		
	}

}
