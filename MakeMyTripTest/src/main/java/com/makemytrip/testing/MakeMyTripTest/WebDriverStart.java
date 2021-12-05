package com.makemytrip.testing.MakeMyTripTest;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverStart {
	
	
	public void readyDriver() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
	}
	
	

}
