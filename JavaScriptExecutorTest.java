package com.selenium.testing.SeleniumTestingOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('email').value ='aamir@gmail.com'");
		js.executeScript("arguments[0].value ='aamir@gmail.com'", element);
	}

}
