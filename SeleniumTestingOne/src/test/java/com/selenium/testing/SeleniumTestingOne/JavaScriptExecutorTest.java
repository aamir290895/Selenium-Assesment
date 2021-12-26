package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		startDriver();
		javascriptExecute();
		
	}
	
	@BeforeMethod
	public static void startDriver() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public static void javascriptExecute() {
		
		WebElement element = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value ='aamir@gmail.com'");
//		js.executeScript("arguments[0].value ='aamir@gmail.com'", element);
	}

}
