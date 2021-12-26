package com.java.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
   private static WebDriver driver;
    
    public static WebDriver startDriver(String url ) {
		WebDriverManager.chromedriver().setup();

    	driver=  new ChromeDriver();
    	driver.get(url);
    	
    	
    	return driver;
    }

}
