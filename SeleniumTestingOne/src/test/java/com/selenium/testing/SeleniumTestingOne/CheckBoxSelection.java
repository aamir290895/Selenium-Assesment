package com.selenium.testing.SeleniumTestingOne;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxSelection {
	
	private static WebDriver driver;
	
	@BeforeMethod
	public static void startDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.get("https://mycab-202b5.web.app/");		
		
		
	}
	
	
	@Test
	public static void selectCheckBox() throws InterruptedException {
		
	
		WebElement element = driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
		element.click();
		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public static void closeDriver() {
		
	    driver.close();

	}

}
