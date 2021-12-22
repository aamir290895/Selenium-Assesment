package com.java.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlanTrip {

    private static Base base;
    private static WebDriver driver = null;

	@Test
	public static void closeNotice(WebDriver driver) throws InterruptedException {
		base.driver();
		base.trip();
		base.findSource(driver);
		Thread.sleep(1000);
		
		
	}
	
	
	public static void main(String[] args) {
		driver = base.driver();
//		
     
		base.trip();
		
	}
}
