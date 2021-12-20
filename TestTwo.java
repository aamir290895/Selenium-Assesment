package com.selenium.testing.SeleniumTestingOne;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwo {
	@Test
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://adept-stage-306721.web.app/");
		driver.manage().window().maximize();
		
		
		
		
	}

}
