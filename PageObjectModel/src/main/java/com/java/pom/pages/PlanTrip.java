package com.java.pom.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PlanTrip {
	
  private static OpenUrl open;
  
  private static WebDriver wDriver;
	public static void main(String[] args) throws InterruptedException {
		
		closeNotice();
		
	}

    @Test
	public static void closeNotice() {
		wDriver = open.driver();
		
	}
	
    
}
